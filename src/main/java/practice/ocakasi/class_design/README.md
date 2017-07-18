|                                                   | interface                             | abstract class  |
|---------------------------------------------------|---------------------------------------|-----------------|
|`extends`  any class (abstract and <b>concrete</b>)| no                                    | <b>yes</b>      |
|`extends` interface                                | yes                                   | yes             |                 
|allow instance variables                           | no                                    | yes             |

## Method declaration
|                 | interface                                     | abstract class                                                                                       |
|-----------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------|
| static method   | **yes** (since Java 8)                        | yes                                                                                                  | 
| abstract method | yes (with default modifiers `public abstract`)| yes <ul><li>`abstract` as to be added</li><li>access modifier can not be `private`, otherwise all OK)|
