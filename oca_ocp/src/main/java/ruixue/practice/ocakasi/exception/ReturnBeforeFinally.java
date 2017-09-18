package ruixue.practice.ocakasi.exception;

/**
 * To my surprise, return before the finally is allowed!
 * @author rxue
 *
 */
public class ReturnBeforeFinally {
	public String getAddress(String street, String city) {
		try {
			return street.toString() + " : " + city.toString();
		} finally {
			System.out.print("Posted:");
		}
	}
	public static void main(String[] args) {
		String street = "350 5th Ave";
		String city = "New York";
		System.out.print(new ReturnBeforeFinally().getAddress(street, city));
	}

}
