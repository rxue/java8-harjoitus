package rx.practice.advanced.javacompiler.enums;

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
