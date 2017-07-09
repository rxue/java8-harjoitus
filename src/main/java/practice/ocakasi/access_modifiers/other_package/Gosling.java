package practice.ocakasi.access_modifiers.other_package;

import practice.ocakasi.access_modifiers.Swan;

public class Gosling extends Swan {
	public void tryToSwim() {
		if (super.canSwim) System.out.println("I cam swim");
	}
//	public void tryToFly() {
//		if (super.canFly) System.out.println("I can fly"); //canFly is not visible => would not compile
//	}
}
