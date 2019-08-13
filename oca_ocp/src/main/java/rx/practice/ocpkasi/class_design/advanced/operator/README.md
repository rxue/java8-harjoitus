## [Type Comparison Operator `instanceof`](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.20.2)

**If a cast([§15.16](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.16)) of the *RelationalExpression* to the *ReferenceType* would be rejected as a compile-time error, then the `instanceof` relational expression likewise produces a compile-time error.** => 

* Compilation of statement with `instanceof` is directly related to *cast* 
* Before *downcast*, always remember the *type check* with `instanceof` operator

### Compile time checking of `instanceof`
Take the [`ImproperUseOfInstanceof.java`](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/main/java/ruixue/ocpkasi/class_design/advanced/syntax/operator/ImproperUseOfInstanceof.java) as an example, the compiler knows that there is no possible way for a `Hippo` variable reference to be an `Elephant`, since `Hippo` doesn't extends `Elephant` directly or indirectly, where "indirectly" means that subclass of `Hippo` cannot extend `Elephant` due to the fact that **Java does not support *multiple inheritance*, meaning Java does not permit you to extend more than one class**. However, **Java does support [*multiple inheritance of type*](https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html), meaning Java permits you to implement more than one interfaces**, thus the last line - `boolean bi = anotherHippo instanceof Collection;` - compiles because the subclass of `Hippo` might implement `Collection`.

