## *Try-with-resource* Since Java SE 7
### Implicit `finally` *Clause* 
There might be no `finally` block in the *try-with-resource* code, but the `finally` *clause* exists implicitly. Note that the implicit `finally` *clause* is different from the explicit `finally` *block* in that a [*block*](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html) is defined as a group of zero of more *statements* between balanced braces. Put another way, a compulsory component of a *block* is the *balanced braces* and thus a *block* is **visible**. Similarly, in the later section, the `try` *clause* differs from `try` *block* as well. So **a *try-with-resource* statement is permitted to omit both the `catch` and `finally` blocks**. 
#### Implicit `finally` Runs Before Any `catch`/`finally` Block
A *try-with-resource* statement is still allowed to have `catch` and/or `finally` blocks. They are run in addition to the implicit one. **The implicit `finally` block runs before any programmer-coded ones**.

Refer to: [DemoTryWithResource.java](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/main/java/ruixue/practice/ocpkasi/compiler_behavior/try_with_resource/DemoTryWithResource.java)

### The *Scope* of *Resources* Created in the `try` *Clause*
The *resources* created in the `try` *clause* are only in scope within the `try` block. This can also explain why the implicit `finally` runs before any `try`/`catch` block. 


