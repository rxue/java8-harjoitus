## *Overloading* Methods
*Method overloading* occurs when there are different *method signatures* with the same name but different type parameters.
* **Everything other than the *method signatue* can vary for *overloaded methods* **. This means there can be different *access modifiers*, *specifiers* (like **`static`**), return types and expression lists.
* *Overloading methods* offers no specific benifit to the JVM, but it is useful to the programmer to have several methods do the same thing but with different parameters. (refer to: https://en.wikibooks.org/wiki/Java_Programming/Overloading_Methods_and_Constructors)

## At compile time:
* a method whith a `return` type, say other than `void`, should <b>always</b> return a value
* unreachable code is not allowed 
