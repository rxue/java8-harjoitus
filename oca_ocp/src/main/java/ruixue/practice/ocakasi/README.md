# Concepts
* *object*: an instance of a class
* Data types
  * *primitive type*: their values in the memory are where the *variable* is allocated
  * *reference type*: refers to an *object*. 
    * Their values are different from the **value of the object**, meaning *references* do not hold the value of the object. 
    * Instead, a reference "points" to an object by storing the memory address where the object is located. In this sense, *reference* Resembles the *pointer* in C, but Java does not allow you to learn what the memory address is.  
    * An *object* can be accessed only via a *reference*
* [*JavaBeans*](http://download.oracle.com/otndocs/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/): a *software component model* for Java
  * *Property*: instance variable
* [*constant expression*](http://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.28)
* [*numeric promotion*](https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.6): a process by which, given an *arithmetic operator* and its argument expressions, the **arguments are converted to an inferred target type**.
  * *unary promotion*
  * *binary promotion*
* *pass-by-value*: In the context of calling methods, the copy of the variable is made and the method receives that copy. Java is a *pass-by-value* language.
* *Covariant return types*: In the context of method overriding, if the method returns a type, it must be the same or a **subclass** of the method in the parent class 

## Members
* *Variable*
* *Method*
  * *Method Chaining*
  * *Method signature*: the method name and the list of the input *parameters*
### [*Class Members*](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)
#### Class Methods
##### *Method Chaining*
Static methods cannot be chained. On the other hand, in *builder design pattern*, *parameters* are passed to a builder object often through *method chaining*  
### *Instance Members*
