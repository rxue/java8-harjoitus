# Exam Essentials
## *Inner Class*
### Synthetic Comparison on *Anonymous Inner Class* and *Lambda Expression*
*Anonymous inner class* and *lambda expresson* are similar in that as to the accessibility of *local variable*, both do not have access unless those variables are *final* or *effectively final*.

## *Functional Interface*
None of the *built-in* *functional interfaces* in *Java 8* allows for *checked exception* to be thrown

## *Exceptions* and *Assertions* 
## *IO*
### Legacy *IO*
#### Naming Conventions in Legacy *IO*
Among the methods in `java.io.File`, most methods returning `File` or array of `File` objects are suffixed with `File` or `Files`. 

### Legacy *IO* VS *NIO.2*
#### Many Methods Return `boolean` to Indicate Success/Failure in Legacy *IO*
The **`delete`** method in `java.io.File` returns **`false`** to indicate the **failure of deletion without any information about what went wrong**. Wheresas in *NIO.2*, the `delete` method in `Files` would throw more specific exception such as `NoSuchFileException` in case of deleting nonexistent file.

The **`mkdir` and `mkdirs`** methods in `java.io.File` returns **`false`** to indicate the **failure of directory creation without any information about what went wrong**. Whereas in *NIO.2*, the `createDirectory` and `createdDirectories` methods in `java.nio.file.Files` would throw more specification exception such as `FileAlreadyExistsException` in case of creating a directory whose name already exists in the file system. 

### *NIO.2* 
#### *Path*
There is only one method, which `return` a `String`, on *Path*, i.e. the `toString()`

## Concurrency
### Terminologies 
#### *Scaling*
*Scaling* is a property when we add more resources such as CPUs, the performance results gradually improve

#### [*Mutual Exclusion*](https://www.youtube.com/watch?v=n0Zbtt4C1XU&t=84s) - Solution of *Race Condition*
The enforcement of *Mutual exclusion* creates two additional control problems:
* *dead lock*
* [*Resource Starvation*](https://www.youtube.com/watch?v=2klwq4GeVtw&t=460s)
  * [*Livelock*](https://www.youtube.com/watch?v=v4Tp8dxGA2U&t=155s) is a situation in which **two or more processes continuously** change their states in response to changes in other processes without doing any useful work. **Livelock is a special case of resource starvation** in that the set of processes or threads are *starved* due to the *livelock*, and thus never get the *resources* they intend to get

<sup>Operating Systems: Internal and Design Principles > Chapter 5 Concurrency > 5.1 Principle of Concurrency > Competition among processors for Resources</sup>

As the aforementioned *resource starvation* could happen only when *mutual exclusion* holds, which avoids *race condition*. Therefore, **it makes no sense to relate resource starvation to race condition. For instance, the OCP exam question might trap you by asking whether "Resource starvation is a special case of race condition". The answer is obviously NOT!** 

### `Runnable` and `Callable<V>`
* `Callable` is similar with `Runnable` in that both are *functional interface* and the method to be implemented does not contain any inputer parameter
* `Callable` differs from `Runnable` by its `generic` return type `V` and the declaration of `Exception` in the `call()` method 

### *Intrinsic Lock*
> `static synchronized` methods used the `Class` object for the lock <sup>Java Concurrency in Practice</sup>

### `ExecutorService` Framework
#### `ExecutorService` has to call `shutdown()` to be shut down explicitly

#### [`Future<V>`](https://www.youtube.com/watch?v=2NAlvSkK9-k&t=760s)
##### `Future<?>` as the Return Type Will Return `null`
> [If you would like to use a `Future` for the sake of cancellability but not provide a usable result, you can declare types of the form `Future<?>` and return `null` as the result of the underlying tasks.](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)

### *Blocking* methods always *declare* the checked `InterruptedException`

### Parallel Stream
#### Reduction Operations
##### *Reduce* Methods
###### `reduce` - *Reduce* with *Immutable Identity*
There are three overloaded `reduce methods`:
* `U reduce(U identity, BinaryFunction<U, ? super T, U> accumulator BinaryOperator<U> combiner)`
* `T reduce(T identity, BinaryOperator<T> accumulator)`
* `Optional<T> reduce(BinaryOperator<T> accumulator)`

###### *Reduce* with *Mutable Identity* - `collect`

## IO
### `InputStream`/`OutputStream`
#### *Serialization*/*Deserialization* with `ObjectInputStream`/`ObjectOutputStream`
> If you are using the default *serialized* form and you have labeled one or more fields `transient`, remember that these fields will be initialized to their *default values* when an instance is *deserialized*: `null` for object reference fields, zero for numeric *primitive* fields and `false` for `boolean` fields. <sup>Effective Java > Chapter 12 Serialization</sup> 

## NIO.2
### `Path`
There is only one method in `Path`, which returns `String`, i.e. `toString()`
### *Static factory methods* in `Files`
#### Test methods
There are only two methods declaring `IOException` among all the test methods within the spectrum of exam:
* `isHidden(Path path)`
* `isSameFile(Path path1, Path path2)`
#### `copy` - Copy Files
There are overloaded `copy` methods:
* `long copy(Path source, Path target CopyOption... options) throws IOException`
* `long copy(InputStream source, Path target CopyOption... options) throws IOException`
* `long copy(Path source, OutputStream target) throws IOException`
#### Traversal of A Directory
##### `Stream<Path> walk(Path path, int maxDeption)`
The given `Path` argument is always included in any case in the returned `Stream<Path>`. Refer to [`FilesWalkTest.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/test/java/ruixue/practice/ocpkasi/core_java/nio/file/FilesWalkTest.java)

## *JDBC*
### `Connection`
#### [The JDBC `Connection` URL Format](https://docs.oracle.com/cd/B28359_01/java.111/b31224/urls.htm#BEIJFHHB)
`jdbc:vendorName:[driverType:][user/password:][@][address/]serviceName`

From the format above, the part in square brackets means optional => only the **`vendorName`** and the **`databaseName`** at the end are **mandatory**

`driverType` - In Oracle database, the `driverType` might be `oci`, `thin`, `kprb` etc.
`serviceName` - database service name, i.e. the database name

### `Statement` 
`Statement` can be initialized through `Connection`: `Statement createStatement(int resultSetType, int resultSetConcurrency) throws IOException`

`resultSetType` defines the way the cursor can be manipulated and, the value can be:
* `ResultSet.TYPE_FORWARD_ONLY` (default)
* `ResultSet.TYPE_SCROLL_INSENSITIVE`
* `ResultSet.TYPE_SCROLL_SENSITIVE`

`resultSetConcurrency` defines how concurrent changes made to the data source are reflected and, the value can be:
* `ResultSet.CONCUR_READ_ONLY` (default)
* `ResultSet.CONCUR_UPDATABLE`

> [By default, only one `ResultSet` object per `Statement` object can be open at the same time](https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html)

> [All execution methods in the `statement` interface implicitly `close` a current `ResultSet` object of the statement if an open one exists](https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html)

### `ResultSet`
> [A ResultSet object is automatically closed when the Statement object that generated it is closed, re-executed, or used to retrieve the next result from a sequence of multiple results.](https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html)

#### `ResultSet` Types
> If the `Driver` does not support the type supplied to the methods `createStatement`, `prepareStatement` or `prepareCall`, it generates an `SQLWarning` on the `Connection` object that is creating the statement. When the statement is executed, the driver returns a `ResultSet` object of a type that most closely matches the requested type <sup>JDBC 4.2 Specification > 15.1.1 ResultSet Types</sup>

Note that once the `ResultSet` type is defined during the initialization of `ResultSet`, there is no way to change the `ResultSet` type as there is no corresponding setter in the `ResultSet`.

#### Methods on `ResultSet`
##### Methods for Moving the Cursor of `ResultSet`
###### `boolean next()` Works in Any Event 
`boolean next()`is always working as a part of *iterator* pattern implementation. 

###### Methods for Moving the Cursor of *Scrollable* `ResultSet` 

Method Name         | return type 
--------------------|------------
`absolute(int row)` |`boolean`
`previous()`        |`boolean`
`relative(int row)` |`boolean`
`first()`           |`boolean`
`last()`            |`boolean`
`afterLast()`       |`void`
`beforeFirst()`     |`void`

*Scrollable* means the `ResultSet` type is `ResultSet.TYPE_SCROLL_INSENSITIVE` or `ResultSet.TYPE_SCROLL_SENSITIVE`, meaning the `Statement` returning the `ResultSet` is initialized with `ResultSet.TYPE_SCROLL_INSENSITIVE` or `ResultSet.TYPE_SCROLL_SENSITIVE`. So if the `ResultSet` is of type `ResultSet.TYPE_FORWARD_ONLY`, for instance the `Statement` returning it is initialized with method `createStatement()`, calling *scrollable* methods would throw `SQLException`.

Methods for Moving the Cursor of *Scrollable* `ResultSet` Returning `boolean`

* `boolean absolute(int row)`
* `boolean previous(int row)`
* `boolean relative(int row)`

As to these three methods, returning `false` means the *cursor* is positioned before the first row or after the last row.

* `boolean first()`
* `boolean last()`

As to these five methods above, returning `false` means there is no rows in the `ResultSet`

`void` Methods for Moving the Cursor Out of Bound

* `void afterLast()`
* `void beforeFirst()`

Proof by contradiction for these two methods being `void`:

Assuming these two methods returns `boolean`, then `true` for `beforeFirst()` should mean the cursor is moved before the first row, whereas "before the first row" is already a `false` condition in the aforementioned `absolute`, `relative`, `previous` methods. Therefore, in order to make the logic of the `ResultSet` API as simple as possible, it would be better to make the definition consistently => these two methods are `void` 

##### *Getters* of `ResultSet`
###### `String getString(String columnLabel)`
##### There Is No *Getter* but `update...` Methods in `ResultSet`

## Synthtic Mnemonic
### `java.io.Closeable` VS `java.lang.AutoCloseable`
First off, resources `Closeable` are also allowed to be initialized, or say opened, in the *try-with-resource* clause because, `Closeable` is changed to [`extends AutoCloseable`](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html) since *Java 7* for the sake of *backward compatibility*. Secondly, as to exception declaration, the legacy `Closeable.close()` declares `IOException`, whereas the exception of `close()` method of `AutoCloseable` is widened to be `Exception` to be more versatile in use. The source code of `Closeable` since *Java 7* is a showcase of *subclass* being able to declare narrower exception.

