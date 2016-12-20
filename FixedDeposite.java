package com.zensar.bankingsystem.beans;

public class FixedDeposite {
	private int accountId;
	private int balance;
	private String type;

	public FixedDeposite() {
		super();
	}

	public FixedDeposite(int accountId, int balance, String type) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.type = type;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FixedDeposite [accountId=" + accountId + ", balance=" + balance + ", type=" + type + "]";
	}

}
