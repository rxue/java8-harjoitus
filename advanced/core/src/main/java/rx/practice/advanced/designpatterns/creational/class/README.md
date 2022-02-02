## Factory Method aka. Virtual Constructor
> The *Factory Method Pattern* defines an interface for creating an object but let subclass decide which class to instantiate. Factory Method let a class defer instantiation to subclass.

### COMMENT
The **method** on the *interfce* for creating an object is the *factory method* and, it should be implemented in the subclass of the interface

As a creational pattern, the factory method handles the **object creation**, i.e.*encapsulation*, meaning object instances are initiated inside the factory method without letting outside world know the details of how and what. So **as a norm, every time the factory method is called, there should always be a new instance returned**, otherwise, it would not be a normal factory method pattern.
