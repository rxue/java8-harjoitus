package ruixue.practice.ocakasi.class_design.inheritance.hide_vs_override_methods;

class Parent {
	public static void main(String[] args) {
		System.out.println("I am parent");
	}
}

public class TestDoubleFinalMain extends Parent {

	public static final void main(String[] args) {
		System.out.println("I am last child");
	}

}
