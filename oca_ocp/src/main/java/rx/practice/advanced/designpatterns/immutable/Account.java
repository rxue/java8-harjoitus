package rx.practice.advanced.designpatterns.immutable;

import org.apache.commons.lang3.builder.ToStringBuilder;

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

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id.toString())
				.append("amount", amount )
				.toString();
	}
}
