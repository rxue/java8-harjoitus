## Buzzwords

* *Scaling*: a property when we add more resources such as CPUs, the performance results gradually improve
### *Independent Operations* VS *Stateful Operations*
* *Independent operations*
* *Stateful operations*

### `InterruptedException`<sup>Java Concurrency in Practice > 5.4. Blocking and Interruptible Methods</sup>
When a method can throw `InterruptedException`, it is telling you that it is a *blocking* method, and further that if it is *interrupted*, it will take an effort to stop *blocking* early 


## `Runnable` VS `Callable`
|                           |`Runnable`                       |`Callable<V>`                 
|---------------------------|---------------------------------|--------------------------
|                           |`@FunctionalInterface`           |`@FunctionalInterface`
|method name                |`run()`                          |`call()`                   
|method return value        |`void`                           |`T`                        
|*applicable design pattern*|*command* and *command processor*|*active object*            
 

## `ExecutorService`
### `shutDown()` VS `shutDownNow()`
|                                               |`shutDown()`                               |`shutDownNow()`
|-----------------------------------------------|-------------------------------------------|---------------
|return type                                    |`void`                                     |`List<Runnable>`
|how **previously submitted tasks** are handled |previously submitted tasks are **executed**|previously submitted tasks are **not executed**
|how **actively executing tasks** are handled   |                                           |**attempts** to stop all actively executing tasks
|blocking or not                                |not waiting                                |not waiting

### `awaitTermination()`
Used after *shut down* to wait until termination of all running tasks

 <sup>Reference: OCP Oracle Certified Professional Java SE 8 Programmer II: Study Guide > Chapter 7 Concurrency > Creating Threads with the `ExecutorService` > Shutting Down a Thread Executor</sup>

[DemoExecutorServiceShutdownNow](https://github.com/rxue/java8-perusharjoitus/blob/master/oca_ocp/src/main/java/ruixue/practice/ocpkasi/concurrency/DemoExecutorServiceShutdownNow.java) will hang during *run time* if the *shut down* is implemented with *interrupt* of *thread*. Demo is tested with *OpenJDK* and indeed hangs during *run time*.  

## *Synchronized Collections* `!=` *Concurrent Collection*

## `CyclicBarrier`
*Barriers* are waiting for other *threads*. 

### Protocol Suitable for Using *Barrier*
"Everyone meet at McDonald's at 6:00; once you get there, stay there until everyone shows up, and then we'll figure out what we're doing next"

### Rule of Using *CyclicBarrier*
Make sure that you set the number of available threads to be at least as large as your *CyclicBarrier* limit value. Otherwise the barrier would never be reached as the only threads avaiable in the pool are stuck waiting for the barrier to be complete. 

In the *codebase*, the `CyclicBarrier` object is shared among *tasks* and, the relationship between `CyclicBarrier` *instance* and the *tasks* routine is *aggregation*. The `CyclicBarrier` *instance* can be passed to multiple *tasks* through *constructor* or *setters*, and inside the *task* routine the `await` method of the `CyclicBarrier` instance has to be invoked once.
