## `Properties` per se. is a Cache
`Properties` extends the `Hashtable`, so it is a cache 

## `ResourceBundle`
### [Cache Management of ResourceBundle Instance](https://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html)
> Resource bundle instances created by the getBundle factory methods are cached by default, and the factory methods return the same resource bundle instance multiple times if it has been cached. getBundle clients may clear the cache, manage the lifetime of cached resource bundle instances using time-to-live values, or specify not to cache resource bundle instances. Refer to the descriptions of the getBundle factory method, clearCache, ResourceBundle.Control.getTimeToLive, and ResourceBundle.Control.needsReload for details.
