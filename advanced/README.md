# java8-perusharjoitus
## Coding Convention
* Be aware of `NullPointerException` (NPE), try to make use of `Optional` to resolve


### [Naming Convention](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)

#### Avoid Underscore in the `package` or Class Name
[*snake_case*](#) is not commonly used in Java

#### Elements of `package` name can contain Verbs

The core Java API and Java EE API are the best references.

Examples in Java SE:
* [`java.lang.reflect`](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/package-frame.html)
* [`java.lang.invoke`](https://docs.oracle.com/javase/8/docs/api/java/lang/invoke/package-frame.html)

Example of Noun following with Gerund (动名词):
* [`javax.xml.ws.wsaddressing`](https://docs.oracle.com/javaee/7/api/javax/xml/ws/wsaddressing/package-frame.html)



#### Name the `abstract class` with `Abstract` as the prefix
Examples in Practice:
* [AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)

#### Don't simply change *access modifier* for the sake of the Law of Demeter

### Counterpart of Nested Functions, i.e. *Functional Programming* Interfaces
As mentioned in [Refactoring, Improving the Design of Existing Code](https://www.amazon.com/Refactoring-Improving-Existing-Addison-Wesley-Signature/dp/0134757599) > Chapter 6 A First Set of Refactorings > Extract Function > Mechanics:

> If the language supports *nested functions* , nest the extracted function inside the source function. That will reduce the amount of out-of-scope variables to deal with ... I can always use *Move Function (198)* later.

The counterpart of *nested functions* in Java (8+) is the *functional programming* interfaces. So, in case a *method* is used merely in one place, a `Function` could be nested in the enclosing *method* instead. The "nested" *Function* can be moved out as a *method* once it is needed to be invoked in other places than the original enclosing methods.  

## Junit 5 
### Configuration in `pom.xml`
* `dependencies`
  * `junit-platform-launcher` is used in Eclipse IDE
* `maven-surefire-plugin`
  * `junit-platform-surefire-provider` is used by `mvn` command
### Practical Work Approach in Project Using JUnit 5
#### Support on [*Test Suite*](https://junit.org/junit5/docs/current/user-guide/#running-tests-junit-platform-runner-test-suite)
*Test Suite* is a feature in JUnit 4, in order to use it, the `@RunWith(JUnitPlatform.class)` annotation is a must. 

