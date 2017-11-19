package ruixue.practice.ocpkasi.java_core.collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		TreeMap<String, Object> map = new TreeMap<>((o1, o2) -> {
			if (o1 != null ^ o2 != null) {
				return o1 == null ? -1 : 1;
			}
			else if (o1 != null && o2 != null)
				return o1.compareTo(o2);
			return 0;
		});
//		TreeMap<String, Object> map = new TreeMap<>();
		map.put(null, "hello");
		//map.put("hello", "second");
	}

}
