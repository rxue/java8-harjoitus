# Buzzwords
* *marker interface*
* *legacy code* is older code. It is usually code that is in a different style than you would write if you were writing the code today. 

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

### *Factory Pattern*
The *factory pattern*, sometimes referred to as the *factory method pattern*, is a *creational pattern* based on the idea of using a factory class to produce instances of objects based on a set of input parameters. 
* It is similar to the *builder pattern*, although it is focused on supporting class polymorphism => creates objects in which the precise type of the object may not be known until runtime
* *Factory patterns* are often, although not always, implemented using **`static`** methods that return objects and do not require a pointer to an instance of the factory class
* *loosely coupled*
#### *Factory Pattern* Application in Java Core
* [`java.time.ZonedDateTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/time/ZonedDateTime.java)
  * refer to the *overloading* of `static` method [`ZonedDateTime.of`](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html#of-int-int-int-int-int-int-int-java.time.ZoneId-)

