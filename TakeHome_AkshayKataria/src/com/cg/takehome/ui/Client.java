package com.cg.takehome.ui;

import java.util.Scanner;

import com.cg.takehome.exceptions.InvalidProductCodeException;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductDetailsNotfoundException;
import com.cg.takehome.service.IProductService;
import com.cg.takehome.service.ProductService;

// Client class shows product information corresponding to product id and generate the bill for the product
public class Client {

	public static void main(String[] args) {
		IProductService services = new ProductService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("1. Generate Bill by entering Product code and quantity");
			System.out.println("2. Exit");
			System.out.println("Enter Choice:");
			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Product Details: ");
				System.out.println();
				System.out.println("Enter the Product Code");
				int productCode = sc.nextInt();
				System.out.println("Enter the Quantity: ");
				int quantity = sc.nextInt();

				try {
					System.out.println("Calculating Bill....");
					System.out.println(services.getProductDetails(productCode));
					double lineTotal = services.calculateLineTotal(productCode, quantity);
					System.out.println("Quantity: " + quantity);
					System.out.println("Line Total: " + lineTotal);
				} catch (ProductDetailsNotfoundException | InvalidProductCodeException | InvalidQuantityException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				System.exit(0);
			}
		}
	}

}
