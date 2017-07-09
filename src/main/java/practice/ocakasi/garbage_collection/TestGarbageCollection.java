package practice.ocakasi.garbage_collection;

import java.util.ArrayList;
import java.util.List;

public class TestGarbageCollection {
	private static List objects = new ArrayList();
	protected void finalize() {
		objects.add(this);
	}
	public static void main(String[] args) {
		System.gc();

	}

}
