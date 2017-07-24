# Interface & abstract class
## Method Name Conflict
Mehtod name conflict happens when the parent class (either *concrete* or `abstract`) and interfaces contain duplicate methods, say with *covariant return type* and the same *signature*.
 * CASE 1: a *concrete class* `extends` another class (can be either *concrete* or *abstract*) and `implements` at least one interface in the same time
 * CASE 2: a *concrete class* `implements` at least two interfaces
 * CASE 3: duplicate `default` methods encountered when an `interface` extends multiple interfaces
  * Solution: redeclare the duplicate `default` method in the sub-interface extending the multiple interfaces. The redeclaration can be either `default` or `abstract` without implementation
  * Sample code: https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/class_design/inheritance/CanSprint.java   

the method name conflict can be resolved. Reference: https://docs.oracle.com/javase/tutorial/java/IandI/override.html

Method name conflicts appear in the Java core API:
`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable`

## `extends`
|                                               | interface                             | abstract class                |
|-----------------------------------------------|---------------------------------------|-------------------------------|
|`extends`  class (abstract and <b>concrete</b>)| 0                                     | **only one**                  |
|`extends` interface                            | **many**                              | **no** (but can `implements`) |                 

Abstract class can extends concrete classes as well!

## Method declaration
|                 | interface                                     | abstract class                                                                                       |
|-----------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------|
| static method   | **yes** (since Java 8)                        | yes                                                                                                  | 
| abstract method | <ul><li>default modifier: `public abstract`</li><li>without `public abstract`, `public abstract` is added by compiler anyway</li></ul> | <ul><li>`abstract` has to be added explicitly</li><li>access modifier can not be `private`, otherwise `protected`, default *package-private*, or `public` are all OK)|

## Method implementation
* when implementing an *interface* method, access modifiers have to be `public` 
* when implementing an *abstract class* a method, apply the rules as `overriding` a method
