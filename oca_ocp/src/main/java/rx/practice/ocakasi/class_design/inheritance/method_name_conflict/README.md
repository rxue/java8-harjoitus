# Interface & abstract class
## Method Name Conflict
Mehtod name conflict happens when the parent class (either *concrete* or `abstract`) and interfaces contain duplicate methods, say with *covariant return type* and the same *signature*.
 * CASE 1: a *concrete class* `extends` another class (can be either *concrete* or *abstract*) and `implements` at least one interface in the same time
 * CASE 2: duplicate `default` methods encountered when an `interface` extends multiple interfaces
    * Solution: redeclare the duplicate `default` method in the sub-interface extending the multiple interfaces. The redeclaration can be either `default` or `abstract` without implementation
    * Sample code: https://github.com/rxue/java8-perusharjoitus/blob/master/src/main/java/practice/ocakasi/class_design/inheritance/CanSprint.java   

the method name conflict can be resolved. Reference: https://docs.oracle.com/javase/tutorial/java/IandI/override.html

Method name conflicts appear in the Java core API:
`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable`
