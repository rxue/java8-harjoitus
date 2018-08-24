## Rules of Using `enum`
The `enum` example [ruixue.practice.advanced.compiler_behavior.enums.Color.java](https://github.com/rxue/java8-perusharjoitus/tree/master/oca_ocp/src/main/java/ruixue/practice/advanced/compiler_behavior/enums) can be decompiled (in the class directory call `javap Color`) to the following code:
```
public final class ruixue.practice.advanced.compiler_behavior.enums.Color extends java.lang.Enum<ruixue.practice.advanced.compiler_behavior.enums.Color> {
  public static final ruixue.practice.advanced.compiler_behavior.enums.Color WHITE;
  public static final ruixue.practice.advanced.compiler_behavior.enums.Color RED;
  static {};
  public java.lang.String getColor();
  public static ruixue.practice.advanced.compiler_behavior.enums.Color[] values();
  public static ruixue.practice.advanced.compiler_behavior.enums.Color valueOf(java.lang.String);
}
```  

* All `enum`s implicitly extend `java.lang.Enum`<sup>[Enum Types](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)</sup>



 => You cannot `extends` any other `enum`.

The basic idea behind Java’s `enum` types is simple: they are classes that export one instance for each enumeration constant via a `public static final` field. Enum types are *effectively final*, by virtue of having *private constructors*. Because **clients can neither create instances of an enum type nor extend it**, there can be no instances but the declared enum constants. In other words, enum types are *instance-controlled* (page 6). They are a generalization of *singletons* (Item 3), which are essentially single-element enums. <sup>[Effective Java (2nd Edition) >> Chapter 6 Enums and Annotations >> item 30: Use enums instead of int constants]</sup>
