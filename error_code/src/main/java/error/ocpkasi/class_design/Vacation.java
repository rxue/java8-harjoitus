package error.ocpkasi.class_design;

enum DaysOff {
	Thanksgiving, PresidentsDay, ValentinesDay
}
/**
 * Note that the case of enum must not contain the enum type!
 * 
 * @author dingding
 *
 */
public class Vacation {
	public static void main(String[] args) {
		final DaysOff input = DaysOff.Thanksgiving;
		switch(input) {
			default:
			case DaysOff.ValentinesDay: System.out.println("1");
			case DaysOff.PresidentsDay: System.out.println("2");
		}

	}

}
