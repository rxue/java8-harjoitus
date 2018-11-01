# Object Oriented Design Principles
* *Coupling*: the degree to which one class knows about another class (Reference: Sun Certified Programmer for Java 6 Study Guide)
  * *Loose coupling*: If the only knowledge that class A has about class B, is what class has exposed through its interface, then class A and class B are loosely coupled
# Design Pattern
## *Creational Patterns*
### *Singleton Pattern*
#### Buzzwords in *Singleton Pattern*
* *singleton*: The globally available object created by the *singleton pattern*
#### *Singleton Pattern* Features in Java
* A *Singleton* is created as `private static`
* A *Singleton* is accessed via a single `public static` method (often named as `getInstance()`)
* All constructors in *Singleton* class are marked `private`, which ensures that no class is capable of instantiate another version of the class 
* the singleton class is *effectively final*
#### *Singleton Pattern* Application in Java Core
* [`java.lang.RunTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/Runtime.java)

### *Builder Pattern*
#### *Builder Pattern* Features
* *tightly coupled*
#### *Builder Pattern* Application in Java Core
* [`java.lang.StringBuilder`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/StringBuilder.java)
* [`java.util.stream.Stream`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/stream/Stream.java)
* [`java.util.Locale`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/Locale.java)

### *Factory Pattern*
The *factory pattern*, sometimes referred to as the *factory method pattern*, is a *creational pattern* based on the idea of using a factory class to produce instances of objects based on a set of input parameters. 
* It is similar to the *builder pattern*, although it is focused on supporting class polymorphism => creates objects in which the precise type of the object may not be known until runtime
* *Factory patterns* are often, although not always, implemented using **`static`** methods that return objects and do not require a pointer to an instance of the factory class
* *loosely coupled*
#### *Factory Pattern* Application in Java Core
* ~~[`java.time.ZonedDateTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/time/ZonedDateTime.java)~~
  * ~~refer to the *overloading* of `static` method [`ZonedDateTime.of`](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html#of-int-int-int-int-int-int-int-java.time.ZoneId-)~~

# Summary
## Synthetic Comparisons
### *Anonymous Inner Class* VS *Lambda Expresson*
*Anonymous inner class* and *lambda expresson* are similar in that as to the accessibility of *local variable*, both do not have access unless those variables are *final* or *effectively final*.

# Exam Essentials
## *Functional Interface*
None of the *built-in* *functional interfaces* in *Java 8* allows for *checked exception* to be thrown

## Concurrency
### `Runnable` and `Callable<V>`
* `Callable` is similar with `Runnable` in that both are *functional interface* and the method to be implemented does not contain any inputer parameter
* `Callable` differs from `Runnable` by its `generic` return type `V` and the declaration of `Exception` in the `call()` method 

### *Intrinsic Lock*
> `static synchronized` methods used the `Class` object for the lock <sup>Java Concurrency in Practice</sup>
### `ExecutorService` has to call `shutdown()` to be shut down explicitly

#### *Blocking* methods always *declare* the checked `InterruptedException`

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

The value of `resultSetType` can be:
* `ResultSet.TYPE_FORWARD_ONLY` (default)
* `ResultSet.TYPE_SCROLL_INSENSITIVE`
* `ResultSet.TYPE_SCROLL_SENSITIVE`

The value of `resultSetConcurrency` can be:
* `ResultSet.CONCUR_READ_ONLY` (default)
* `ResultSet.CONCUR_UPDATABLE`

> [By default, only one `ResultSet` object per `Statement` object can be open at the same time](https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html)

> [All execution methods in the `statement` interface implicitly `close` a current `ResultSet` object of the statement if an open one exists](https://docs.oracle.com/javase/8/docs/api/java/sql/Statement.html)

### `ResultSet`
> [A ResultSet object is automatically closed when the Statement object that generated it is closed, re-executed, or used to retrieve the next result from a sequence of multiple results.](https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html)

#### Methods for Moving the Cursor of `ResultSet`
##### `boolean next()` Works in Any Event 
`boolean next()`is always working as a part of *iterator* pattern implementation. 

##### Methods for Moving the Cursor of *Scrollable* `ResultSet` 

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

###### Methods for Moving the Cursor of *Scrollable* `ResultSet` Returning `boolean`

* `boolean absolute(int row)`
* `boolean previous(int row)`
* `boolean relative(int row)`

As to these three methods, returning `false` means the *cursor* is positioned before the first row or after the last row.

* `boolean first()`
* `boolean last()`

As to these five methods above, returning `false` means there is no rows in the `ResultSet`

###### `void` Methods for Moving the Cursor Out of Bound

* `void afterLast()`
* `void beforeFirst()`

Proof by contradiction for these two methods being `void`:

Assuming these two methods returns `boolean`, then `true` for `beforeFirst()` should mean the cursor is moved before the first row, whereas "before the first row" is already a `false` condition in the aforementioned `absolute`, `relative`, `previous` methods. Therefore, in order to make the logic of the `ResultSet` API as simple as possible, it would be better to make the definition consistently => these two methods are `void` 


