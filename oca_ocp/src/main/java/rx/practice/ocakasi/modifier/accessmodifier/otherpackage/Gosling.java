package rx.practice.ocakasi.modifier.accessmodifier.otherpackage;

import rx.practice.ocakasi.modifier.accessmodifier.Swan;

public class Gosling extends Swan {
	public void tryToSwim() {
		if (super.canSwim) System.out.println("I cam swim");
	}
//	public void tryToFly() {
//		if (super.canFly) System.out.println("I can fly"); //canFly is not visible => would not compile
//	}
	public static void main(String[] args) {
		Gosling gosling = new Gosling();
		/**
		 * Class Gosling's inherited field canSwim is only visible in the Gosling class
		 * => the following line does not compile!
		 */
		if (gosling.canSwim)
		System.out.println("Gosling can swim inside the extended class");
	}
}
