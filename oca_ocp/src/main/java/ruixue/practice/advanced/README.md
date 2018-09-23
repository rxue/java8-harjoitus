## Java Language

### Java's [*Ordinal* starts from 0](http://www.cs.utexas.edu/users/EWD/transcriptions/EWD08xx/EWD831.html)

### *Polymorphism*
In *Java*, *polymorphism* is also called *dynamic binding*, or *late binding* or *run-time binding*, where the term *binding* refers to *method-call binding*.
 
## Technique
### *Immutable Object*
[An *immutable object* is not necessarily a *value object*](https://www.youtube.com/watch?v=KwP7Ay9Z-hc&t=1480s). The legacy `java.io.File`is a typical example, in which the `long length()` get the actual length of the file in the *file system*.

### *Static Factory Methods*
### *Method Chaining*
*Method Chaining* is a technique calling multiple methods in one *statement*. It is typically used in the context of operations related to *immutable object* directly or indirectly, due to the fact that most of the methods on an *immutable object* usually returns a new object. In *core Java*, there are some frequently seen use cases:
* On *immutable object*, methods can be chained, e.g.:
  * `String result = " hEllo woRLx ".trim().toLowerCase().replace('x', 'd');`, the `result` is "hello world"
  * operations on `Stream` pipeline are usually chained as a *Stream* is *immutable*
* on *builder* object, which can produce an *immutable object* eventually, e.g. `StringBuilder`

However, it is illogical to invoke *static methods* in the middle of *method chaining*

