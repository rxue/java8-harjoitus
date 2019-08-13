package rx.practice.ocpkasi.classes.nested_class;

public class TestMemberInnerClass {
	private String greeting = "Hi";
	protected class Inner {
		public int repeat = 3;
		public void go() {
			for (int i = 0; i < repeat; i++)
				System.out.println(greeting);
		}
	}
	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	public static void main(String[] args) {
		TestMemberInnerClass outer = new TestMemberInnerClass();
		outer.callInner();
		System.out.println("Call with instantiated member inner class outside the outer class");
		Inner inner = outer.new Inner();
		inner.go();
	}

}
