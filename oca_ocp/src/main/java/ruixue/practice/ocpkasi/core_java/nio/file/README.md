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

### `Path relativize(Path p)`
`p1.relativize(p2)` can be explained as: **starting from `p1`, how to get to `p2`**

#### `Path relativize(Path p)` throws a *runtime* `IllegalArgumentException`
As the word *relativize* indicate literally, the base `Path` object and the given `Path` p has to be of the same type, say either both *absolute* or *relative*, otherwise a *runtime* `IllegelArgumentException` would be thrown. Refer to the source code [sun.nio.fs.UnixPath.relativize()](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/7-b147/sun/nio/fs/UnixPath.java#UnixPath.relativize%28java.nio.file.Path%29), where there is:
```
if (this.isAbsolute() != other.isAbsolute())
  throw new IllegalArgumentException("'other' is different type of Path")
```



## `java.nio.file.Files`
All the methods starting with `create` returns a `Path`:

### Walking a Directory
#### Avoiding *cycle* - Circular Paths
Unlike out earlier NIO.2 methods, **the `walk()` method will not traverse symbolic links by default.** In the source code, the traversal is implemented with [`FileTreeWalker`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/nio/file/FileTreeWalker.java#FileTreeWalker.%3Cinit%3E%28java.util.Collection%2Cint%29), from whose constructor, we can see that the symbolic link is not followed by default.  

## *Legecy I/O* VS *NIO.2*
* Neither API provides a single method to delete a directory tree<sup>OCA/OCP Java SE 8 Programmer Practice Tests > Chapter 19 > 16.</sup>
