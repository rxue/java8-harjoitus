## Adapter
As mentioned in Chapter 18 Base patterns > Gateway in the Patterns of Enterprise Application Architecture (P of EAA) of Martin Fowler,

> *Adapter* alters an implementation's interface to match another interface you need to work with.

### Application of Object Adapter Pattern in Core Java
#### *Object Adapter* in `java.io`
##### `InputStreamReader` is the *Adapter* of `Reader` for Accessing to `InputStream`
`Reader` per se. is not able to read anything because, the lowest level of input abstraction is `InputStream`, through which Java reads input eventually. In order to make the `Reader` have access to `InputStream`, an *adapter* is needed. `InputStreamReader` is the *adapter* of `Reader` for accesing to `InputStream`. It has a *constructor* accepting the `InputStream` as a *parameter*. 
![object_adapter_inputstreamreader](https://user-images.githubusercontent.com/3033388/48624281-ae275b00-e9b4-11e8-9ebe-cdf6db54e844.jpg)

* *Target*: `Reader`
* *Adapter*: `InputStreamReader`
* *Adaptee*: `InputStream`

Based on gof23, the relationship between *adaptee* and *adapter* should be *composition*. But in this practice, there is no direct composition relationship between the `InputStreamReader` and the `InputStream`, say ...

##### Similarly, `OutputStreamWriter` is the *Adapter* of `Writer` for Accessing to `OutputStream`



