package com.cg.project.service;

import com.cg.project.beans.Customer;
import com.cg.project.beans.Loan;
import com.cg.project.exception.InvalidCustomerAdressException;
import com.cg.project.exception.InvalidCustomerNameException;

public interface ILoanService {
	
	public Loan applyLoan(Loan loan);
	public Customer validateCustomer(Customer customer) throws InvalidCustomerAdressException, InvalidCustomerNameException;
	public long insertCustomer(Customer customer) throws InvalidCustomerAdressException, InvalidCustomerNameException;
	public double calculateEMI(double amount,int duration);
}
