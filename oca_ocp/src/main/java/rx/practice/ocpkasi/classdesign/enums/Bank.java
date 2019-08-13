package rx.practice.ocpkasi.classdesign.enums;
enum Currency {
	DOLLAR, YEN, EURO
}
abstract class Provider {
	protected Currency c = Currency.EURO;
}
public class Bank extends Provider {
	protected Currency c = Currency.DOLLAR;
	public static void main(String[] args) {
		String currencyName = null;
		switch (new Bank().c) {
			case DOLLAR: currencyName = Currency.DOLLAR.name(); break;
			case EURO: currencyName = Currency.EURO.name(); break;
		}
		System.out.println(currencyName);

	}

}
