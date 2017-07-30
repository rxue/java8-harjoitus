# Compiler's Behavior
Compiler's behavior as mentioned in Java books can be proved with the `javap` tool from *JDK*
## Autoboxing
### [Example Autoboxing of `int`]()
|`Integer autoboxedInteger = 201;`		|`Integer integer = Integer.valueOf(201);`	|
|-----------------------------------------------|-----------------------------------------------|
|`0: sipush        201`				|`7: sipush        201`				|
|`3: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;`	|`10: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;`	|



6: astore_1```	|```

10: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
13: astore_2					|
`


