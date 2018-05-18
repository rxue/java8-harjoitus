package ruixue.ocpkasi.keyword_static;

public class AccessStaticElement {
	static int staticVar;
	static void staticMethod() {}
	static class StaticNestedClass {}

	public static void main(String[] args) {
		AccessStaticElement enclosingClass = new AccessStaticElement();
		System.out.println("Value of static variable is " + enclosingClass.staticVar);
		enclosingClass.staticMethod();
		enclosingClass.new StaticNestedClass();
	}

}
