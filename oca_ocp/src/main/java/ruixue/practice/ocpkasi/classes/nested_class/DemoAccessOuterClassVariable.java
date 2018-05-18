package ruixue.practice.ocpkasi.classes.nested_class;

public class DemoAccessOuterClassVariable {
	private int x = 10;
	class Parent {
		private int x = 20;
		class C {
			private int x = 30;
			public void demo() {
				System.out.println("current x is " + this.x);
				System.out.println("x of parent class is " + Parent.this.x);
				System.out.println("x of outmost class is " + DemoAccessOuterClassVariable.this.x);
			}
		}
	}
	public static void main(String[] args) {
		DemoAccessOuterClassVariable outmost = new DemoAccessOuterClassVariable();
		Parent b = outmost.new Parent();
		Parent.C c = b.new C();
		c.demo();
	}

}
