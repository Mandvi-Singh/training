package com.thegringottsbank.interfaces;
import java.util.ArrayList;

import com.thegringottsbank.beans.*;

public interface ServicesInterface {
	
public boolean signup(Customer Customerobj);

public Transaction fundTransfer(int accountFrom,int accountTo,int amount);

public ArrayList<Transaction> miniStatement(int accountNumber);

public Account accountSummary(int accountNumber);

public String fixedDeposit(int accountNumber,int timeDuration, int amount);

public String addBenificiary(Beneficiary beneficiaryObj);

public boolean deleteBeneficiary(String beneficiaryName);

public boolean searchBeneficiary(String beneficiaryName);
}

