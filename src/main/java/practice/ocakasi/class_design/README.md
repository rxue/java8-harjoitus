|                                                   | interface                             | abstract class  |
|---------------------------------------------------|---------------------------------------|-----------------|
|`extends`  any class (abstract and <b>concrete</b>)| no                                    | <b>yes</b>      |
|`extends` interface                                | yes                                   | yes             |                 
|allow instance variables                           | no                                    | yes             |

## Method declaration
|                 | interface                                     | abstract class                                                                                       |
|-----------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------|
| static method   | **yes** (since Java 8)                        | yes                                                                                                  | 
| abstract method | yes <ul><li>default modifier: `public abstract`</li><li>without `public abstract`, `public abstract` is added by compiler anyway</li></ul> | yes <ul><li>`abstract` has to be added</li><li>access modifier can not be `private`, otherwise all OK)|
