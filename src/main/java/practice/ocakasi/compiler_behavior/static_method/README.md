## `static` Method
Reference: Oracle Certified Associate Java SE Programmer I > Methods and Encapsulation > Applying Access Modifiers > Designing Static Methods and Fields

You can think of *statics* as being a *class member* that **exists independently of any instance of that class**.

`static` methods have two main purposes:
* For utility or helper methods that don't require any object state. Since there is **no need to access instance variables**,  having static methods eliminates the need for the caller to instantiate the objevt just to call the method.
* For state that  shared by all instances of a class, like a counter. **All instances must share the same state**. Methods that merely use the state should be static as well.

**You can use an instance of the object to call a static method. The compiler checks for the type of the reference and uses that instead of the object** - which is sneaky of Java.

The undermined essence of the the bolded text above can be demonstrated by decompiling the demo code [`ClassCallStaticMethod.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/compiler_behavior/static_method/ClassCallStaticMethod.java) and [`ReferenceCallStaticMethod.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/compiler_behavior/static_method/ReferenceCallStaticMethod.java). The Java source code `Koala.count` from [`ClassCallStaticMethod.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/compiler_behavior/static_method/ClassCallStaticMethod.java) and `koala.count`, where reference variable `koala` of type `Koala` is `null`, from [`ReferenceCallStaticMethod.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/compiler_behavior/static_method/ReferenceCallStaticMethod.java) are both decompiled to JVM instruction `getstatic #22		// Field practice/ocakasi/compiler_behavior/static_method/Koala.count:I` regardless of the line number, meaning calling a static method through a `class` is the same as through a reference variable, and thus the `reference variable` can even reference to `null`.
