package rxue.error.ocakasi.primitive.cast;

public class DemoWrongCast {

	public void demoImpossibleDowncast() {
		double d = 10;
		int i = d;//downcast causes compiler error 
	}
	public void demoWrongUpcast() {
		long maxInt = 2147483647;
		long maxIntPlusOne = 2147483648;//When the number is out of the range of int, the suffix of long is compsulsory
	}
}
