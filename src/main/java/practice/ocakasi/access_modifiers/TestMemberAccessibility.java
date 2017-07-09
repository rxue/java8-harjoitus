package practice.ocakasi.access_modifiers;

public class TestMemberAccessibility {
	public static void main(String[] args) {
		Swan swan = new Swan();
		if (swan.canFly)
			System.out.println("Swan can fly");
		if (swan.canSwim)
			System.out.println("Swan can swim");
	}

}
