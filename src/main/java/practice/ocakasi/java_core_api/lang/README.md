## `String`
Common characters of `String` and primitive data type *wrapper classes*:

* belong to the same package `java.lang`
* *immutability*
* have `static` method `valueOf`
* have *overridden* `toString` method

### *String Pool*
*String pool*, also known as *intern pool*, is a location in the *Java virtual machine (JVM)* that collect all the *literal* strings

### Drill Down to Souce Code of [`String.substring(int start, int end)`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/String.java#String.substring%28int%2Cint%29)
```
    public String More ...substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return ((beginIndex == 0) && (endIndex == value.length)) ? this
                : new String(value, beginIndex, subLen);
    }
```
=> 
* `string.substring(0, string.length())` returns the same object the `string` *reference* variable references to
* `beginIndex` has to belong to `[0, value.length]`
* `endIndex` has to belong to `[beginIndex, value.length]`

=> 
  * `endIndex` >= `startIndex`
  * `string.substring(string.length(), string.length())` returns an empty string without throwing any exception

Refer to: https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/java_core_api/lang/StringPuzzler.java

## *Arrays* as *First-Class Object*
*Array* is *first-class object* in that:
* *Array* is an *Object*
	* can be initialized with `new` keyword
	* `equals` of *array* is not overridden
	* `equals` of *toString* is not overriden

`int[] array = new int[10];` => `java.util.List array = new java.util.List[10];` is legal as well

