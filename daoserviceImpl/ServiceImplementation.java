package com.zensar.bankingsystem.daoserviceImpl;

import java.util.List;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Login;
import com.zensar.bankingsystem.beans.Transaction;
import com.zensar.bankingsystem.daoprovider.DAOProvider;
import com.zensar.bankingsystem.daoservices.DAOInterface;
import com.zensar.bankingsystem.services.ServiceInterface;

public class ServiceImplementation implements ServiceInterface{

	DAOInterface dao = DAOProvider.getDAOProvider();
	@Override
	public boolean validateUser(Login login) {
		// TODO Auto-generated method stub
		boolean flag= dao.validate(login);
		return flag;
	}

	@Override
	public Transaction fundTransfer(int accountIDSender, int accountIDReciever, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> miniStatement(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account accountSummary(int accountID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fixedDeposit(int accountID, int tenure, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addBeneficiary(Beneficiary beneficiary) {
		// TODO Auto-generated method stub
		if(dao.insertBeneficiary(beneficiary)){
			return beneficiary.toString();
		}
		return "Beneficiary Already Exists!";
	}

	@Override
	public boolean deleteBenefiaciry(String beneficiaryName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchBeneficiary(String beneficiaryName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkCustomer(Customer customer) {
		// TODO Auto-generated method stub
		boolean flag= dao.insertCustomer(customer);
		return flag;
	}

}
