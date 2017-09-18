## Autoboxing
### [Example Autoboxing of `int`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/compiler_behavior/autoboxing/IntegerAutoboxing.java)
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
