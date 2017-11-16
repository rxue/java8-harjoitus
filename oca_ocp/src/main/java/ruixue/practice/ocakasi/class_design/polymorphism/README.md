## Concepts
* *Polymorphism*: the property of an object to take on different forms
  * *virtual method*: a method in which the specific implementation is not determined until runtime. In fact, all non-final, non-static, and non-private Java methods are considered virtual methods, since any of them can be ***overridden*** at runtime
## Object vs Reference
### Relevant rules:
* The type of the object    determines **which properties exist** within the object in memory
* The type of the reference determines **which members (methods and variables) are accessible** to the Java program
## *Casting* Objects
### Basic Rules of *Casting* Objects
1. Casting an object from a subclass to a superclass doesn't required an *explicit cast*
2. Casting an object from a superclass to a subclass requires an *explicit cast*
3. The **compiler will not allow casts to unrelated types**
4. Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class
## *Virtual Methods*
At heart, from the aspect of Java virtual machine *instuction set*, an accessible *virtul method* call will be compiled to an `invokevirtual` *instruction*. The behavior `invokevirtual` instruction is determined at runtime, and is contingent on the *object* the pertinent *reference variable* references to, meaning the *overriding method* in the pertinent *object* will be invoked if it exists.  

