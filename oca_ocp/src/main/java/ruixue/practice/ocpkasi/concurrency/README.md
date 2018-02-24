## Buzzwords

* *Scaling*: a property when we add more resources such as CPUs, the performance results gradually improve
### *Independent Operations* VS *Stateful Operations*
* *Independent operations*
* *Stateful operations*

### About `InterruptedException`<sup>Java Concurrency in Practice > 5.4. Blocking and Interruptible Methods</sup>
When a method can throw `InterruptedException`, it is telling you that it is a *blocking* method, and further that if it is *interrupted*, it will take an effort to stop *blocking* early 


## `Runnable` VS `Callable`

## *Synchronized Collections* `!=` *Concurrent Collection*

## `CyclicBarrier`
*Barriers* are waiting for other *threads*. 

### Protocol Suitable for Using *Barrier*
"Everyone meet at McDonald's at 6:00; once you get there, stay there until everyone shows up, and then we'll figure out what we're doing next"

### Rule of Using *CyclicBarrier*
Make sure that you set the number of available threads to be at least as large as your *CyclicBarrier* limit value. Otherwise the barrier would never be reached as the only threads avaiable in the pool are stuck waiting for the barrier to be complete.    
