## Stream
[*Stream Operations* and *Pipelines*](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#StreamOps)

If you try to call `System.out.println(stream)`, you'll get something like `java.util.stream.ReferencePipeline$3@4517d9a3`.<sup>reference: OCP Oracle Certified Professional Programmer II - Study Guide > Chapter 4 Functional Programming > Using Stream > Creating Stream Sources (Page 189)</sup> 

=> `java.util.stream.Stream` didn't overrided `toString()`

Stream can be categorized to 2 types:

* *serial stream*
* *parallel stream*
  * achieved by 
    * `Stream.parallel()` 
    * `Collection.parallelStream()`
  * By default, the number of threads available in a parallel stream is related to the number of available CPUs in your environment.

### Common methods in `Stream` and `Optional`

* empty
* filter
* flatMap
* map
* of  
