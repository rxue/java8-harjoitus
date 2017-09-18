package ruixue.practice.ocakasi.variables;

public class TestConflictVariables {
	private static int yesterday = 1;
	int tomorrow = 10;
	public static void main(String[] args) {
		TestConflictVariables t = new TestConflictVariables();
		int today = 20, tomorrow = 40;
		System.out.println(today + t.tomorrow + t.yesterday);
	}

}
