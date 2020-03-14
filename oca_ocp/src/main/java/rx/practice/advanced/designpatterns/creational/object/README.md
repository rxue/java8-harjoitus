# *Object Creational* Patterns
## *Singleton*
### Buzzwords in *Singleton Pattern*
* *singleton*: The globally available object created by the *singleton pattern*
### *Singleton Pattern* Features in Java
* A *Singleton* is created as `private static`
* A *Singleton* is accessed via a single `public static` method (often named as `getInstance()`)
* All constructors in *Singleton* class are marked `private`, which ensures that no class is capable of instantiate another version of the class 
* the singleton class is *effectively final*
### *Singleton Pattern* Application in Java Core
* [`java.lang.RunTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/Runtime.java)
## *Builder*
The main purpose of *builder* is to avoid *telescoping constructor*. There are the following contract:

Assume the object the builder is going to build is A

* the *fields* of A have to `private final`
* the *builder* of A is usually a *nested* `static` class in A
* A is usually immutable **without any public constructor** but one `private` *constructor* whose parameter is the *builder*
* the required fields in the *builder* have to `private final`, others don't necessarily need to be

