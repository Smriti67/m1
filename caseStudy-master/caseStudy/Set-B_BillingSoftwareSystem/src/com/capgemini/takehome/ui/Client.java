package com.capgemini.takehome.ui;

import java.util.Scanner;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.ProductDetailsNotFoundException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {
	public static void main(String args[]) throws InvalidProductCodeException,InvalidProductQuantityException,ProductDetailsNotFoundException{
		int productId=0;
		int productQuantity=0;
		Scanner sc = new Scanner(System.in);
	IProductService service = new ProductService();
	System.out.println("1. Generate bill by entering product code and quantity");
	System.out.println("2. Exit");
	
	try{
	int answer = sc.nextInt();
	switch (answer) {
	case 1:
		System.out.println("Enter product code:");
		productId=sc.nextInt();
		service.getProductDetails(productId,productQuantity);
		service.validateProductCode(productId);
		System.out.println("Enter product quantity:");
		productQuantity=sc.nextInt();
		service.validateProductQuantity(productQuantity);
		System.out.println(service.getProductDetails(productId,productQuantity));
		break;
	case 2:
		System.out.println("Okay Bye!!!!!!!!!!!");
		System.exit(0);
		break;
	default:
		System.out.println("Enter valid option");
		break;
	}
	}
	catch (InvalidProductCodeException|InvalidProductQuantityException|ProductDetailsNotFoundException e)
	{
		e.printStackTrace();
	}
	
	//System.out.println(service.calculateLineTotal(productQuantity));
}

}
