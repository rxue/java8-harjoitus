/**
 * 
 */
package error.ocakasi.primitive.autoboxing_vs_unboxing;

/**
 * @author dingding
 *
 */
public class DemoCastingWithAutoboxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = 10; 
		Integer i2 = 20;
		Double d = i1 + i2;//cast and autoboxing cannot happen successively!
	}

}
