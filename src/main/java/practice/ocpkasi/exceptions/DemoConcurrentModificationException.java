package practice.ocpkasi.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoConcurrentModificationException {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("jesus");
		for (String current : list)
			list.remove(current);
//		list = new CopyOnWriteArrayList<>();
//		list.add("hello");
//		list.add("world");
//		list.add("jesus");
//		list.add("god");
//		for (String current : list)
//			list.remove(current);
	}

}
