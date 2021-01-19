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

## Practical compiling rules of casting and autoboxing
**Implicit cast** and autoboxing/unboxing cannot happen successively. Refer to example erratic code [DemoCastingWithAutoboxing](#) 
