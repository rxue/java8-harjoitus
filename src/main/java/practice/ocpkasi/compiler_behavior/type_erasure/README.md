## *Type erasure*
The process of removing the generics syntax from original code is referred to as *type erasure*. *Type erasure* allows your ode to be compatible with older versions of Java that do not contain generics.

The `main` method in both [``]() and [``]() are compiled to Java bytecode instructions:
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
