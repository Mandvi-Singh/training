package com.zensar.bankingsystem.daoservices;

import java.sql.ResultSet;

import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;

public interface DAOServicesInterface {
	public ResultSet fixedDeposit(int accountNumber, int timeDuration, int amount);

	public boolean validate(int customerId, String password);

	public ResultSet getMiniStatement(int accountNumber);

	public ResultSet getAccountSummary(int accountNumber);

	public boolean insertCustomer(Customer customerObj);

	public ResultSet retrieveBeneficiary(String bebeficiaryName);

	public boolean insertBeneficiary(Beneficiary beneficiaryObj);

	public boolean deleteBeneficiary(String beneficiaryName);
}
