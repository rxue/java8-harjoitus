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

### *Stream* Operations
#### *Intermediate Operations*
##### Interpretation of `Stream<T> sorted()` and `Stream<T> sorted(Comparator<? super T> comparator)`
The past tense probably indicates that after this *sorting* operation, the returned *stream* must be sorted already, which reflects the fact that a *stateful operation* may need to process the entire input before producing a result<sup>[Package java.util.stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)</sup> 

In the demo code [DemoSortingInfiniteStream.java](https://github.com/rxue/java8-perusharjoitus/blob/master/error_code/src/main/java/ruixue/ocpkasi/java_core/util/stream/DemoSortingInfiniteStream.java), as the intermediate stream retrieved from the *filter* method is still infinite, the *stateful* `sorted()` method will keep sorting the intermediate infinite stream of elements.

### Common methods in `Stream` and `Optional`

* empty
* filter
* flatMap
* map
* of  
