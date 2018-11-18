## *Decorator*
### Application of *Decorator* in Core Java
#### `FilterOutputStream` - a *Decorator* Used in Combination with the *Template Method*  
`OutputStream` is the *component*, where the `close` and `flush` are the hook operations. The `close` hook operation is overridden in the decorator, `FilterOutputStream`, by calling the `flush` method on the purpose of not losing buffer data before the *stream* is closed
![decorator_io filteroutputstream uml](https://user-images.githubusercontent.com/3033388/48677864-f9439880-eb83-11e8-8f44-ce77cc94d23b.jpg)

