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

## Junit 5 configuration in `pom.xml`
* `dependencies`
  * `junit-platform-launcher` is used in Eclipse IDE
* `maven-surefire-plugin`
  * `junit-platform-surefire-provider` is used by `mvn` command
