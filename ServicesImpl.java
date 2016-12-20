package com.zensar.bankingsystem.servicesImpl;

import java.util.ArrayList;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Beneficiary;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Transaction;
import com.zensar.bankingsystem.services.ServicesInterface;

public class ServicesImpl implements ServicesInterface {

	@Override
	public boolean signup(Customer Customerobj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Transaction fundTransfer(int accountFrom, int accountTo, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Transaction> miniStatement(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account accountSummary(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fixedDeposit(int accountNumber, int timeDuration, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addBenificiary(Beneficiary beneficiaryObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBeneficiary(String beneficiaryName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchBeneficiary(String beneficiaryName) {
		// TODO Auto-generated method stub
		return false;
	}

}
