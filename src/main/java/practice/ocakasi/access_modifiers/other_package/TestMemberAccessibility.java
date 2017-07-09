package practice.ocakasi.access_modifiers.other_package;

import practice.ocakasi.access_modifiers.Swan;

public class TestMemberAccessibility {

	public static void main(String[] args) {
		Gosling gosling = new Gosling();
		gosling.tryToSwim();
		System.out.println(gosling.canSwim);//Class Gosling's inherited field canSwim is only visible in the Gosling class
	}

}
