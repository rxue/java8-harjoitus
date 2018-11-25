package ruixue.advanced.throwable;

class Demo {
	/**
	 * The lack of declaration of SubclassOfThrowable would lead to compilation error
	 * 
	 * @throws SubclassOfThrowable
	 */
	public void testThrowable() throws SubclassOfThrowable {
		throw new SubclassOfThrowable();
	}
}

public class SubclassOfThrowable extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
