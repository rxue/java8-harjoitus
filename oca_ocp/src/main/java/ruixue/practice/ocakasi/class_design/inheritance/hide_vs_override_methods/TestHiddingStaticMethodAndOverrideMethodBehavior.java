package ruixue.practice.ocakasi.class_design.inheritance.hide_vs_override_methods;

import static java.lang.System.out;

class Bear {
	public void eat() {
		out.println("-- Bear is eating");
	}
	public static void sleep() {
		out.println("-- Static hidden method call: Bear is sleeping");
	}
	public void doDailyRoutine() {
		out.println();
		eat();
		sleep();
		System.out.println("Parent class method call: Bear has done daily routine");
	}
}

class Panda extends Bear {
	@Override
	public void eat() {
		out.println("-- Overriding method call: Panda is eating");
	}
	public static void sleep() {
		out.println("-- Static method call: Panda is sleeping (parent method is hidden)");
	}
//	public void pandaDoDailyRountine() {
//		out.println();
//		eat();
//		sleep();
//		out.println("Panda is has done daily routine");
//	}
}

public class TestHiddingStaticMethodAndOverrideMethodBehavior {

	public static void main(String[] args) {
		Bear bear = new Bear();
		bear.doDailyRoutine();
		Panda panda = new Panda();
		//panda.pandaDoDailyRountine();
		panda.doDailyRoutine();
		//out.println("NOTE! static hidden method can not be annotated with @override");
	}

}
