package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		IProductService services = new ProductService();
		mainScreen();//Main Screen Menu
		System.out.println("Enter any one of the above choices:->");
		int userChoice = sc.nextInt(); // Choice of user in menu 
		switch(userChoice) {
		case 1:
			try {
				System.out.print("Enter the product code:-\t");
				int productCode = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the quantity:-\t");
				int quantityOfProduct = sc.nextInt();
				Product product =services.getProductDetails(productCode,quantityOfProduct) ;
				System.out.println(product);
				break;
			}
				catch(Exception e) {
					e.printStackTrace();
					break;}
			
		case 2: System.exit(0);
		
		default: System.out.println("Invalid choice. Please try again!!!!!!!!!!!!!!!!!!!!!");
				
		}
		main(null);
	}

	private static void mainScreen() {
		System.out.println("\t\t\t **************************************************** Welcome to Billing Software Application****************************************************");
		System.out.println("1) Generate Bill by entering Product code and quantity");
		System.out.println("2) Exit");
	}
}
