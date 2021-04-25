# Concepts
* [*literals*](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html): It is possible to assign a *literal* to a variable of a primitive type. Values of the integral types `byte`, `short`, `int` and `long` can be created from `int` *literals*.

## [*Primitives* Date Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
The sizes of the primitive types are *platform-independent*, meaning the sizes don't change from one machine architecture to another. In this sense *Java* is very **portable** among most programming languages.

NOTE! According to the title link above:

* `float`

> This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.

* `double`

> For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency.

[*single precision* vs *double precision*](https://stackoverflow.com/questions/801117/whats-the-difference-between-a-single-precision-and-double-precision-floating-p)


### `String` Can be considered as a *Primitive* Type in the Context of *Code Smell* Even Though It is Not Technically

> The `String` is not technically a primitive data type, but considering the special support given to it by the language, you'll probably tend to think of it as such.

In the book, Refactoring: Improving the Design of Existing Code, whose demo code is in *Javascript*, chapter 3 introduced a code smell called *Primitive Obsession*:

> Strings are particularly common Petri dishes for this kind of odor: A telephone number is more than just a collection of characters. If nothing else, a proper type can often include consistent display logic for when it needs to be displayed in a user interface. Representing such types as strings is such a common stench that people call them "stringly typed" variables.

The paragraph above is impeccable as [string is a primitive data type in Javascript](https://developer.mozilla.org/en-US/docs/Glossary/Primitive). In Java, `String` is not a *primitive data type* technically, wherea in the context of *code smell*, "stringly typed" variable, i.e. a *type code* expressed as a `String` instance, obviously can be considered as *Primitive Obsession*.

## Practical compiling rules of casting and autoboxing
**Implicit cast** and autoboxing/unboxing cannot happen successively. Refer to example erratic code [DemoCastingWithAutoboxing](#) 
