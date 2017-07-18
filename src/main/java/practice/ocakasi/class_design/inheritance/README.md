# Interface & abstract class
Method conflicts are allowed. Reference: https://docs.oracle.com/javase/tutorial/java/IandI/override.html

Method conflicts appear in the Java core API:
`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable`

## `extends`
|                                               | interface                             | abstract class  |
|-----------------------------------------------|---------------------------------------|-----------------|
|`extends`  class (abstract and <b>concrete</b>)| no                                    | <b>yes</b>      |
|`extends` interface                            | yes                                   | yes             |                 

Abstract class can extends concrete classes as well!

## Method declaration
|                 | interface                                     | abstract class                                                                                       |
|-----------------|-----------------------------------------------|------------------------------------------------------------------------------------------------------|
| static method   | **yes** (since Java 8)                        | yes                                                                                                  | 
| abstract method | <ul><li>default modifier: `public abstract`</li><li>without `public abstract`, `public abstract` is added by compiler anyway</li></ul> | <ul><li>`abstract` has to be added explicitly</li><li>access modifier can not be `private`, otherwise `protected`, default package-privat, or `public` are all OK)|

## Method implementation
* when implementing an *interface* method, access modifiers have to be `public` 
* when implementing an *abstract class* a method, apply the rules as `overriding` a method
