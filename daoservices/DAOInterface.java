package com.zensar.bankingsystem.daoservices;

import java.sql.ResultSet;

import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Login;

public interface DAOInterface {

	public ResultSet fixedDeposit(int accountID, int tenure, int amount);
	
	public boolean validate(Login login);
	
	public ResultSet getMiniStatement(int accountID);
	
	public ResultSet getAccountSummary(int accountID);
	
	public boolean insertCustomer(Customer customer);
	
	public ResultSet retrieveBeneficiary(String beneficiaryName);
	
	public boolean insertBeneficiary(Beneficiary beneficiary);
	
	public boolean deleteBeneficiary(String beneficiaryName);
	
}
