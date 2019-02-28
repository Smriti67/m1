package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.InvalidMobileNumber;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUi {
	
	 public static void main(String[] args) throws InvalidMobileNumber {
  	   AccountService service=new AccountServiceImpl();
   	Scanner in=new Scanner(System.in);
	
	  int input=0;
	  String mobileNumber="";
	  String accountType = null, customerName = null;
	  double accountBalance = 0;
	while(true) {  	  
	      System.out.println("1.Account Balance Enquiry");
		  System.out.println("2.Recharge Account");
	   	  System.out.println("3.Exit");
	  	    input=in.nextInt();
	try  {    
		Account account=new Account();
			if(input==1) {
			 System.out.println("Enter mobile Number of customer");
			 mobileNumber=in.next();
		   	account=service.getAccountDetails(mobileNumber);
			System.out.println("Your Current Balance IS Rs  "+account.getAccountBalance());
			input=in.nextInt();
			}				 
		 }
			catch(InvalidMobileNumber e) {
			System.out.println(e.getMessage()); 
					 }
			 if(input==2) {
				String mobileno="";
				 System.out.println("Enter mobile Number of customer");
				 mobileno=in.next();
				 System.out.println( " Enter Recharge amount");
				  double rechargeAmount=in.nextDouble();
				  double updateBalance=service.rechargeAccount(mobileno, rechargeAmount);
				  System.out.println("Updated Balance ="+updateBalance);
				  Account  account = new Account(accountType, customerName, accountBalance);
			System.out.println("Details are-"+service.getAccountDetails(mobileno));
			input=in.nextInt();
			 }
			else {
				System.exit(0);
				System.out.println("Loging Out");
				  			  
			}
	
	
			}
		
		}

	}


