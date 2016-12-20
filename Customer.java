package com.zensar.bankingsystem.beans;

public class Customer {
	private String customerName;
	private int customerId;
	private int accountNumber;
	private String mobileNumber;
	private String password;

	public Customer() {
		super();
	}

	public Customer(String customerName, int customerId, int accountNumber, String mobileNumber, String password) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", accountNumber="
				+ accountNumber + ", mobileNumber=" + mobileNumber + ", password=" + password + "]";
	}

}
