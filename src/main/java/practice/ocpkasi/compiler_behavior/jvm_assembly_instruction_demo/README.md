# *Explicit Cast* - [`PrivateFieldDeclarationWithExplicitCast.java`]() VS [`PrivateFieldDeclaration.java`]()
When decompiling the class files of these two Java sources to JVM *instructions*, regardless of the instruction parameters, the only difference between these two assembly code is `checkcast`

=> the explicit cast in [`PrivateFieldDeclarationWithExplicitCast.java`]() are compiled to `checkcast`  
