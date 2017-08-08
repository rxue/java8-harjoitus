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
* Tightly coupled
#### *Builder Pattern* Application in Java Core
* [`java.lang.StringBuilder`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/StringBuilder.java)



