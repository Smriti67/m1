package com.cg.project.dao;

import java.util.HashMap;
import com.cg.project.beans.Customer;
import com.cg.project.beans.Loan;

public interface ILoanDAO {
	
	// HashMap<Long, Customer> customerEntry;
    // HashMap<Long, Loan> loanEntry;

	public long applyLoan(Loan loan);
	public long insertCustomer(Customer customer);
	
}
