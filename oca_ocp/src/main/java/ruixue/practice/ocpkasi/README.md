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
## Concurrency
### `Runnable` and `Callable<V>`
* `Callable` is similar with `Runnable` in that both are *functional interface* and the method to be implemented does not contain any inputer parameter
* `Callable` differs from `Runnable` by its `generic` return type 

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
