package ruixue.practice.advanced.compiler_behavior.enums;

public enum Color {
	WHITE("valkoinen"),
	RED("punainen");
	private String color;
	Color(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
