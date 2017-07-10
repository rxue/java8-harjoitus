package practice.ocakasi.primitive.autoboxing_vs_unboxing;

public class TestSpecialAutoboxing {

	public static void main(String[] args) {
		Object o = 100;
		if (o instanceof Integer)
			System.out.println("The integral numeric is autoboxed to an Integer object");
	}

}
