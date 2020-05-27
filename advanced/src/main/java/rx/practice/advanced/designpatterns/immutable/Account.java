package rx.practice.advanced.designpatterns.immutable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Account extends Person {
	private final double amount;
	public Account(String id, double amount) {
		super.id = id;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.appendSuper(super.toString())
				.append("amount", amount )
				.toString();
	}

	public static void main(String[] args) {
		Account a = new Account("rxue", 100);
		System.out.println(a);

	}
}
