## *`@FunctionalInterface`* aka. *Single `abstract` Method `interface`*
The concept - **contains a single `abstract` method** - infers that a *functional interface* can contain as many other types of methods other than `abstract` methods, say `default` or `static` methods, as possible.
* [`java.util.function.Predicate`](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
* [`java.util.function.BiConsumer`](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html)
* [`java.util.function.BinaryOperator`](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiOperator.html)

* [`java.util.Comparator`](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

## *Method Reference*
*Method reference* returns a **functional interface*
### `::` Operator
* `::` operator tells Java to pass the parameters automatically into the pertinent method, i.e. the right side operand
  * => `::` operator is like lambdas, and it is typically used for *deferred execution*

## `BiConsumer<T,U>` VS `BinaryOperator<T>`
 


