package ruixue.practice.ocpkasi.java_core.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class DemoCollect {
	
	public static void demoCollect(boolean parallel) {
		List<String> list = Arrays.asList("A", "B", "hello", "world", "Java");
		Supplier<ArrayList<String>> arrayListInitializer = () -> {
			ArrayList<String> arrayList = new ArrayList<>();
			System.out.println("Initialized ArrayList: @" + System.identityHashCode(arrayList));
			return arrayList;
		};
		BiConsumer<ArrayList<String>, String> accumulator = 
			(container, e) -> {
				System.out.println("Accumulator ArrayList: @" + System.identityHashCode(container) + ", element to add: " + e);
				container.add(e);
			};
		BiConsumer<ArrayList<String>, ArrayList<String>> combiner;
		if (parallel) {
			System.out.println();
			System.out.println("Demo with Parallel Stream:");
			combiner = 
				(ArrayList<String> arrayList, ArrayList<String> c) -> {
					System.out.println("Result ArrayList: @" + System.identityHashCode(arrayList)+ ", size: " + arrayList.size() + ", element to add: " + c);
					arrayList.addAll(c);
				};
				ArrayList<String> filteredResult = list.parallelStream().filter(e -> e.length() > 1)
						.collect(arrayListInitializer, accumulator, combiner);
				filteredResult.forEach(System.out::println);
		}
		else {
			System.out.println();
			System.out.println("Demo with single Stream:");
			combiner = (arrayList, e) -> {
				System.out.println("I can only appear in parallel stream");
			};
			ArrayList<String> filteredResult = list.stream().filter(e -> e.length() > 1)
					.collect(arrayListInitializer, accumulator, combiner);
			filteredResult.forEach(System.out::println);

		}
		
	}

	public static void main(String[] args) {
		demoCollect(true);
		demoCollect(false);
	}

}
