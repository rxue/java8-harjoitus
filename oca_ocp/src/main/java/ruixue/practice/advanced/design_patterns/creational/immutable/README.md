## *Immutable Object*
### Features of *Immutable Object*
In order to become *immutable* the class should have the following features:

* All the instance variables in the *immutable object* should not be modified =>
  * all instance variables should be `private` and `final`
  * morevoer, the immutable class should be `final` so that no subclass can modify its instance variables
