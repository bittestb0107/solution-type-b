package problem03;

public class Money {
	
	private int amount;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money) {
			Money m = (Money)obj;
			return amount == m.amount;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return amount;
	}

	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		this.amount = this.amount + money.amount;
		return this;
	}

	public Money minus(Money money) {
		this.amount = this.amount - money.amount;
		return this;
	}

	public Money multiply(Money money) {
		this.amount = this.amount * money.amount;
		return this;
	}

	public Money devide(Money money) {
		this.amount = this.amount / money.amount;
		return this;
	}
}