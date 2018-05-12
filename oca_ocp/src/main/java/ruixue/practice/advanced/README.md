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
In *OpenJDK-8*, the implementation of `<R extends Temporal> ChronoUnit.addTo(Temporal temporal, long amount)` and `long ChronoUnit.addTo(Temporal temproal1Inclusive, Temporal temporal2Exclusive)` applied the *strategy pattern*:
  * *Context*: `ChronoUnit`
  * *Strategy*: `Temporal`
  * *Concrete Strategy*:
    * `LocalDate`
    * `LocalTime`
    * `LocalDateTime`
    * `ZonedDateTime`
