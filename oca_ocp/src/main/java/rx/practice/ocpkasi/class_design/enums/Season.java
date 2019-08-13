package rx.practice.ocpkasi.class_design.enums;

public enum Season {
	WINTER("Low") {public String getClimate() {return "Cold";}};
	private String expectedVisitors;
	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
	public abstract String getClimate();
}
