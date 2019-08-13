package rx.practice.ocakasi.primitive.autoboxing_vs_unboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Reference: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html 
 * @author rxue
 *
 */
public class TestAutoboxingAndUnboxing {

	public static void main(String[] args) {
		byte b = new Byte((byte)10); //unboxing i.e. compiler convert it to: new Byte((byte)10).byteValue();
		Integer Integer = 100; //autoboxing i.e. compiler convert it to: Integer integer = Integer.valueOf(100)
		Float f = 10f;
		Float sum = f + Integer;
		System.out.println(sum);
		List<Float> list = new ArrayList<>();
		list.add(10f); //autoboxing i.e. compiler convert it to: list.add(Float.valueOf(10f));
		float addedFloat = list.get(0); //unboxing i.e. compiler convert it to: list.get(0).floatValue();
		byte s = 127;
	}

}
