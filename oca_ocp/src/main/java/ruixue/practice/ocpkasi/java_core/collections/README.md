## `Collection`
### `Queue`
#### Operations on `Queue`
##### *Enqueue* - `boolean offer(E e)`
##### *Dequeue* - `E poll()` and *Peek* - `E peek()`
Implementation of both methods return `null` if this queue is empty, e.g. ArrayDeque. Therefore, conversely it is usually not allowed to add `null` element to a `Queue`. However, there is an exception, i.e. `LinkedList`, probably because it implemented `List` as well.

## `String` has a common method as `Collection` - `isEmpty()`

