## Adapter
### Application of Object Adapter Pattern in Core Java
#### *Object Adapter* in `java.io`
##### `InputStreamReader` is the *Adapter* of `Reader` to Have Access to `InputStream`
`Reader` per se. is not able to read anything because, the lowest level of input abstraction is `InputStream`, through which Java reads input eventually. In order to make the `Reader` have access to `InputStream`, an *adapter* is needed. `InputStreamReader` is the *adapter* for `InputStream` to have access to `InputStream`. `InputStreamReader` has a *constructor* accepting the `InputStream` as a *parameter*. 
![object_adapter_inputstreamreader](https://user-images.githubusercontent.com/3033388/48624281-ae275b00-e9b4-11e8-9ebe-cdf6db54e844.jpg)
##### Similarly, `OutputStreamWriter` is the *Adapter* of `Writer` to Have Access to `OutputStream`



