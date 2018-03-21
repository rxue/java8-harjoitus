# *IO Streams*
## *IO Stream* Nomenclatures
### *High-Level Streams* VS *Low-Level Streams*
* *Low-Level stream* connects directly with the source of the data, such as a `File`, an array, or a `String`. 
	* in the context of *decorator* design pattern, *low-level stream* refers to the *concrete component*
* *High-level Stream* is built on top of another *stream* using *wrapping*, the process by which an instance is passed to the constructor of another class and operations on the resulting instance are filtered and applied to the original instance.
	* in the context of *decorator* design pattern, *high-level stream* refers to the *decorator* and the *concrete decorator*
## Common *IO Stream* Operations
### Marking the `InputStream`
Reference: [java.io.InputStream](http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/8u40-b25/java/io/InputStream.java)

Relevant methods with default implementation:
* `public boolean markSupported() {return false}`
* `public synchronized void mark(int marklimit) {}`
* `public synchronized void reset() throws IOException {throws new IOException("mark/reset not supported");}`

So among the *sub-class*es of `InputStream`, if these 3 methods are not overridden, **marking operation** is not supported. `FileInputStream` is a typical case.  



