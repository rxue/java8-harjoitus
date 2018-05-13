## [*Polymorphism*](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
*Polymorphism* is the property of an object to take on different forms
### *Object Type* VS *Reference Type*
#### Relevant rules:
* The type of the object    determines **which properties exist** within the object in memory
* The type of the reference determines **which members (methods and variables) are accessible** to the Java program
### *virtual Method Invocation*
The *Java virtual machine (JVM)* calls the appropriate method for the object that is referred to in each variable. It does not call the method that is defined by the *reference type* but the *object type*. This behavior is referred to as *virtual method invocation* and demonstrate an aspect of the important *polymorphism* features in Java. 

All non-final, non-static, and non-private Java methods are considered as *virtual methods*, since any of them can be ***overridden*** at runtime

## *Casting* Objects
### Basic Rules of *Casting* Objects
1. Casting an object from a subclass to a superclass doesn't required an *explicit cast*
2. Casting an object from a superclass to a subclass requires an *explicit cast*
3. The **compiler will not allow casts to unrelated types**
4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class
## *Virtual Methods*
At heart, from the aspect of Java virtual machine *instuction set*, an accessible *virtul method* call will be compiled to an `invokevirtual` *instruction*. The behavior `invokevirtual` instruction is determined at runtime, and is contingent on the *object* the pertinent *reference variable* references to, meaning the *overriding method* in the pertinent *object* will be invoked if it exists.  


