package ruixue.practice.ocpkasi.functional_programming;

import java.time.LocalDate;
import java.util.stream.Stream;

enum Gender {
	MALE, FEMALE
}
class Person {
	private String name;
	private Gender gender;
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	public String toString() {
		return name + ":" + gender;
	}
}

public class DemoIntFunction {

	public static void main(String[] args) {
		Person a = new Person("Jim", Gender.MALE);
		Person b = new Person("Tiina", Gender.FEMALE);
		Stream<Person> s = Stream.of(a, b);
		Person[] persons = s.toArray(size -> new Person[size]);
		for (Person p : persons) {
			System.out.println(p);
		}
	}

}
