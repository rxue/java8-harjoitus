package rx.practice.ocakasi.accessmodifier.other_package;

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
