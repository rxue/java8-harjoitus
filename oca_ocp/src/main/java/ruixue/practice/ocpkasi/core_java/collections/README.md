# *Java Collection Framework* (short for JCF)
## `Collection`
### `Queue`
#### Operations on `Queue`
##### *Enqueue* - `boolean offer(E e)`
##### *Dequeue* - `E poll()` and *Peek* - `E peek()`
Implementation of both methods return `null` if this queue is empty, e.g. `ArrayDeque`. Therefore, conversely it is usually not allowed to add `null` element to a `Queue`. However, there is an exception, i.e. `LinkedList`, probably because it implemented `List` as well.

## `String` has a common method as `Collection` - `isEmpty()`

## Summary
### Collections Not Accepting `null` Elements
#### `Queue` implementations generally do not allow insertion of `null` elements
> [`Queue` implementations generally do not allow insertion of `null` elements, such as `LinkedList`, do not prohibit insertion of `null`. Even in the implementations that permit it, `null` should not be inserted into a `Queue`, as `null` is also used as a special return value by the `poll` method to indicate that the *queue* contains no elements.](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

*`ArrayDeque`*, as an implementation of `java.util.Deque` => `java.util.Queue`, cannot contain `null` elements because, `null` is used as a special return value in the `peek` and `poll` operations on `ArrayDeque` to refer to no available element.

The reason for `LinkedList` to allow `null` elements is probably because its implementation focuses on `List` other than `Deque`

#### Collections with *sorted* structure never do not allow insertion of `null` elements
In Java, objects can be sorted with `Comparator`. If no `Comparator` is provided, [*natural ordering*](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html), meaning objects are *cast* to `Comparable` and then sorted, will be applied.    

The implementation of `SortedMap` (e.g. `TreeMap`), as the name indicates, has to ensure that the *keys* of the `Set` are sorted on base of *Natural ordering* when the `Comparator` is not provided. =>

* A tuple whose key is not sub-classes of *Comparable*, will not be allowed to be put into the `SortedMap`. Code demo reference: [TestAddNonComparableElementToSortedCollections](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/test/java/ruixue/practice/ocpkasi/core_java/collections/TestAddNonComparableElementToSortedCollections.java)

* `null` can never be a key of a `SortedMap` due to the reflexive contract of `int compareTo(T o)` implementation in the `Comparable` *interface*: 

> [The implementor must ensure sgn(x.compareTo(y)) == -sgn(y.compareTo(x)) for all x and y](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#compareTo-T-)

Code demo reference: [TestAddNullElementToCollections](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/test/java/ruixue/practice/ocpkasi/core_java/collections/TestAddNullElementToCollections.java)

The same goes with `SortedSet`, for instance `TreeSet`, as `Set` are usually implemented by means of `Map`
