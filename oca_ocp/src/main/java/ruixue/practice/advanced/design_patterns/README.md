## *Design Patterns*
### *Structural* Patterns > *Adapter*
#### *Object Adapter* in `java.io`
`InputStreamReader` is the *adapter* of *adaptee* - `InputStream` - in relation to `Reader` as the *target*. In other words, `InputStreamReader` is the only `Reader` with a *constructor* accepting `InputStream` as a *parameter*. 
![object_adapter_java io inputstreamreader](https://user-images.githubusercontent.com/3033388/42907376-3fc5e60e-8ae6-11e8-84b1-91f8c15f7fc1.jpg)
Similarly, in the aspect of `Writer`, `OutputStreamWriter` is the only `Writer` with a *Constructor* accepting `OutputStream` as a *parameter*.
### *Behavioral* Patterns > *Iterator*
> The *iterator pattern* provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

### *Behavioral* Patterns > *Class Behavioral* > *Template method*

#### Application of *Template Method*
In the *core Java*, since the very beginning, the `protected abstract Object handleGetObject(String key)` in the class `ResourceBundle` is a *template method*. More important, in the *subclass* of `ResourceBundle` - the `abstract class ListResourceBundle`, `protected Object[][] getContents()` is a typical *template method* as well. 

### *Behavioral* Patterns > Object Behavioral > *Strategy* aka. *Policy*
Based on [Gamma](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) partially, the structure of *strategy pattern* can be generalized as the following UML class diagram:
![strategy](https://user-images.githubusercontent.com/3033388/45920421-7916f480-beac-11e8-80b4-a7ad53f65c55.jpg)

In this general case, the *context* *has-a* *strategy* instance, which can be assigned through the *context* constructor with *lambda expression* and *method reference* in Java 8. However, the *class relationship* between the *Context* and *Strategy* is not restricted to *composition*, the *has-a* relationship, it can be more loosely coupled. 
  
#### Application of *Strategy* in Java 8
##### `java.time.temporal`
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

##### `default void sort(Comparator<? super E>)` in `List<E>` 
In this case, the relationship between the `List`, i.e. *context*, and `Comparator`, i.e. *strategy*, are the least loosely coupled, say *dependency* in the aspect of UML. Moreover, `public static <T> void sort(List<T> list, Comparator<? super T> c)` in `Collections` is implemented with this *default* method

##### `public String format(DateTimeFormatter formatter)` in `LocalDate`,`LocalTime`,`LocalDateTime`,`ZonedDateTime`
There is also *dependency* between the *strategy* and *context*. The implementation is *delegation*, say the *context* itself is passed to the `format` method.
##### `public static LocalDate parse(CharSequence text, DateTimeFormatter formatter)` in `LocalDate`,`LocalTime`,`LocalDateTime`,`ZonedDateTime`

