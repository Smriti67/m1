package com.capgemini.takehome.test;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exceptions.InvalidQuantityException;
import com.capgemini.takehome.exceptions.ProductNotFoundException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
import com.capgemini.takehome.util.CollectionUtil;

import junit.framework.Assert;


public class BillingSoftwareTestClass {
		Product product = new Product();
		private static IProductService services;
		
		@BeforeClass
		public static void setUpTestEnv() {
			services= new ProductService();
		}
		
		@Before
		public void setUpTestData() {
			Product product1 = new Product(1002,"iPhone", "Electronics",35000,2,70000);
			Product product2 = new Product(1001,"LEDTV", "Electronics",45000,2,90000);
			Product product3 = new Product(1003,"Teddy", "Toys",800,2,1600);	
			CollectionUtil.products.put(1002,product1);
			CollectionUtil.products.put(1001,product2);
			CollectionUtil.products.put(1003,product3);
		}
		@Test
		public void  getValidProductDetails()throws InvalidQuantityException,ProductNotFoundException{
			Product productExpected = new Product(1003,"Teddy", "Toys",800,2,1600);	
			Product actualProduct = services.getProductDetails(1003,2);
			Assert.assertEquals(productExpected, actualProduct);
		}
		
		@Test(expected=ProductNotFoundException.class)
		public void  getInvalidProductDetailsForProduct()throws InvalidQuantityException,ProductNotFoundException{
			services.getProductDetails(4,23);
		}
		
		@Test(expected=ProductNotFoundException.class)
		public void  getInalidProductDetailsForQuantity()throws InvalidQuantityException,ProductNotFoundException{
			services.getProductDetails(-12,1001);
		}
		
		
		@After
		public void tearDownTestData() {
			CollectionUtil.products.clear();		}
		
}
