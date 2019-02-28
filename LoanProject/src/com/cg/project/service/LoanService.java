package com.cg.project.service;

import com.cg.project.beans.Customer;
import com.cg.project.beans.Loan;
import com.cg.project.dao.ILoanDAO;
import com.cg.project.dao.LoanDAO;
import com.cg.project.exception.InvalidCustomerAdressException;
import com.cg.project.exception.InvalidCustomerNameException;

public class LoanService implements ILoanService{

	ILoanDAO loanDao=new LoanDAO(); 
	@Override
	public Loan applyLoan(Loan loan) {
		
		loanDao.applyLoan(loan);
		return loan;			
	}

	@Override
	public Customer validateCustomer(Customer customer)throws InvalidCustomerAdressException,InvalidCustomerNameException  {
	   String name= customer.getCustomerName();
		String address=customer.getAddress();
	  if( name.matches("[a-z]*[A-Z]*"))
	 if(address.matches("[a-z]*[A-Z]*"))
	 return customer;
	 else	throw new InvalidCustomerAdressException("invalid try again ");
	  else throw new InvalidCustomerNameException("invalid name") ;
	 

	}

	@Override
	public long insertCustomer(Customer customer) throws InvalidCustomerAdressException, InvalidCustomerNameException {
	     validateCustomer(customer);
		loanDao.insertCustomer(customer);
		System.out.println("Customer registered succesfully");
		return customer.getCustomerId();
		
	}

	@Override
	public double calculateEMI(double amount, int duration) {
		double r=9.5;
		int n=duration*12;
		double emi=amount*(r)*(1+r)*(n/(((1+r)*n)-1));
		return emi;
	} 

}
