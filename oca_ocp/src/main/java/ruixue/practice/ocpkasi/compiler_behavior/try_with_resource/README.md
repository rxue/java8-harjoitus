## *Try-with-resource* Since Java SE 7
### *Implicit `finally`* 
There might be no `finally` block in the *try-with-resource* code, but it exists implicitly. So **a *try-with-resource* statement is permitted to omit both the `catch` and `finally` blocks**. 
#### Implicit `finally` Runs Before Any `catch`/`finally` Block
A *try-with-resource* statement is still allowed to have `catch` and/or `finally` blocks. They are run in addition to the implicit one. **The implicit `finally` block runs before any programmer-coded ones**.

Refer to: [DemoTryWithResource.java](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/main/java/ruixue/practice/ocpkasi/compiler_behavior/try_with_resource/DemoTryWithResource.java)


