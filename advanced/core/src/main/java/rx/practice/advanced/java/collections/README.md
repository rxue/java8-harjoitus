## Evolution of Java *Collections*
JDK 1.0     |JDK 1.2    |JDK 1.6
------------|-----------|------------
`Vector`    |`ArrayList`|-
`HashTable` |`HashMap`  |-
`Stack`     |-          |`ArrayDeque`

### Caveat on `LinkedList`
 * `LinkedList` can have `null` element
 * `peek()` method on it returns `null` if the list is empty => use `peek()` judiciously
