package rx.practice.ocpkasi.functional;

import java.util.List;
import java.util.stream.Collectors;

public class ListHandler {
	public List<Integer> getSortedDistinctElements(List<Integer> list) {
		return list.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
}
