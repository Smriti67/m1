package com.cg.project.dao;

import java.util.HashMap;

import com.cg.project.beans.Customer;
import com.cg.project.beans.Loan;

public class LoanDAO implements ILoanDAO {

	
	private static HashMap<Long, Customer> customerEntry=new HashMap<Long, Customer>();
	
	private static HashMap<Long, Loan> loanEntry=new HashMap<Long, Loan>();
	
	public static long generateLoanId()
	{
	
		return (long)(1000+(Math.random()*1000));
		
		
	}
	
	public static long generateCustomerId()
	{
	
		return (long)(1000+(Math.random()*1000));
		
		
	}
	
	@Override
	public long applyLoan(Loan loan) {
		loan.setLoanId(LoanDAO.generateLoanId());
		loanEntry.put(loan.getLoanId(), loan);
		return loan.getLoanId();
	}

	@Override
	public long insertCustomer(Customer customer) {
		customer.setCustomerId(LoanDAO.generateCustomerId());
		customerEntry.put(customer.getCustomerId(), customer);
		return customer.getCustomerId();
	}
	
	public HashMap<Long,Customer> getCustomerInfo()
	{
		return customerEntry;
	}
	
	public HashMap<Long,Loan> getLoanInfo()
	{
		return loanEntry;
	}

}
