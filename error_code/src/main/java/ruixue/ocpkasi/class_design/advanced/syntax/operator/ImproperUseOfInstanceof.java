package ruixue.ocpkasi.class_design.advanced.syntax.operator;

import java.util.Collection;

class HeavyAnimal {}
class Hippo extends HeavyAnimal {}
class Elephant extends HeavyAnimal {}
public class ImproperUseOfInstanceof {

	public static void main(String[] args) {
		Hippo anotherHippo = new Hippo();
		boolean b5 = anotherHippo instanceof Elephant; //DOES NOT COMPILE
		boolean bi = anotherHippo instanceof Collection;
	}

}
