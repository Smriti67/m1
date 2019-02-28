package com.capgemini.salesmanagement.ui;

import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvaidQuantityExceptition;
import com.capgemini.salesmanagement.exceptions.InvalidPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProdctCodeEception;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) throws InvalidProductNameException, InvalidProductCodeException, InvalidQuantityException, InvalidProductCategoryException, InvalidPriceException, InvaidQuantityExceptition {
		int productCode=0;
		int quantity=0;
		String category="";
		String productName="";
		float price=0;
		float lineTotal=0;
		ISaleService service = new SaleService();
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter the product code: ");
		productCode= sc.nextInt();
		service.validateProductCode(productCode);
		System.out.println("Enter the product Quantity: ");
		quantity=sc.nextInt();
		service.validateQuantity(quantity);
		System.out.println("Enter Product category: ");
		category=sc.next();
		service.validateProductCat(category);
		System.out.println("Enter product name: ");
		productName=sc.next();
		service.validateProductName(productName, category);
		System.out.println("Enter product price");
		price=sc.nextFloat();
		service.validateProductPrice(price);
		lineTotal = quantity*price;
	}catch(InvalidProductNameException|InvalidQuantityException|InvalidProductCategoryException|InvalidPriceException|InvalidProdctCodeEception e){
		e.printStackTrace();
	}
	Sale sale = new Sale(productCode, productName, category, null, quantity, lineTotal);
	System.out.println(service.insertSalesDetails(sale));
	}
}
