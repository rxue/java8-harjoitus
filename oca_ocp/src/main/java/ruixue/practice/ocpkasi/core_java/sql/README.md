## *JDBC*
About automatic *close* resources:
* Closing a `Connection` also closes the `Statement` and `ResultSet`
* Closing a `Statement` also closes the `ResultSet`
* *JDBC* automatically closes a `ResultSet` when you run another SQL statement from the same `Statement`

### `ResultSet`
The type of `ResultSet` can be defined in two dimensions:
* *scrollable*, in relation to which there are the following *constant* `int` defining the scrollability:
  * `ResultSet.TYPE_FORWARD_ONLY` - the *default value* in case no `ResultSet.TYPE_`... is given when creating the `statement`
  * `ResultSet.TYPE_SCROLL_INSENSITIVE`
  * `ResultSet.TYPE_SCROLL_SENSITIVE`
* *updatable*, in relation to which there are the following *constant* `int` defining the updatability: 
  * `ResultSet.CONCUR_READ_ONLY` - the *default value* in case no `ResultSet.CONCUR_`... is given when creating the `statement`
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
