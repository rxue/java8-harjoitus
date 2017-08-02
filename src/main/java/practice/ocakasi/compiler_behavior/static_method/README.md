:## `static` Method
You can think of *statics* as being a *class member* that **exists independently of any instance of that class**.

`static` methods have two main purposes:
* For utility or helper methods that don't require any object state. Since there is **no need to access instance variables**,  having static methods eliminates the need for the caller to instantiate the objevt just to call the method.
* For state that  shared by all instances of a class, like a counter. **All instances must share the same state**. Methods that merely use the state should be static as well.


