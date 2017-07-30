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

