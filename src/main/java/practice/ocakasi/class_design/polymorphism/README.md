## Concepts
* *Polymorphism*: the property of an object to take on different forms
  * *virtual method*: a method in which the specific implementation is not determined until runtime. In fact, all non-final, non-static, and non-private Java methods are considered virtual methods, since any of them can be ***overridden*** at runtime
## Object vs Reference
### Relevant rules:
* The type of the object    determines **which properties exist** within the object in memory
* The type of the reference determines **which members (methods and variables) are accessible** to the Java program
## *Virtual Methods*
At heart, from the aspect of Java virtual machine *instuction set*, an accessible *virtul method* call will be compiled to an `invokevirtual` *instruction*. The behavior `invokevirtual` instruction is determined at runtime, and is contingent on the *object* the pertinent *reference variable* references to, meaning the *overriding method* in the pertinent *object* will be invoked if it exists.  

