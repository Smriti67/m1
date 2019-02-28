package com.cg.project.client;

import java.util.Scanner;

import com.cg.project.beans.Customer;
import com.cg.project.beans.Loan;
import com.cg.project.exception.InvalidCustomerAdressException;
import com.cg.project.exception.InvalidCustomerNameException;
import com.cg.project.service.ILoanService;
import com.cg.project.service.LoanService;

public class MainClass {
	
	public static void main(String args[]) throws InvalidCustomerAdressException, InvalidCustomerNameException
	
		{

	ILoanService loanservice=new LoanService();
	Scanner sc=new Scanner(System.in);
	
	String customerName = null,address = null,email = null;
	long mobNo = 0;
	double amount;
	int duration;

	int input=0;
	do {     
	   	System.out.println("xyz finance company welcome you");
	   	System.out.println("1.Register customer");
	    System.out.println("2.EXIT");
	    input=sc.nextInt();
	if(input==1) {
	 System.out.println("Enter the cuomer name");
	 customerName=sc.next();
	
	//customer.setCustomerName(customerName);
	System.out.println("Enter the customer address");
	address=sc.next();
	//customer.setAddress(address);
	System.out.println("Enter the customer emailId");
	email=sc.next();
	//customer.setEmail(email);
	System.out.println("Enter the customer mobile number");
	mobNo=sc.nextLong();
	Customer customer=new Customer(customerName, address, mobNo, email);
	System.out.println("Customer information saved succesfully");
	System.out.println("your customer id is:"+loanservice.insertCustomer(customer));
	System.out.println("Do you wish to apply for loan");
	String str = sc.next();
		switch(str)
	{
	case "yes":System.out.println("Enter the loan amount");
	           amount=sc.nextDouble();
	           System.out.println("Enter the duaration");
	           duration = sc.nextInt();
	           Loan loan=new Loan(amount, customer.getCustomerId(), duration); // loan object created
	           
	           System.out.println("For Loan Amount "+amount+" and "+duration+" years duration"+" the EMI is:");
	           System.out.println(loanservice.calculateEMI(amount, duration));
	           System.out.println("Do you want to apply for loan");
	           String choice2=sc.next();
	           switch(choice2)
	           {
	           case "yes": 	System.out.println("Your loan request is generated");
	           				System.out.println(loanservice.applyLoan(loan));
	           				System.out.println("Your Loan id is :"+loan.getLoanId());
	                      
	           case "no" : System.out.println();
	           }
	case "no" :System.exit(0);          
	}
	      
	if(input==2) {
		
		System.exit(0);
	}
	
	}
	
	}while(true);
}}