package com.zensar.bankingsystem.services;

import java.util.List;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Login;
import com.zensar.bankingsystem.beans.Transaction;

public interface ServiceInterface {
	
	public boolean validateUser(Login login);
	
	public boolean checkCustomer(Customer customer);
	
	public Transaction fundTransfer(int accountIDSender,int accountIDReciever, int amount);
	
	public List<Transaction> miniStatement(int accountID);
	
	public Account accountSummary(int accountID);
	
	public String fixedDeposit(int accountID, int tenure, int amount);
	
	public String addBeneficiary(Beneficiary beneficiary);
	
	public boolean deleteBenefiaciry(String beneficiaryName);
	
	public boolean searchBeneficiary(String beneficiaryName);
	

}
