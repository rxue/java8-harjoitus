package ruixue.practice.ocpkasi.class_design;
interface Animal {}
class Mammal implements Animal {}
abstract class AbstractHuman {}
class Robot extends AbstractHuman {}
class HeavyAnimal {}
class Hippo extends HeavyAnimal {}
class Elephant extends HeavyAnimal {}

public class InstanceofDemo {

	public static void main(String[] args) {
		Hippo hippo = new Hippo();
		//System.out.println(hippo instanceof Elephant); //Does not compile
		System.out.println("hippo instanceof Animal: " + (hippo instanceof Animal));
		Animal mammal = new Mammal();
		System.out.println("mammal (reference type is Animal interface) instanceof HeavyAnimal: " + (mammal instanceof HeavyAnimal));
		AbstractHuman robot = new Robot();
		//System.out.println("robot (reference type is abstract AbstractHuman) instanceof HeavyAnimal: " + (robot instanceof HeavyAnimal)); //Does not compile

	}

}
