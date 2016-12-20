package com.zensar.bankingsystem.beans;

public class FixedDeposite {
	private int accountId;
	private int Deposite;
	private String type;

	public FixedDeposite() {
		super();
	}

	public FixedDeposite(int accountId, int deposite, String type) {
		super();
		this.accountId = accountId;
		Deposite = deposite;
		this.type = type;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getDeposite() {
		return Deposite;
	}

	public void setDeposite(int deposite) {
		Deposite = deposite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FixedDeposite [accountId=" + accountId + ", Deposite=" + Deposite + ", type=" + type + "]";
	}

}
