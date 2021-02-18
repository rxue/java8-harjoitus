# *Object Creational* Patterns
## *Singleton*

> The **Singleton Pattern** ensures a class has only one instance, and provides a global point of access to it. <sup>Head First Design Patterns > 5 the Singleton Pattern</sup>

### Buzzwords in *Singleton Pattern*
* *singleton*: The globally available object created by the *singleton pattern*
### *Singleton Pattern* Features in Java
* A *Singleton* is created as `private static`
* A *Singleton* is accessed via a single `public static` method (often named as `getInstance()`)
* All constructors in *Singleton* class are marked `private`, which ensures that no class is capable of instantiate another version of the class 
* the singleton class is *effectively final*

### Singleton over Global Variables

> Q: I still don't totally understand why global variables are worse than a Singleton

> A: In *Java*, global variables are basically static references to objects. There are a couple a disadvantages to using global bariables in this manner. We've already mentioned one: the issue of lazy versus eager instantiation. But we need to keep in mind the intent of the pattern: to ensure only on instance of a class exists and to provide global access. A global variable can provide the latter, but not the former. Global variables also tend to encourage developers to pollute the namespace with lots of global references to small objects. Singleton don't encourage this in the same way, but can be abused nonetheless. 

### *Singleton Pattern* Application in Java Core
* [`java.lang.RunTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/Runtime.java)

### Reference:

* Head First Design Patterns
* Working Effectively with Legacy Code


## *Builder*
The main purpose of *builder* is to avoid *telescoping constructor*. There are the following formula:

Assume the object the builder is going to build is A

* the *builder* of A is usually a *nested* `static` class in A
* A is usually immutable **without any public constructor** but one `private` *constructor* whose parameter is the *builder*
* the required fields in the *builder* have to `private final` so that it **has to and can only be assigned through the *constructor***. In another word, the constructor parameters of a Builder are usually the values to be assigned to the required fields of A

Reference: Effective Java > *Item 2: Consider a builder when faced with many constructor parameters* 

