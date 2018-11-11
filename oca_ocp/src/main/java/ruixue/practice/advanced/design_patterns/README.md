# *Design Patterns*
## Jargons
* *Coupling*: the degree to which one class knows about another class (Reference: Sun Certified Programmer for Java 6 Study Guide)
  * *Loose coupling*: If the only knowledge that class A has about class B, is what class has exposed through its interface, then class A and class B are loosely coupled
## *Object Creational* Patterns > *Builder Pattern*
### *Builder Pattern* Features
* *tightly coupled*
### *Builder Pattern* Application in Java Core
* [`java.lang.StringBuilder`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/StringBuilder.java)
* [`java.util.stream.Stream`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/stream/Stream.java)
* [`java.util.Locale`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/Locale.java)

## *Object Creational* Patterns > *Factory Pattern*
The *factory pattern*, sometimes referred to as the *factory method pattern*, is a *creational pattern* based on the idea of using a factory class to produce instances of objects based on a set of input parameters. 
* It is similar to the *builder pattern*, although it is focused on supporting class polymorphism => creates objects in which the precise type of the object may not be known until runtime
* *Factory patterns* are often, although not always, implemented using **`static`** methods that return objects and do not require a pointer to an instance of the factory class
* *loosely coupled*
### *Factory Pattern* Application in Java Core
* ~~[`java.time.ZonedDateTime`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/time/ZonedDateTime.java)~~
  * ~~refer to the *overloading* of `static` method [`ZonedDateTime.of`](https://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html#of-int-int-int-int-int-int-int-java.time.ZoneId-)~~

## *Structural* Patterns > *Adapter*
### *Object Adapter* in `java.io`
`InputStreamReader` is the *adapter* of *adaptee* - `InputStream` - in relation to `Reader` as the *target*. In other words, `InputStreamReader` is the only `Reader` with a *constructor* accepting `InputStream` as a *parameter*. 
![object_adapter_java io inputstreamreader](https://user-images.githubusercontent.com/3033388/42907376-3fc5e60e-8ae6-11e8-84b1-91f8c15f7fc1.jpg)
Similarly, in the aspect of `Writer`, `OutputStreamWriter` is the only `Writer` with a *Constructor* accepting `OutputStream` as a *parameter*.
## *Behavioral* Patterns > *Iterator*
> The *iterator pattern* provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## *Behavioral* Patterns > *Class Behavioral* > *Template method*

### Application of *Template Method*
In the *core Java*, since the very beginning, the `protected abstract Object handleGetObject(String key)` in the class `ResourceBundle` is a *template method*. More important, in the *subclass* of `ResourceBundle` - the `abstract class ListResourceBundle`, `protected Object[][] getContents()` is a typical *template method* as well. 

## *Behavioral* Patterns > Object Behavioral > *Strategy* aka. *Policy*
Based on [Gamma](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) partially, the structure of *strategy pattern* can be generalized as the following UML class diagram:
![strategy](https://user-images.githubusercontent.com/3033388/45920421-7916f480-beac-11e8-80b4-a7ad53f65c55.jpg)

In this general case, the *context* *has-a* *strategy* instance, which can be assigned through the *context* constructor with *lambda expression* and *method reference* in Java 8. However, the *class relationship* between the *Context* and *Strategy* is not restricted to *composition*, the *has-a* relationship, it can be more loosely coupled such as *dependency*, i.e. *delegation*.
  
### Application of *Strategy* in Java 8
#### `default void sort(Comparator<? super E>)` in `List<E>` 
In this case, the relationship between the `List`, i.e. *context*, and `Comparator`, i.e. *strategy*, are the least loosely coupled, say *dependency* in the aspect of UML. Moreover, `public static <T> void sort(List<T> list, Comparator<? super T> c)` in `Collections` is implemented with this *default* method
#### *Strategy Pattern* with *Delegation* and *Dependency*
* `public static long ChronoUnit.between(Temporal temporal1Inclusive, Temporal temporal2Exclusive)`
* `<R extends Temporal> ChronoUnit.addTo(Temporal temporal, long amount)`
  * *Context*: `ChronoUnit`
  * *Strategy*: `Temporal`
  * *Concrete Strategy*, i.e. implementation of `Temporal`:
    * `LocalDate`
    * `LocalTime`
    * `LocalDateTime`
    * `ZonedDateTime`

This *strategy* resembles the *strategy* enum pattern<sup>[Effective Java](https://www.amazon.com/Effective-Java-3rd-Joshua-Bloch/dp/0134685997)</sup> in that the *context* `ChronoUnit` is `enum`. The implementation of `between` method is *delegated* to the first argument - `temporal1Inclusive`, who invokes its `until(temporal2Exclusive, this)` method.

* `public String format(DateTimeFormatter formatter)` in `LocalDate`,`LocalTime`,`LocalDateTime`,`ZonedDateTime`
* `public static LocalDate parse(CharSequence text, DateTimeFormatter formatter)` in `LocalDate`,`LocalTime`,`LocalDateTime`,`ZonedDateTime` 
