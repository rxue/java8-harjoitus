## ~~*Type erasure*~~
~~The process of removing the generics syntax from original code is referred to as *type erasure*. *Type erasure* allows your ode to be compatible with older versions of Java that do not contain generics.~~

## *Generics*

The `main` method in both [`DemoRawType`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocpkasi/compiler_behavior/generics/DemoRawType.java) and [`DemoGenericType`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocpkasi/compiler_behavior/generics/DemoGenericType.java) are compiled to the same Java bytecode instructions:
```  
public static void main(java.lang.String[]);
    Code:
       0: new           #16                 // class java/util/ArrayList
       3: dup
       4: invokespecial #18                 // Method java/util/ArrayList."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #19                 // String String
      11: invokeinterface #21,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      16: pop
      17: aload_1
      18: iconst_0
      19: invokeinterface #27,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      24: checkcast     #31                 // class java/lang/String
      27: astore_2
      28: return
```
=> On the Java assembly instruction level, [`DemoRawType`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocpkasi/compiler_behavior/generics/DemoRawType.java) and [`DemoGenericType`](https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocpkasi/compiler_behavior/generics/DemoGenericType.java) are equivalent

and

In `DemoRawType.java`, there is *explicit cast*, which corresponds to the instruction `24: checkcast  #31`; whereas in `DemoGenericType.java`, there is no *explicit cast* at all

=> With *generic types*, Java (compiler) writes the cast for us. <sup>(reference: OCP Oracle Certified Professional Programmer II - Study Guide > Chapter 3 Generics and Collections > Working with Generics > Interacting With Legacy Code (Page 115))</sup> 
