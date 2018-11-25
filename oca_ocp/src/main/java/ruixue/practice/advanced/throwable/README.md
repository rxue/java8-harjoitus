## `Throwable` - *Exceptions*
The root *superclass* of all the *exceptions* is `Throwable`. To put it another way, all Java *Exceptions* are instances of `Throwable`, and thus this section is titled as `Throwable` - *exceptions*.

### Canonical Categorization of *Exceptions* Based on [*JLS*](https://docs.oracle.com/javase/specs/jls/se8/html/)
The Java Language Specification, short for [*JLS*](https://docs.oracle.com/javase/specs/jls/se8/html/), for Java SE 8 categorized *exceptions* into *unchecked exceptions* and *checked exceptions*, whose relationship between each other is reciprocal:

> [The *unchecked exception classes* are the run-time exception classes and the error classes](https://docs.oracle.com/javase/specs/jls/se8/html/jls-11.html#jls-11.1)

> [The *checked exception classed* are all exception classes other than the *unchecked exception classes*. That is, the *checked exception classes* are `Throwable` and its subclasses other than `RuntimeException` and its subclasses and `Error` and its subclasses.](https://docs.oracle.com/javase/specs/jls/se8/html/jls-11.html#jls-11.1)

The second quote mentioned that *checked exceptions* are `Throwable` and its direct subclasses other than `RuntimeException` and `Error`. In another word, among the subclasses of `Throwable`, the complement of *unchecked euxceptions* is the set of *checked exceptions*. To better understand the *checked exceptions*, the demo class, [SubclassOfTHrowable](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/main/java/ruixue/advanced/throwable/SubclassOfThrowable.java), is a special case of *checked exception*. Note that this demo is located in the [error_code](https://github.com/rxue/java8-perusharjoitus/tree/master/error_code) because, the book, *Effective Java*, explained in **Item 70** that such **malform** of *checked exception* is not addressed in the JLS, neither does it offer any benifit but just confuse the API user. So never do this in practice!

To sum up, **the key point of *checked exceptions* and *unchecked exceptions* is the word *checked*. which happens at *compile-time* **.

