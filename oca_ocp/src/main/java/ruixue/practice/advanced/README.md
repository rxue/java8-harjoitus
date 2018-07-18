## Java Language
### *Polymorphism*
In *Java*, *polymorphism* is also called *dynamic binding*, or *late binding* or *run-time binding*, where the term *binding* refers to *method-call binding*.
 
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
### *Structural* Patterns > *Adapter*

<div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;toolbar&quot;:&quot;zoom layers lightbox&quot;,&quot;edit&quot;:&quot;_blank&quot;,&quot;xml&quot;:&quot;&lt;mxfile userAgent=\&quot;Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.91 Safari/537.36\&quot; version=\&quot;8.9.7\&quot; editor=\&quot;www.draw.io\&quot; type=\&quot;google\&quot;&gt;&lt;diagram id=\&quot;8f088246-2b82-5dd9-82ad-a044a8d332e0\&quot; name=\&quot;Page-1\&quot;&gt;3Vpbc+o2EP41zKQPZCxf4TFAOKcPnZ5pTqfNo2wLUGMsVxYJ9NdXsiSQfAFCSALhAayVtJJWu99+kul54+X6G4XF4jeSoqznOum65016rjtwIv4tBBsp8CNPCuYUp1IEdoIH/B9SQkdJVzhFpdWQEZIxXNjChOQ5Spglg5SSF7vZjGT2qAWco4bgIYFZU/oXTtlCLStwdvLvCM8XemTgqJoYJk9zSla5Gq/nerPqI6uXUOtS7csFTMmLIfLue96YEsLkE4n/EetznQzG3MRKp+ip7bjrtVyPUca3YSqL/EH1tmodXDcFRTkzJzXt6BClieuDKB4EYYRSP+0DNZVnmK2QnluYcWWjQqyNbZQ9w39XYkGjJaRznPe8O17rFGv+zYWVWYS8z0gh63yjjqE168MMz1W/hM8W0Z1O/jRXv9XIcV2AteAPBNOqZyarp7jelMsa3bmsqMsWVCxPe62eCeie1EnmyNCMGfbo0t02wfccryxgvpOJ/sZM7MraBlC+ATdaOiM5qyI4I9SaZRUyjiMiqj6FZAFpLxj1gokxpFSkh3SSeCWibSwctxqB2MUM5b/s84GYfraBsW3dJCMlutk7Z3uGrjU39xlRhjm03ckYmlRRNlIRNZFzGhHeapZVSDTDPOrl/ihg5nEuy1O4xJmA9O8oe0ZCqwgGthTABLZjm4iiQEbMAa0NkUKYb4gsEaMb3kTV8twhu6jMMVTFlx0Mg8FAyhYGBA8Dhf4K+edbza6JiArUjgU4/5IB7te8WLEHxqNq2YC264GxvtCZygZyMROUEHs1lzlzG/z245nHP00NU5whYxdvjOcKr8ygt2Huo5FJtK3g24Tg12Ltl8Go0LUwyo2iBki5rvdRIDVsgBTju4pYw8qcbBbiMSeM/4xeFpihhwImQvbCebxtKBVeHAO90VH7w3N/gvP5T1E36YfnsbUfDQ7lA70bpqU1Sz6rpd2gYWmYwoIh1EYevoDxtwce7ejagQ3rR37T+mDwHtYPG9a/XzOUp2XD1lx4J06BvBRnJHni1uAijRShLE4rDJk4tuHRGrO/hfg2UKVH1YibkW6MKlF8PAQqJVnRBB2gFypc9x+yUGodWZt7ZjKkUO0bRRlk+Nk+1bbtilL3g0jgVvvvOXbwefqYq1XI5ale5tGxrkh7iXakuiJpgoaiykm2azzRb6KOqKVfIkb9Yc20LckoCltiNDpDjIYgTWMwjNEsCn3AbX3JfPkYpjasPk1l5Sq/zTG5TcrbLpLaQdCuh4m/xT79ivNJ5RaLfTV/vXpTSLJseUmD2EuS/Pv2ck/kqEo05vS6RNWY5eWw/7cYo+vS6M2nibarptbLm+u1Xfv1z3WvZ5atysUr1/N5p8WSUfKExttl6sWdJXUH+q2ISt0ANA83nj50WLl7H5U7NnmHAMbQjwI/DmA4iKPW5N1NrFMMlyRPfy6EMxl8Glhk2/Vr9HpHoiOLRTsm9zaZt2x3wj5Y1LuDqOxn3v7nMe/tmzD9As09mXkfUNTBvPk2w43RrBANyu4J++6wxvBBzRmlxlNpfRA7gTsEQ4AS3xsGg77b5q4XxzW3V/XtpOja30BtE/lxt6Dtb3XiDT9taRLQkRdeww0+8w1Oe8a+zFTmVJ/zpLLwiJsiMGy5qAtrcHRKJmtig9fAhj9LtC+bkQLlVuKqzJrCcoFSZb+WSyL9/Li9FTouGx1zEdQJeJ+RjgLH3l4vqt0eHJuOwvCAovNdBIFZmLhRPEtAksSeC/ug4RTvym8CzzUJDrh1nMFeJlM1/YEo5otEtM6JGveRrd5w0Pc63cqiQq106UM8LaoByclXjnx1NiINjvO0buJzvC/y4u4vPLL57m9S3v3/&lt;/diagram&gt;&lt;/mxfile&gt;&quot;}"></div>
<script type="text/javascript" src="https://www.draw.io/js/viewer.min.js"></script>

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
