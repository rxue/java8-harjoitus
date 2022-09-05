# Concurrency

## *Iterator*
#### *Fail-fast* Iterator VS *Weakly Consistent* Iterator

### *Independent Operations* VS *Stateful Operations*
* *Independent operations*
* *Stateful operations*

### `InterruptedException`<sup>Java Concurrency in Practice > 5.4. Blocking and Interruptible Methods</sup>
In Java, when a method can throw `InterruptedException`, it is telling you that it is a *blocking* method, and further that if it is *interrupted*, it will take an effort to stop *blocking* early.

#### *Blocking Methods*
There are **two** ***blocking methods*** on the *application level* **implemented with `native` method call** in core Java's package `java.lang`. There are 3 *overloaded* `wait` methods in the `Object` class.  

**Class name**|**Modifier** |**Blocking method**            |**Return type**
--------------|-------------|-------------------------------|----------------------
`Object`      |`final`      |`wait()`                       |`void`
`Object`      |`final`      |`wait(long timeout)`           |`void`
`Object`      |`final`      |`wait(long timeout, int nanos)`|`void`
`Thread`      |`static`     |`sleep()`                      |`void`

##### Blocking methods in `java.util.concurrent`
Blocking methods in `java.util.concurrent` are implemented with the aforementioned `native` *blocking methods*, from where the `InterruptedException` is *propagate*d.

**Class/interface name**|**Blocking method**                                  
------------------------|-----------------------------------------------------
`BlockingQueue`         |<ul><li>`void put(E e)`</li><li>`boolean offer(E e, long timeout, TimeUnit unit)`</li><li>`E take()`</li><li>`E poll(long timeout, TimeUnit unit)`</li></ul>
`BlockingDeque<E>`      |<ul><li>`void putFirst(E e)`</li><li>`void putLast(E e)`</li><li>`boolean offerFirst(E e, long timeout, TimeUnit unit)`</li><li>`boolean offerLast(E e, long timeout, TimeUnit unit)`</li><li>`E takeFirst()`</li><li>`E takeLast()`</li><li>`E pollFirst(long timeout, TimeUnit unit)`</li><li>`E pollLast(long timeout, TimeUnit unit)`</li></ul>
`CyclicBarrier`         |`int await()`                      
`ExecutorService`       |<ul><li>`awaitTermination(long timeout, TimeUnit unit)`</li><li>`invokeAll(Collection<? extends Callable<T>> tasks)`</li><li>`invokeAny(Collection<? extends Callable<T>> tasks)`</li></ul>
`Future<V>`             |`get()`                                            

NB! From the list above, we can see that the **blocking methods can be timed**.

#### *Concurrent Collections* in `java.util.concurrent`
NB! Operations on *concurrent collections* are not necessarily *blocking*. Among the *concurrent collections* in Java SE, only *blocking queues*, `BlockingQueue` and its sub-interface `BlockingDeque`, contain *blocking methods* and **timed blocking methods**.   

## `Runnable` VS `Callable`
|                           |`Runnable`                       |`Callable<V>`                 
|---------------------------|---------------------------------|--------------------------
|annotation                 |`@FunctionalInterface`           |`@FunctionalInterface`
|method *signature*         |`run()`                          |`call()`                   
|method exception           |no exception                     |`throws Exception`                   
|method return value        |`void`                           |`V`
|*applicable design pattern*|*command* and *command processor*|*active object*            

Both are *functional interfaces*, say contains one and only one abstract method. In the aspect of the abstract method they have, neither of them contains arguments, but the return types differ, the `run()` method of `java.lang.Runnable` does not return anything, whereas the `call()` method of `java.util.concurrent.Callable` returns a *generic type* V.

## `ExecutorService`
### `ExecutorService` VS `Executor`
In comparison with `Executor`, *tasks* executed by `ExecutorService` are controllable as all the submissions of *tasks* return a `Future` or a `List<Future>`.  

#### `void Executor.execute(Runnable task)` VS `Future<?> submit(Runnable task)`
People might wonder why therke is still `submit` method for submitting `Runnable` when there is `execute` method already in the super-interface `Executor`. The key point of the answer to this question is the as the aforementioned, submission of *tasks* by `ExecutorService` returns a `Future<?>`, by means of which the submitted tasks are controllable. Refer to [TestExecutorServiceSubmit](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/test/java/ruixue/practice/ocpkasi/concurrency/TestExecutorServiceSubmit.java) 

### `invokeAll`
> you can wait for any or all of a collection of tasks to complete (using the `invokAny` or `invokeAll` methods)

Reference: Effective Java > Chapter 11 Concurrency > Item 80: Prefer executors, tasks and streams to threads

Demo: [DemoExecutorService.demoInvokeAll](#) proves in live that the `invokeAll` method is waiting until all the `Callable` tasks completes

### `shutdown()` VS `shutdownNow()`
|Comparison on the term                         |`shutdown()`                               |`shutdownNow()`
|-----------------------------------------------|-------------------------------------------|---------------
|return type                                    |`void`                                     |`List<Runnable>`
|how **previously submitted tasks** are handled |previously submitted tasks are **executed**|previously submitted tasks are **not executed**
|how **actively executing tasks** are handled   |                                           |**attempts** to stop all actively executing tasks
|blocking or not                                |not waiting                                |not waiting

### `awaitTermination()`
Used after *shut down*, i.e. `shutdown()` and `shutdownNow()`, to wait until termination of all running tasks

 <sup>Reference: OCP Oracle Certified Professional Java SE 8 Programmer II: Study Guide > Chapter 7 Concurrency > Creating Threads with the `ExecutorService` > Shutting Down a Thread Executor</sup>

[DemoExecutorServiceShutdownNow](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/main/java/ruixue/practice/ocpkasi/concurrency/DemoExecutorServiceShutdownNow.java) will hang during *run time* if the *shut down* is implemented with *interrupt* of *thread*. Demo is tested with *OpenJDK* and indeed hangs during *run time*.  

### `ScheduledExecutorService`
#### `scheduleAtFixedRate()` VS *cron* Jobs in Linux
`scheduleAtFixedRate()` resembles the *cron* jobs in *Linux* in the sense that both can result in the same action at the same time. Both `scheduleAtFixedRate()` and *cron* has a common case: a scheduled task is executed, then after the given fixed interval, i.e. the `FixedRate` of `scheduleAtFixedRate()`, this same task is executed again regardless of the state of the previous task, say the same previous task might still be running.      

However, `scheduleAtFixedRate()` has an *initialDelay* parameter, which differs from the *cron* jobs.  

## *Synchronized Collections* `!=` *Concurrent Collection*

## `CyclicBarrier`
*Barriers* are waiting for other *threads*. 

### Protocol Suitable for Using *Barrier*
"Everyone meet at McDonald's at 6:00; once you get there, stay there until everyone shows up, and then we'll figure out what we're doing next"

### Rule of Using *CyclicBarrier*
Make sure that you set the number of available threads to be at least as large as your *CyclicBarrier* limit value. Otherwise the barrier would never be reached as the only threads avaiable in the pool are stuck waiting for the barrier to be complete. 

In the *codebase*, the `CyclicBarrier` object is shared among *tasks* and, the relationship between `CyclicBarrier` *instance* and the *tasks* routine is *aggregation*. The `CyclicBarrier` *instance* can be passed to multiple *tasks* through *constructor* or *setters*, and inside the *task* routine the `await` method of the `CyclicBarrier` instance has to be invoked once.
