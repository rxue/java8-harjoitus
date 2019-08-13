package rx.practice.ocakasi.javacompiler.interfaces;

public interface Interface {
	double pi = 3.14;
	void execute();
	static double getE() {
		return 2.71828;
	}
	default void run() {}

}
