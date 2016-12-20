package com.zensar.bankingsystem.beans;

public class Beneficiary {
	private int beneficiaryAccountNumber;
	private String beneficiaryAccountType;
	private String beneficiaryName;
	private String emailId;

	public Beneficiary() {
		super();
	}

	public Beneficiary(int beneficiaryAccountNumber, String beneficiaryAccountType, String beneficiaryName,
			String emailId) {
		super();
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.beneficiaryAccountType = beneficiaryAccountType;
		this.beneficiaryName = beneficiaryName;
		this.emailId = emailId;
	}

	public int getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(int beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryAccountType() {
		return beneficiaryAccountType;
	}

	public void setBeneficiaryAccountType(String beneficiaryAccountType) {
		this.beneficiaryAccountType = beneficiaryAccountType;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Beneficiary [beneficiaryAccountNumber=" + beneficiaryAccountNumber + ", beneficiaryAccountType="
				+ beneficiaryAccountType + ", beneficiaryName=" + beneficiaryName + ", emailId=" + emailId + "]";
	}

}
