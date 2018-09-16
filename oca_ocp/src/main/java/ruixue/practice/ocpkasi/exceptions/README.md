## *Unchecked Throwables*
> There are two kinds of unchecked throwables: *runtime exceptions* and *errors*

Reference: Effective Java (Third Edition) > Chapter 10 Exceptions > Item 70: Use checked exceptions for recoverable conditions and runtime exceptions for programming errors

All other *Throwables* are *checked*, which the program has to `catch`

### `UnsupportedOperationException`
Typically used in:
* [*stub*](https://books.google.fi/books?id=mxZBPSjSEYUC&pg=PA308&redir_esc=y#v=onepage&q&f=false)
* *concreted methods* in *abstract class*, and these methods are usually mandatory to be overridden by extended concrete class. For instance, [`java.util.AbstractList`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/AbstractList.java)

## *Checked Exception*
A *checked exception* includes *`Exception` and all subclasses that do not extend `RuntimeException`*

> A *checked exception* is an exception that represents a problem with the possibility of recovery, and for which the **developer must provide a workaround**.

Reference: Beginning Java 7 > Chapter 3 > Exceptions > The Throwable Class Hierarchy > *Checked Exceptions* VS *Runtime Exceptions*

### Various values of `SQLState` explains that `SQLException` is not (only) `IOException`
Consider `02000`, no data, as an example, this could happen when the connection is successful, say free from `IOException`. 

In summary, `SQLException` might be due to the *IO* but also something else, so merely `IOException` cannot describe all the SQL exceptions => design decision: `SQLException` is not sub-class of `IOException` 

## *Multi-catch*
Unique rules comparing with legacy `catch` block:
* Java intends multi-catch to be used for exceptions that aren't related 
	* => One exception in *multi-catch* cannot be the subclass of any other excepetion in the same *multi-catch*. For instance, `catch(FileNotFound | IOException e){}` causes compilation error because, `FileNotFoundException extends IOException`
* As with *multi-catch*, Java uses the common `Exception` superclass for the variable internally, *Multi-catch* is *effectively final*, meaning Java forbids reassign the exception variable in a *multi-catch* block

## *try-with-resource*
### `AutoCloseable` VS `Closeable`
* Both types of resources are allowed to be initialized/opened in the try clause because, `Closeable` is subclass of `AutoCloseable`: [`public interface Closeable extends AutoCloseable`](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)
* `close()` of `AutoCloseable` `throws Exception`, whereas `close()` of `Closeable` `throws IOException`

### *Suppressed Exceptions* (since Java 7)
Cause: The *try-with-resource* since Java 7 can throw completely different exceptions at the same time:
* multiple open resource statements inside the `try` bracket
* the exception inside the `try` block
