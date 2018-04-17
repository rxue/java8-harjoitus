## `Collection`
### `Queue`
#### Operations on `Queue`
##### *Enqueue* - `boolean offer(E e)`
##### *Dequeue* - `E poll()` and *peek* - `E peek()`
Both methods return `null` if this queue is empty. Due to this reason, implementations of `Queue` does not allow insertion of `null` elements, e.g. ArrayDeque. However, there is an exception, i.e. `LinkedList`, probably because it implemented `List` as well.

## `String` has a common method as `Collection` - `isEmpty()`

