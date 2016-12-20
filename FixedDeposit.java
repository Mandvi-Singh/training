package com.zensar.bankingsystem.beans;

public class FixedDeposit {
	private int accountId;
	private int amount;
	private String type;
	private int timeDuration;

	public FixedDeposit() {
		super();
	}

	public FixedDeposit(int accountId, int deposite, String type, int timeDuration) {
		super();
		this.accountId = accountId;
		amount = deposite;
		this.type = type;
		this.timeDuration = timeDuration;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int deposite) {
		amount = deposite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(int timeDuuration) {
		this.timeDuration = timeDuuration;
	}

	@Override
	public String toString() {
		return "FixedDeposite [accountId=" + accountId + ", Deposite=" + amount + ", type=" + type
				+ ", timeDuration=" + timeDuration + "]";
	}

}
