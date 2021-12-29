## My Misunderstanding on the main thread
I previously throught, in case the *main thread* has generated other normal threads, the termination of *main thread* will cause the termination of a the JVM process. In fact this is undewrstood wrong, even the *main thread* terminates, the other generated *normal thread* will still keep running.

### Reasoning: [JSL 12.8](https://docs.oracle.com/javase/specs/jls/se8/html/jls-12.html#jls-12.8)

> A program terminates all its activity and exits when one of two things happens:
> * All the threads that are not daemon threads terminate.
> * Some thread invokes the exit method of class Runtime or class System, and the exit operation is not forbidden by the security manager.

## [`Future<V>`](https://www.youtube.com/watch?v=2NAlvSkK9-k&t=760s)
`Future<V>` represents result of an asynchornous *two-way* task

