package ruixue.practice.ocakasi.class_design.inheritance.inheriting_methods;
/**
 * hiding variables
 * overriding methods
 * @author rxue
 *
 */
class Marsupial {
	protected String name = "Marsupial";
	public boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println(name + " walks on two legs: " + isBiped());
	}
}

public class Kangaroo extends Marsupial {
	protected  String name = "Kangaroo";
	@Override
	public boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println(name + " hops on two legs: " + isBiped());
	}
	static public void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
}
