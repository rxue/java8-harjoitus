## Source code of [`java.lang.Object.equals(Object j)`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/java/lang/Object.java#Object.equals%28java.lang.Object%29)
The implementation is way simple: 
```
public boolean equals(Object obj) {
  return (this == obj);
}
```

## `String` VS `StringBuilder`
### Same Methods Among `String` and `StringBuilder` 
4 methods in `String` and `StringBuilder` work exactly the same, they are:

* `charAt`
* `indexOf`
* `length`
* `substring` - Returns a **new String** that contains a subsequence of characters currently contained in this character sequence
  * Both returns `String` object
  * `String substring(int start, int end)` - the `end` is the **exclusive** end index and `end` must be smaller or equal to the length of the relevant `String` object 

At heart, from the perspective of source code, these methods don't modify the *instance variables*.

### Comparison of Methods between `String` and `StringBuilder`
|                   | **`String`**                                  | **`StringBuilder`**                         |
|-------------------|-----------------------------------------------|---------------------------------------------|
|`toLowerCase`      | exists                                        | does not exist                              |
|`toUpperCase`      | exists                                        | does not exist                              |
|`equalsIgnoreCase` | exists                                        | does not exist                              |
|`startWith`        | exists                                        | does not exist                              |
|`endWith`          | exists                                        | does not exist                              |
|`contains`         | exists                                        | does not exist                              |
|`equals`           | **`@overide` `Object.equals(Object obj)`**    | **`inherits` `Object.equals(Object obj)`**  |
|`replace`          | <ul><li>`replace(char oldChar, char newChar)`</li><li>`replace(CharSequence target, CharSequence replacement)`</li><li>*Immutable* => returns `new` `String`</li></ul> | <ul><li>`replace(int start, int end, String str)`</li><li>*builder design pattern* => returns the instance, per se</li><li>The `end` index is **exclusive** and, at heart, from the aspect of source code, if the `end` is greater than the length of the relevant string, `end` is set to the length of the relevant string</li></ul> |
|`append`           | does not exist                              | exists<ul><li>`Overloaded` with parameters of all primitive data types, `CharSequence` and other `Object` types</li></ul> |
|`insert`           | does not exist                              | exists                                      |
|`delete`           | does not exist                              | exists<ul><li>`delete(int start, int end)`</li><li>The `end` index is **exclusive** and, at heart, from the aspect of source code, if the `end` is greater than the length of the relevant string, `end` is set to the length of the relevant string</li></ul> |
|`reverse`          | does not exist                              | exists                                      |

As to `StringBuilder`, the following methods contains both **start index** and **end index** as parameters:

* `substring(int start, int end)`  
* `replace(int start, int end, String str)` (not included in OCA)
* `delete(int start, int end)`

The common character of the **end index** in all the three methods is the **exclusiveness**, say the `char` in the **end index** is exclusive in the computation. In the `substring` method, the `end index` is more restrictive, say it must be `<=` the length of the relevant string. Whereas in the other two methods, the **end index** can be even greater than the length of the string because, at heart, from the aspect of source code of [java.lang.AbstractStringBuilder#delete](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/lang/AbstractStringBuilder.java#AbstractStringBuilder.delete%28int%2Cint%29) (line 731-732), if the `end` is greater than the length of the relevant string, `end` is  set to the length of the relevant string.
