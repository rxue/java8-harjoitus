package rx.practice.advanced.designpatterns.immutable;

public class Account {
	private final String id;
	private final double amount;
	public Account(String id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public String getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}

}
