## *High-Level Streams* VS *Low-Level Streams*
* *Low-Level stream* connects directly with the source of the data, such as a `File`, an array, or a `String`. 
	* in the context of *decorator* design pattern, *low-level stream* refers to the *concrete component*
* *High-level Stream* is built on top of another *stream* using *wrapping*, the process by which an instance is passed to the constructor of another class and operations on the resulting instance are filtered and applied to the original instance.
	* in the context of *decorator* design pattern, *high-level stream* refers to the *decorator* and the *concrete decorator*
