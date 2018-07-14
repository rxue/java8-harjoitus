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
> [`Queue` impelementations generally do not allow insertion of `null` elements, such as `LinkedList`, do not prohibit insertion of `null`. Even in the implementations that permit it, `null` should not be inserted into a `Queue`, as `null` is also used as a special return value by the `poll` method to indicate that the *queue* contains no elements.](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)

For instance, *`ArrayDeque`*, as an implementation of `java.util.Deque` - sub-interface of `java.util.Queue`, cannot contain `null` elements because, `null` is used as a special return value in the `peek` and `poll` operations on `ArrayDeque` to refer to no available element. Moreover, the [documentation of `Deque` interface](https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html) strongly encourages to prohibit the insertion of `null` element.

#### Collections with *sorted* structure never do not allow insertion of `null` elements

* Sub-class of `SortedMap` - *`TreeMap`* - cannot contain `null` elements. 

 `TreeSet`, and `ConcurrentHashMap`


Collections such as `TreeMap` and `TreeSet` can not contain `null` elements because the implementation of `TreeMap` and `TreeSet` has a generic speical sorted *tree* structure - *binary search tree*. The *sorted* property of *binary search tree* in `TreeMap`, as an example, are implemented by means of either `Comparator` or *natural ordering*, meaning the elements of `TreeMap` has to be *instances* of *Comparable*. The *compare* methods of `Comparator` and `Comparable` have a common contract, say there is no sense to compare an element with `null`. Sample code reference: [TestAddNullElementToCollections](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/test/java/ruixue/practice/ocpkasi/core_java/collections/TestAddNullElementToCollections.java) 

Like `HashTable`, but unlike `HashMap`, the `ConcurrentHashMap` does not allow `null` to used as *key* nor *value*
