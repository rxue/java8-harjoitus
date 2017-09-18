package ruixue.practice.ocakasi.java_core_api;

import java.util.List;
import java.util.ArrayList;

public class ListPuzzler {

	public static void main(String[] args) {
		List<Short> list = new ArrayList<>();
		for (short i = 0; i < 10; i++) {
			list.add(i);
			list.remove(i);
		}
		System.out.println(list.size());
	}

}
