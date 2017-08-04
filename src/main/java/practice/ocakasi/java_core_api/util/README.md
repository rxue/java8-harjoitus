# *Array*
## *Array* as a *First-Class Object*
*Array* is *first-class object* in that:
* *Array* is an *Object*
	* can be initialized with `new` keyword
	* `Object.equals` is not overridden
	* `Object.toString` is not overriden

`int[] array = new int[10];` => `java.util.List array = new java.util.List[10];` is legal as well

### Mentioned *Static Methods* in `Arrays` *Class*
* `toString` with many *overloading* methods
* `sort`
* `binarySearch`
* `static <T> List<T> asList(T ...a)`

# *Collections*
## Mentioned *Static Methods* in `Collections` *Class*
* `sort`

## `List` > `ArrayList`
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
* **`toArray`** - implemented by calling `Arrays.copyOf`, which is a *shallow copy*, meaning only the *references* get copied - there is no duplication of the objects themselves 
  * `Object[] toArray()` - Be wary that it returns an array of *Objects*
  * `<T> T[] toArray(T a)` - It is usually called by giving an empty array - `list.toArray(new String[0])`. The advantage of specifying a size of 0 for the parameter is that Java will create a new array of the proper size for the return value. If you like, you can suggest a larger array to be used instead. If the ArrayList fits in that array, it will be returned. Otherwise, a new one will be created.

and `AbstractList<E>` overrode

* `boolean equals(Object o)`

### `ArrayList` Constructor
* `ArrayList()`
* `ArrayList(int initialCapacity)`
* [`ArrayList(Collection<? extends E> c)`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/java/util/ArrayList.java#ArrayList.%3Cinit%3E%28java.util.Collection%29) - the essense is that the *elements* of the given `Collection` instance is *shallow* copied into the *array instance variable* of this `ArrayList` 
