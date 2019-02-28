package com.cg.billing.test;
import java.time.LocalDate;
import java.util.HashMap;

import javax.naming.InvalidNameException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.billing.beans.Sale;
import com.cg.billing.exception.InvalidProductCategoryException;
import  com.cg.billing.exception.InvalidPriceException;
import  com.cg.billing.exception.InvalidProductCodeException;
import  com.cg.billing.exception.InvalidProductNameException;
import  com.cg.billing.exception.InvalidQuantityException;
import com.cg.billing.services.SaleService;

public class BillingTest {
public static	SaleService  service;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	service= new SaleService();
	}

	@Before
	public void  testEvn() {
	Sale sale1=new Sale(1001, "Electronics", 2, 101, 25000, "TV");
	Sale sale2=new Sale(1002, "Electronics", 3, 103, 26000, "Phone");

	}
	
	@Test
	public void insertSaleDetailsForValidData() {
		Sale expected=new Sale(1001, "Electronics", 2, 101, 25000, "TV");
		HashMap<Integer, Sale> expected1= service.insertSalesDetails(expected);
		Sale actual=new Sale(1001, "Electronics", 2, 101, 25000, "TV");
		HashMap<Integer, Sale>actual1=service.insertSalesDetails(actual);
		Assert.assertEquals(expected1, actual1);
	}
	
	@Test
	public void validateProductCodeForValidData() throws InvalidProductCodeException{
       boolean expected=service.validateProductCode(1001);
	   boolean actual=true;
	}
	
	@Test(expected=InvalidProductCodeException.class)
	public void validateProductCodeForInvalidData() throws InvalidProductCodeException{
		service.validateProductCode(2150);
	}
	
	@Test
	public void  validateProductCategoryForValidData() throws InvalidProductCategoryException{
		boolean expected=service.validateProductCat("Electronics");
		boolean actual=true;
	}
	
	@Test(expected=InvalidProductCategoryException.class)
	public void  validateProductCategoryForInvalidData()throws InvalidProductCategoryException{
	service.validateProductCat("ele");
	}
	
	@Test
	public void validateProductNameForValidData() throws InvalidProductNameException{
		boolean expected =service.validateProductName("smartphone");
		boolean actual=true;
	}
	
	@Test(expected=InvalidProductNameException.class)
	public void validateProductNameForInvalidData() throws InvalidProductNameException, InvalidNameException{
		service.validateProductName("absc");
	}
	
	@Test
	public void validatePriceForValidData() throws InvalidPriceException{
	boolean expected=service.validateProductPrice(42000);
	boolean actual=true;
}
	
	@Test(expected=InvalidPriceException.class)
	public void  validateProductPriceForInvalidData() throws InvalidPriceException{
		service.validateProductPrice(200);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

}