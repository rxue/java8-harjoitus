## Nested Class
### Non-static Nested Class aka *Inner Class*
#### *Member Inner Classes*
* http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/HashMap.java#HashMap.EntryIterator
* http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/HashMap.java#HashMap.KeySet
* ... 

### Static Nested Classes
In Thinking in Java > Inner Class > Nested Classes, where *nested classes* in fact means *static nested classes* in OCP, it was stated that *You don't need an outer-class object in order to create an object of a (static) nested class*. Precisely, creating an object of a static nested class through an outer-class object will cause compilation error.

#### Examples of *Static Nested Classes* in *OpenJDK 8* Source Code 
* [`java.util.Arrays`-`ArrayList`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/Arrays.java#Arrays.ArrayList)
* [`java.util.Collections`#`UnmodifiableList`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/Collections.java#Collections.UnmodifiableList)
* [`java.util.LinkedList`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/LinkedList.java)
* [`java.util.TreeMap`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/TreeMap.java)
