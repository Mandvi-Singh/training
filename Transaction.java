package com.zensar.bankingsystem.beans;

import java.util.Date;

public class Transaction {
	private int transactionId;
	private int accountFrom;
	private int accountTo;
	private Date date;
	private String type;
	private int amount;

	public Transaction() {
		super();
	}

	public Transaction(int transactionId, int accountFrom, int accountTo, Date date, String type, int amount) {
		super();
		this.transactionId = transactionId;
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.date = date;
		this.type = type;
		this.amount = amount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(int accountFrom) {
		this.accountFrom = accountFrom;
	}

	public int getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(int accountTo) {
		this.accountTo = accountTo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountFrom=" + accountFrom + ", accountTo="
				+ accountTo + ", date=" + date + ", type=" + type + ", amount=" + amount + "]";
	}

}
