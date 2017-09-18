package ruixue.practice.ocakasi.primitive.autoboxing_vs_unboxing;

public class TestSpecialAutoboxing {

	public static void main(String[] args) {
		Object o1 = 100;
		if (o1 instanceof Integer)
			System.out.println("The integral numeric is autoboxed to an Integer object");
		o1 = 100.;
		if (o1 instanceof Double)
			System.out.println("The decimal numeric is autoboxed to a Double object");
		o1 = 100.f;
		if (o1 instanceof Float)
			System.out.println("The decimal numeric is autoboxed to a Float object");
		o1 = (byte)100;
		if (o1 instanceof Byte)
			System.out.println("The decimal numeric is autoboxed to a Byte object");
	}

}
