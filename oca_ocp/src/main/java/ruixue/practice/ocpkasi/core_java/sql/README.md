## [*JDBC*](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/) Based on [JDBC 4.2 Specification](http://download.oracle.com/otndocs/jcp/jdbc-4_2-mrel2-spec/index.html)
About automatic *close* resources:
* Closing a `Connection` also closes the `Statement` and `ResultSet`
* Closing a `Statement` also closes the `ResultSet`
* *JDBC* automatically closes a `ResultSet` when you run another SQL statement from the same `Statement`
### `Connection`
#### How to get `Connection`
There are two different ways of getting a *JDBC* `Connection`:

* legacy way: through *service access API* in the context of *service provider framework*<sup>Reference: Effective Java > Chapter 2: Creating and Destroying Objects > Item 1: Consider static factory methods instead of constructors</sup>, i.e. the *static factory method* `DriverManager.getConnection(String url)` or its *overloaded* version like `DriverManager.getConnection(String url, String user, String password)` etc.
* through `DataSource` since *JDBC 2.0*

#### [The format of `Connection` URL](https://docs.oracle.com/cd/B28359_01/java.111/b31224/urls.htm#BEIJFHHB)
`jdbc:vendorName:[driverType:][user/password:][@][address/]databaseName`

From the format above, the part in square brackets means optional => only the **`vendorName`** and the **`databaseName`** at the end are **mandatory**

In Oracle database, the `driverType` might be `oci`, `thin`, `kprb` etc.

#### Closing `Connection` Objects
> An application calls the method `Connection.close()` to indicate that it has finished using a connection. All Statement objects created from a given Connection object will be closed when the close method for the Connection object is called.<sup> JDBC 4.2 Specification > 9.6.4.1 Connection.close</sup>

### `Statement` Retrieved from `Connection`
#### Closing `Statement` Objects
> Closing a Statement object will close and invalidate any instances of ResultSet produced by that Statement object. The resources held by the ResultSet object may not be released until garbage collection runs again, so it is a good practice to explicitly close ResultSet objects when they are no longer needed.<sup> JDBC 4.2 Specification > 13.1.4 Closing Statements</sup> 
  
### `ResultSet`

> [A ResultSet object is automatically closed when the Statement object that generated it is closed, re-executed, or used to retrieve the next result from a sequence of multiple results.](https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html)

The type of `ResultSet` can be defined in two dimensions:
* *scrollable*, in relation to which there are the following *constant* `int` defining the scrollability:
  * `ResultSet.TYPE_FORWARD_ONLY` - the *default value* in a `ResultSet` in case no `ResultSet.TYPE_`... is given when creating the `statement`
  * `ResultSet.TYPE_SCROLL_INSENSITIVE`
  * `ResultSet.TYPE_SCROLL_SENSITIVE`
* *updatable*, in relation to which there are the following *constant* `int` defining the updatability: 
  * `ResultSet.CONCUR_READ_ONLY` - the *default value* in a `ResultSet` in case no `ResultSet.CONCUR_`... is given when creating the `statement`
  * `ResultSet.CONCUR_UPDATABLE`
    
#### Operations Working merely on *Scrollable* `ResultSet`
Method Name         | return type 
--------------------|------------
`absolute(int row)` |`boolean`
`first()`           |`boolean`
`last()`            |`boolean`
`previous()`        |`boolean`
`relative(int row)` |`boolean`
`beforeFirst()`     |`void`
`afterLast()`       |`void`

All these methods would `throw SQLException` if the type of the `ResultSet` is `TYPE_FORWARD_ONLY` 

### Summary

Based on the specification, it is enough to initialize only the `Connection` in the *try-with-resource*. However, it is good code practice for applications to close statements as soon as they have finished processing them.
