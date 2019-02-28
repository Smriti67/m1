package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDAOImpl implements AccountDAO{

	Map<String,Account>accountEntry;
	
	public AccountDAOImpl(){
		accountEntry= new HashMap<>();
		accountEntry.put("8295636892", new Account("prepaid","Rishabh",200));
		accountEntry.put("9896921889", new Account("prepaid","Pawan",500));
		accountEntry.put("9996790646", new Account("prepaid","Meenu",300));
		accountEntry.put("9815065734", new Account("prepaid","Neetu",600));
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		return accountEntry.get(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) {
		Account recharge = new Account();
		recharge = accountEntry.get(mobileNo);
		double currentBalance = recharge.getAccountBalance();
		double updateBalance=currentBalance+rechargeAmount;
		recharge.setAccountBalance(updateBalance);
		accountEntry.put(mobileNo, recharge);
		return updateBalance;
	}



}
