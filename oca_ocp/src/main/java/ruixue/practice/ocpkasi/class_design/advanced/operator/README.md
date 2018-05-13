## [Type Comparison Operator `instanceof`](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.20.2)

**If a cast([§15.16](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.16)) of the *RelationalExpression* to the *ReferenceType* would be rejected as a compile-time error, then the `instanceof` relational expression likewise produces a compile-time error.** => 

* Compilation of statement with `instanceof` is directly related to *cast* 
* Before upcast, always remember to *check* with `instanceof`  

