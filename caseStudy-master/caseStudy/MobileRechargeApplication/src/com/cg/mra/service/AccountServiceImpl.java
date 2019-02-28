package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDAO;
import com.cg.mra.dao.AccountDAOImpl;
import com.cg.mra.exception.InvalidMobileNumber;

public class AccountServiceImpl implements AccountService {
AccountDAO accountDAO = new AccountDAOImpl();
	

@Override
public Account getAccountDetails(String mobileNo)throws InvalidMobileNumber {
			
	if(mobileNo.length()<10) 
			
		throw new InvalidMobileNumber("Error: Given Number doesn't exist");	
	
			
	
				
	return accountDAO.getAccountDetails(mobileNo);
}



@Override
public double rechargeAccount(String mobileno, double rechargeAmount) {
	
	return accountDAO.rechargeAccount(mobileno, rechargeAmount);
}

}
