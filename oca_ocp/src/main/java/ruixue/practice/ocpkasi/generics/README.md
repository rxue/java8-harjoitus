## *Generics*
### Generic Classes
When declaring a generic class, you must specify a name for the *formal type parameter* in angle bracket and, a *type parameter* can be named anything you want. The convention is to use single uppercase letters to make it obvious that they aren't real class names. For example, 
* by convention, `public class Crate<T> {}`
* legal but bad practice, `public class Crate<Object> {}`

### *Generic Methods*

### *Bounds*
#### *Wildcard Generic Type* (Generic wildcard) i.e. `?`
You can use generic wildcards in three ways:
Type of bound                     |Syntax           |Example                                                            |
------------------------------------------------------------------------------------------------------------------------|
Unbounded wildcard                |`?`              |`List<?> l = new ArrayList<String>();`                             |      
------------------------------------------------------------------------------------------------------------------------|
Wildcard with an upper bound with |`? extends` type |`List<? extends Exception> l = new ArrayList<RuntimeException>();` |
------------------------------------------------------------------------------------------------------------------------|
Wildcard with a lower bound with  |`? super` type   |`List<? super Exception> l = new ArrayList<Object>();`             |

