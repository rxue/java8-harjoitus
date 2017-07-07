package practice.ocakasi.primitive.autoboxing_vs_unboxing;

import java.util.ArrayList;
import java.util.List;

public class TestAutoboxingAndUnboxing {

	public static void main(String[] args) {
		byte b = new Byte((byte)10); //unboxing
		Integer integer = 100; //autoboxing
		List<Float> list = new ArrayList<>();
		list.add(10f); //autoboxing
		float addedFloat = list.get(0); //unboxing
	}

}
