package com.cg.billing.ui;
import java.util.Scanner;
import com.cg.billing.beans.Sale;
import com.cg.billing.exception.InvalidPriceException;
import com.cg.billing.exception.InvalidProductCategoryException;
import com.cg.billing.exception.InvalidProductCodeException;
import com.cg.billing.exception.InvalidProductNameException;
import com.cg.billing.exception.InvalidQuantityException;
import com.cg.billing.services.ISaleService;
import com.cg.billing.services.SaleService;

public class MainClass {
	public static void main(String args[]) throws InvalidProductCategoryException, InvalidProductCodeException, InvalidProductNameException, InvalidQuantityException, InvalidPriceException {
		ISaleService saleService=new SaleService();
		int prodCode1=0,quantity = 0,prodPrice=0;
		String prodCat="",prodName="";
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the product code");
			prodCode1=sc.nextInt();
			saleService.validateProductCode(prodCode1);
			System.out.println("Enter the product quantity");
			quantity=sc.nextInt();
			saleService.validateQuantity(quantity);
			System.out.println("Enter the product category");
			prodCat=sc.next();
			saleService.validateProductCat(prodCat);
			System.out.println("Enter the product Name");
			prodName=sc.next();
			saleService.validateProductName(prodName);
			System.out.println("Enter the product Price");
			prodPrice=sc.nextInt();
			saleService.validateProductPrice(prodPrice);
			Sale sale =new Sale(prodCat, quantity, prodCode1, prodPrice, prodName, prodPrice*quantity);

			System.out.println(saleService.insertSalesDetails(sale));		

	}

	}

}
