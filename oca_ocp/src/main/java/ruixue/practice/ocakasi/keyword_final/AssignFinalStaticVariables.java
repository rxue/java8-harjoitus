package ruixue.practice.ocakasi.keyword_final;

public class AssignFinalStaticVariables {
	public static final String leftRope;
	public static final String rightRope;
	//public final String bench;
	public static final String name = "name";
	static {
		leftRope = "left rope";
		rightRope = "right rope";
	}
	public static void main(String[] args) {
		//static final variable can not be initialized here
	}
}
