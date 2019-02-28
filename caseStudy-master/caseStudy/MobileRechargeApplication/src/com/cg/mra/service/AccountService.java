package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumber;

public interface AccountService {
	Account getAccountDetails(String mobileNo) throws InvalidMobileNumber;
	double rechargeAccount(String mobileNo,double rechargeAmount);

}
