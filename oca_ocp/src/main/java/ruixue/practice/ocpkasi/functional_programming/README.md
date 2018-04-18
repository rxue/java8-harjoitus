## *`@FunctionalInterface`* aka. *Single `abstract` Method `interface`*
The concept - **contains a single `abstract` method** - infers that a *functional interface* can contain as many other types of methods other than `abstract` methods, say `default` or `static` methods, as possible.
* [`java.util.function.Predicate`](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
* [`java.util.function.BiConsumer`](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html)
* [`java.util.function.BinaryOperator`](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiOperator.html)

* [`java.util.Comparator`](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)

## *Lambdas*
Lambda expressions can access:
* *static variables*
* *instance variables*
* *effective final local variables*, meaning local variables being not final inside lambda causes compile errors

## *Method Reference*
*Method reference* returns a **functional interface**
### `::` Operator
* `::` operator tells Java to pass the parameters automatically into the pertinent method, i.e. the right side operand
  * => `::` operator is like lambdas, and it is typically used for *deferred execution*

## *Built-in Functional Interface*s
### Naming of the `abstract` Method in `Consumer` and `Supplier`
As the names of the two interfaces imply, they can be considered as the two counterparts in the context of *producer/consumer problem*. 

The action of a `Consumer` is to *accept* something and then consume it.  Therefore, the abstract method is defined as `void accept(T t)`, where the parameter `t` is the element to consume and, as `t` is consumed, there is no sense to return anything, and thus the return type is `void`. The same goes with `BiConsumer`.
  
The action of a `Supplier` is to supply something to another party. Therefore, the abstract method is defined as `T get()`, where the name `get` was probably inspired by the *JavaBeans* naming convention, say the method is obviously a *getter* as it returns `T`
 
## `BiConsumer<T,U>` VS `BinaryOperator<T>`
 


