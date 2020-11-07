package rx.practice.ocakasi.modifier.accessmodifier;

import rx.practice.ocakasi.modifier.accessmodifier.otherpackage.Gosling;

public class TestMemberAccessibility {
	public static void main(String[] args) {
		Swan swan = new Swan();
		if (swan.canFly)
			System.out.println("Swan can fly");
		if (swan.canSwim)
			System.out.println("Swan can swim");
		Gosling gosling = new Gosling();
		if (gosling.canSwim)
			System.out.println("In the same package with Parent class, Gosling can also swim");
	}

}
