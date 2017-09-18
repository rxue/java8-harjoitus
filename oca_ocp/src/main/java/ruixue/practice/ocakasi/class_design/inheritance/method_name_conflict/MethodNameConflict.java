package ruixue.practice.ocakasi.class_design.inheritance.method_name_conflict;
interface Horn {
	public Number play();
}
abstract class Woodwind {
	public abstract Short play();
}
public final class MethodNameConflict extends Woodwind implements Horn {
	public Short play() {
		return 10;
	}
}
