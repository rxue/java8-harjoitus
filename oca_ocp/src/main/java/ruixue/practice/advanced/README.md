## Technique
### *Static Factory Methods*
### *Method Chaining*
*Method Chaining* is a technique calling multiple methods in one *statement*. It is typically used in the context of operations related to *immutable object* directly or indirectly, due to the fact that most of the methods on an *immutable object* usually returns a new object. In *core Java*, there are some frequently seen use cases:
* On *immutable object*, methods can be chained, e.g.:
  * `String result = " hEllo woRLx ".trim().toLowerCase().replace('x', 'd');`, the `result` is "hello world"
  * operations on `Stream` pipeline are usually chained as a *Stream* is *immutable*
* on *builder* object, which can produce an *immutable object* eventually, e.g. `StringBuilder`

However, it is illogical to invoke *static methods* in the middle of *method chaining*

## *Design Patterns*
### *Behavioral* Patterns > Object Behavioral > *Strategy*
#### Application of Strategy Pattern
##### Strategy Pattern in `java.time.temporal`
In *OpenJDK-8*, the implementation of 

* `<R extends Temporal> ChronoUnit.addTo(Temporal temporal, long amount)` and 
* `long ChronoUnit.between(Temporal temproal1Inclusive, Temporal temporal2Exclusive)` applied the *strategy pattern*:
  * *Context*: `ChronoUnit`
  * *Strategy*: `Temporal`
  * *Concrete Strategy*:
    * `LocalDate`
    * `LocalTime`
    * `LocalDateTime`
    * `ZonedDateTime`

Consider [`long ChronoUnit.between(Temporal temporal1Inclusive, Temporal temporal2Exclusive)`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/time/temporal/ChronoUnit.java#ChronoUnit.between%28java.time.temporal.Temporal%2Cjava.time.temporal.Temporal%29), the implementation is only one statement - `return temporal1Inclusive.until(temporal2Exclusive, this);`. So
**`long ChronoUnit.between(Temporal temporal1Inclusive, Temporal temporal2Exclusive)` is equivalent to `long Temporal.until(Temporal temporal, TemporalUnit unit)` and, the relationship between the ChronoUnit and the Temporal is weak assoication, say dependency** In the book [GOF23], the relationship between the *Strategy* and the *Context* is marked as *aggregration* other than *dependecy*. Therefore, in practice the relationship between *strategy* and *context* is not fixed.  
