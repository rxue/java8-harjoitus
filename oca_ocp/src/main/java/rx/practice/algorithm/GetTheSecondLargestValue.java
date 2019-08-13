package rx.practice.algorithm;

public class GetTheSecondLargestValue {
	
	public int getTheSecondLargestValue(int[] array) {
		if (array.length == 0) throw new RuntimeException("empty array given");
		int largest = array[0];
		if (array.length == 1) throw new RuntimeException("only one elements in the array");
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < array.length; i++) {
			if (secondLargest == Integer.MIN_VALUE && array[i] < largest)
				secondLargest = array[i];
			else if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}
			else if (array[i] < largest && array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE)
			throw new RuntimeException("No second largest found, say all elements in the array are the same");
		return secondLargest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
