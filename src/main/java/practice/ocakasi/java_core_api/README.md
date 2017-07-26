## `String` VS `StringBuilder`
### Same Methods Among `String` and `StringBuilder` 
4 methods in `String` and `StringBuilder` work exactly the same, they are:

* `charAt`
* `indexOf`
* `length`
* `substring` - Returns a **new String** that contains a subsequence of characters currently contained in this character sequence
  * `substring(int start, int end)` - the `end` is the **exclusive** end index 

At heart, from the perspective of source code, these methods don't modify the *instance variables*.

### Comparison of Methods between `String` and `StringBuilder`
|               | **`String`**                | **`StringBuilder`**           |
|---------------|-----------------------------|-------------------------------|
|`toLowerCase`  | exists                      | **does not exist**            |
|`toUpperCase`  | exists                      | **does not exist**            |
|`equals`       | **overide `Object.equals`** | **inherited `Object.equals`** |

