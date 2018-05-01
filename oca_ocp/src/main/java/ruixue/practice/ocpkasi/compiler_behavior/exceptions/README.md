## `Exception`
### *Checked Exception*
### The Rationale of How A Method Should *Declare* or *Handle Exceptions*
There are usually other method calls inside a method. It is common that some invoked methods might *throw checked exceptions*. The compiler can determine if the method should *declare* or *handle exceptions* on the base of the *signatures* of those invoked methods inside other than the method bodies of those invoked methods.

For instance, in the code [UncaughtException.java](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/main/java/ruixue/ocpkasi/exception/UncaughtException.java), there is a compilation error on the 8th line when the `play("webby")` is called because, the `play(String dogName) throws Exception` indicates that it might throw an `Exception`, i.e. *checked exception*, thus the *main method* has to either *declare* the `Exception` or *handle* it.  
