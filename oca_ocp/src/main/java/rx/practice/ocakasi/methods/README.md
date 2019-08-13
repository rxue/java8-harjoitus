## *Overloading* Methods
*Method overloading* occurs when there are different *method signatures* with the same name but different type parameters.
* **Everything other than the method signatue can vary for overloaded methods**. This means there can be different *access modifiers*, *specifiers* (like **`static`**), return types and expression lists.
* *Overloading methods* offers no specific benefit to the JVM, but it is useful to the programmer to have several methods do the same thing but with different parameters. (refer to: https://en.wikibooks.org/wiki/Java_Programming/Overloading_Methods_and_Constructors)

## *Overriding* Methods
1. The method in the child class must have the same signature as the method in the parent class
2. The method in the child class must be at least as accessible **or more accessible** than the method in the parent class
3. The method in the child class may **not** throw a *checked exception* that is **new or broader than the class of any exception thrown in the parent class method**
4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as *covariant return types*

## At compile time:
* a method with a `return` type, say other than `void`, should <b>always</b> return a value
* unreachable code is not allowed 
