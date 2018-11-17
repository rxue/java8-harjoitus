## *Decorator*
### Application of *Decorator* in Core Java
#### `FilterOutputStream`
`OutputStream` is the *component*, where the `close` and `flush` are the hook operations. The `close` hook operation is overridden in the decorator, `FilterOutputStream`, by calling the `flush` method on the purpose of not losing buffer data before the *stream* is closed

