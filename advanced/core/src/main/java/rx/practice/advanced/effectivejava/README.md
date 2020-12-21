# 3th Edition
## Chapter 2: Creating and Destrying Objects
### Item 7: Eliminate obsolete object references
#### Applications in the Source Code of Open JDK
* `Vector`
* `ArrayList`
## Chapter 3: Methods Common to All Objects
### Item 10: Obey the general contract when overriding `equals`
### Item 11: Always override `hashCode` when you override `equals`
## Chapter 8: Methods
### Item 54: Return empty collections or arrays, not nulls
The Java 8 Stream API, e.g. `filter` was designed so

## Chapter 9: General Programming
### Item 61: Prefer primitive types to boxed primitives
#### 3 differences between *primitives* and *boxed primitives*
* primitives have only their values, whereas boxed primitives have identities distinct from their values
* primitive types have only fully functional values, whereas each boxed primitive type has nonfunctional value, which is `null`
* primitives are more type- and space-efficient than boxed primitives

