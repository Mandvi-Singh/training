package com.zensar.bankingsystem.beans;

public class Login {
	private int customerId;
	private String password;

	public Login() {
		super();
	}

	public Login(int customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [customerId=" + customerId + ", password=" + password + "]";
	}

}
