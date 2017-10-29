## `RuntimeException` aka *Unchecked Exception*
### `UnsupportedOperationException`
Typically used in:
* [*stub*](https://books.google.fi/books?id=mxZBPSjSEYUC&pg=PA308&redir_esc=y#v=onepage&q&f=false)
* *concreted methods* in *abstract class*, and these methods are usually mandatory to be overriden by extended concrete class. For instance, [`java.util.AbstractList`](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8-b132/java/util/AbstractList.java)

## *Checked Exception*

## *Multi-catch*
Rules:
* Java intends multi-catch to be used for exceptions that aren't related 
	* => One exception in *multi-catch* cannot be the subclass of any other excpetion in the same *multi-catch*. For instance, `catch(FileNotFound | IOException e){}` causes compilation error because, `FileNotFoundException extends IOExceptio`
* *Mmulti-catch* is *effectively final* 

## *try-with-resource* Exception

### `AutoCloseable`
Closeable is subclass of AutoCloseable: [`public interface Closeable extends AutoCloseable`](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

## *Suppressed Exceptions* (since Java 7)
Cause: The *try-with-resource* since Java 7 can throw completely different exceptions at the same time:
* multiple open resource statements inside the `try` bracket
* the exception inside the `try` block
