# Compiler's Behavior
Compiler's behavior as mentioned in Java books can be proved with the `javap` tool from *JDK*
## Autoboxing
### [Example Autoboxing of `int`]()
|`Integer autoboxedInteger = 201;`		|`Integer integer = Integer.valueOf(201);`	|
|-----------------------------------------------|-----------------------------------------------|
`0: sipush        201<br />
 3: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;<br />
 6: astore_1`					|`7: sipush        201<br />
      						  10: invokestatic  #16                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;<br />      
						  13: astore_2					|
`


