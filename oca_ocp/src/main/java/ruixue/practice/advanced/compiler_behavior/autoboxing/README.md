## *Autoboxing*
Autoboxing came out since Java SE 5.

### Motivation of *Autoboxing*
Before Java SE 5, it is not possible to add numbers with a *primitive type* to a `Collection` directly. The *autoboxing* makes adding numbers to a `Collection` directly come true.

### [Example of Autoboxing of `int`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/advanced/compiler_behavior/autoboxing/IntegerAutoboxing.java)
* `Integer integer = Integer.valueOf(201);` are compiled to:

```
7: sipush        201
10: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
13: astore_2
```
* `Integer autoboxedInteger = 201;` are compiled to:
```
0: sipush        201
3: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
6: astore_1
```
The code and comments above proves that the *autoboxing* is like *syntax sugar* as the assignment of `Integer` is actually *parsed* to `Integer.valueOf(I)`. There are only 3 *overloaded* methods of `Integer.valueOf`:

* `public static Integer valueOf(int i)`
* `public static Integer valueOf(String s)`
* `public static Integer valueOf(String s, int radix)`

This fact proves that the *autoboxing* happens only within the same number type, say
* `int` *autoboxed* to `Integer`
* `double` *autoboxed* to `Double`
* `float` *autoboxed* to `Float`
* ...



