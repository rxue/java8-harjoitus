package rx.practice.ocakasi.modifier.accessmodifier.otherpackage;

public class TestMemberAccessibility {

	public static void main(String[] args) {
		Gosling gosling = new Gosling();
		/**
		 * Class Gosling's inherited field canSwim is only visible in the Gosling class
		 * => the following line does not compile!
		 */
//		if (gosling.canSwim)
//			System.out.println("Gosling can swim");
	}
}
