## *Arrays* as *First-Class Object*
*Array* is *first-class object* in that:
* *Array* is an *Object*
	* can be initialized with `new` keyword
	* `equals` of *array* is not overridden
	* `equals` of *toString* is not overriden

`int[] array = new int[10];` => `java.util.List array = new java.util.List[10];` is legal as well

### Frequently Used *Static Methods* in `Arrays` *Class*
* `toString` with many *overloading* methods
* `sort`
* `binarySearch`
* `static <T> List<T> asList(T ...a)`

## `ArrayList`
`ArrayList` class is declared as `public class ArrayList<E> extends` **`AbstractList<E>`** `implements` **`List<E>`** `, RandomAccess, Clonable, Serializable`, where the **`List`** contains the following methods:

* `add`
  * `boolean add(E element)` 
  * `void add(int index, E element)`
* `remove` - selection of the overloading methods by Java compiler is tricky: *numeric promotion* over *autoboxing*
  * `boolean remove(Object object)`
  * `E remove(int index)`
* `E set(int index, E newElement)`
* `boolean isEmpty()`
* **`int size()`** - NOTE! This is not length!
* `void clear()`
* `boolean contains(Object o)`
* **`toArray`**
  * `Object[] toArray()`
  * `<T> T[] toArray(T a)`

and `AbstractList<E>` overrode

* `boolean equals(Object o)`
