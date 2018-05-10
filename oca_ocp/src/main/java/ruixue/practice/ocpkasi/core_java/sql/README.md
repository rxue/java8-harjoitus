## *JDBC*
About automatic *close* resources:
* Closing a `Connection` also closes the `Statement` and `ResultSet`
* Closing a `Statement` also closes the `ResultSet`
* *JDBC* automatically closes a `ResultSet` when you run another SQL statement from the same `Statement`
