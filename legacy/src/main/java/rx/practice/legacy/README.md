# `Iterable` and `Iterator`
In the aspect of *naming convention*, `Iterable` and `Iterator` are like `Comparable` and `Comparator`.

> Implementing `Iterable` allows an object to be the target of the [*For-Each Loop*](https://docs.oracle.com/javase/8/docs/technotes/guides/language/foreach.html) *statement* 
Reference: https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html

## Implementation Tip of `Iterable.iterator()`
Every time `iterator()` method of `Iterable` returns a `new` `Iterator`. A typical example implementation in *OpenJDK* is in [`AbstractList`](https://github.com/keerath/openjdk-8-source/blob/master/jdk/src/share/classes/java/util/AbstractList.java)
