package rx.practice.ocakasi.classdesign.inheritance.method_name_conflict;

interface CanWalk {
	default void walk() {
		System.out.println("Walking");
	}
}

interface CanRun {
	default void walk() {System.out.println("Walking");}
}

public interface CanSprint extends CanWalk, CanRun {
	public void walk();
	public static void main(String[] args) {
		System.out.println("Main method in interface");
	}	
}
