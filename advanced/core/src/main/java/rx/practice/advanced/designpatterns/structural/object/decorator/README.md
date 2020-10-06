## *Decorator*
### Application of *Decorator* in Core Java
#### `FilterOutputStream` - a *Decorator* Used in Combination with the *Template Method*  
The `FilterOuputStream` perfectly matches the *decorator* pattern. 

The *component* - `OutputStream`, as an `abstract` class, contains both *hook operations*, `close()` and `flush()`, and an *abstract operation*, `write(byte b[], int off, int len)`, in the context of *template method*. Starting from the `OutputStream`, `FileOutputStream` is the entry point of object initialization. This *concrete component* implemented the abstract operation, `write(byte b[], int off, iknt len)`, and the hook operation `close()`, but the `flush()` is not overridden due to the fact that `FileOutputStream` is not buffered. 

The *decorator*, `FilterOutputStream`, has an `OutputStream` instance variable, which is used for extension, such as buffering and writing object etc. The hook operations `flush()` and `close()` are delegated to this instance variable.

Hereby, the `flush()` method is not overridden in the *concrete component* but in the *decorator*, which expressed the purport of hook operation. 

where the `close` and `flush` are the hook operations. The `close` hook operation is overridden in the decorator, `FilterOutputStream`, by calling the `flush` method on the purpose of not losing buffer data before the *stream* is closed
![decorator_io filteroutputstream uml](https://user-images.githubusercontent.com/3033388/48677864-f9439880-eb83-11e8-8f44-ce77cc94d23b.jpg)

