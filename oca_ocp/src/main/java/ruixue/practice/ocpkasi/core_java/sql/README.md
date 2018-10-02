## [*JDBC*](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/) Based on [JDBC 4.2 Specification](http://download.oracle.com/otn-pub/jcp/jdbc-4_2-mrel2-spec/jdbc4.2-fr-spec.pdf?AuthParam=1538462986_7e717e788b18beae093c9c5f27917be9)
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
> 
### `Statement` retrieved from `Connection`
  
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
