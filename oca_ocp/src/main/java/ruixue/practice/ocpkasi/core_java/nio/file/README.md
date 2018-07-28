## `java.nio.file.Path`
The essence of `Path`:
* `Path` is an `interface` because
	* creating a file or directory is considered a file system-dependent task in NIO.2 
* Its implementations are *immutable*
* it is an "abstract" primary entry point for working with NIO.2 API
* most methods of `Path` interface but **not all** are sometimes called *syntactic operations* in that they operate on the `Path` itself but don't access to the *file system*
	* the *path* of `Path` object might not exist physically, invoking mehtods of `Path` can still work
	* the actual operations on *file system* can be executed with those *static methods* on *utility class* `java.nio.file.Files`
	* methods of `Path`, which is not *syntactic operation* - `public Path toRealPath(LinkOption... options) throws IOException`
* Unlike `java.io.File` class, `Path` contains support for *symbolic links*

### *Syntactic Operations*
#### `Path relativize(Path p)`
`p0.relativize(p1)` can be explained as: **starting from `p0`, how to rich `p1`**

##### `Path relativize(Path p)` throws a *runtime* `IllegalArgumentException`
As the word *relativize* indicate literally, the base `Path` object and the given `Path` p has to be of the same type, say either both *absolute* or *relative*, otherwise a *runtime* `IllegelArgumentException` would be thrown. Refer to the source code [sun.nio.fs.UnixPath.relativize()](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/7-b147/sun/nio/fs/UnixPath.java#UnixPath.relativize%28java.nio.file.Path%29), where there is:
```
if (this.isAbsolute() != other.isAbsolute())
  throw new IllegalArgumentException("'other' is different type of Path")
```
#### Operations to Get a `Path` Component

* `getRoot()`
* `getParent()`
* `getFileName()`

Their return values have 2 common features among these three methods:
* return type is `Path`
* return `null` to indicate no such componenet in the given `Path` object



### `Path toRealPath(LinkOption... options)` - The Only Non-syntactic, **real**, Operation that `throws IOException`
`Path toRealPath(LinkOption... options)` is the only concrete operation on a `Path` *object*. There are the following key point on this method:
* `toRealPath` **follows symbolic link** by default
  * In order not to follow link, it should be called with `LinkOption.NOFOLLOW_LINKS` as *argument*, i.e. `toRealPath(LinkOption.NOFOLLOW_LINKS)`
* `toRealPath` only works on existing file => if the given `Path` does not exist in the file system, `IOException` will be thrown instead of `FileNotFoundException`

## `java.nio.file.Files`
### File Operations: Counterparts of Linux Shell Commands
Shell Command | `static` utility methods on `Files`
--------------|-------------------------------------------------------------------------------------------------
`cp`          |<ul><li>`long copy(Path source, Path target, CopyOption... options)`</li><li>`long copy(InputStream source, Path target, CopyOption... options)`</li><li>`long copy(Path source, OutputStream target, CopyOption... options)`</li></ul>
`cp `
`mv`          |`Path move(Path source, Path target, CopyOption... options)`

#### `copy` method VS `cp`
Cases 		 |`cp`	|`copy`
-----------------|------|----------------------------
target file exits|OK	|`FileAlreadyExistsException`


### `<A extends BasicFileAttributes> readAttributes(Path path, Class<A> type, LinkOption... options)` 
The corresponding Linux Shell command of this method is `stat` 

#### Reading a Single Attribute of a File - `isRegularFile()`,`isDirectory()`,`isSymbolicLink()`
This section is under the section `<A extends BasicFileAttributes> readAttributes(Path path, Class<A> type, LinkOption... options)` due to the fact that **these methods are implemented by calling `readAttributes`**. However, these methods for reading a single attribute differ from the original `readAttributes` in that: 

* They are test operations **returning `boolean`** 
* **They don't throw IOException** because the `IOException` thrown by `readAttributes` are swallowed, in which case the function will return `false`

```
public static boolean isSymbolicLink(Path path) {
        try {
            return readAttributes(path,
                                  BasicFileAttributes.class,
                                  LinkOption.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException ioe) {
            return false;
        }
    }
```

All the methods starting with `create` returns a `Path`:

### Walking a Directory
#### Avoiding *cycle* - Circular Paths
Unlike out earlier NIO.2 methods, **the `walk()` method will not traverse symbolic links by default.** In the source code, the traversal is implemented with [`FileTreeWalker`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/nio/file/FileTreeWalker.java#FileTreeWalker.%3Cinit%3E%28java.util.Collection%2Cint%29), from whose constructor, we can see that the symbolic link is not followed by default.  

## *Legecy I/O* VS *NIO.2*
* Neither API provides a single method to delete a directory tree<sup>OCA/OCP Java SE 8 Programmer Practice Tests > Chapter 19 > 16.</sup>
