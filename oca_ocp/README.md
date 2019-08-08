# java8-perusharjoitus
## Coding Convention
### Naming Convention
* Be aware of `NullPointerException` (NPE), try to make use of `Optional` to resolve

#### Avoid Underscore in the Package or Class Name
[*snake_case*](#) is not commonly used in Java

#### Name the `abstract class` with `Abstract` as the prefix
Examples in Practice:
* [AbstractCollection](https://docs.oracle.com/javase/8/docs/api/java/util/AbstractCollection.html)

#### Don't simply change *access modifier* for the sake of the Law of Demeter

## Junit 5 configuration in `pom.xml`
* `dependencies`
  * `junit-platform-launcher` is used in Eclipse IDE
* `maven-surefire-plugin`
  * `junit-platform-surefire-provider` is used by `mvn` command
