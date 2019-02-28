package com.cg.takehome.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.takehome.beans.Product;
import com.cg.takehome.exceptions.InvalidProductCodeException;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductDetailsNotfoundException;
import com.cg.takehome.service.IProductService;
import com.cg.takehome.service.ProductService;

public class TestProductServices {

	private static IProductService services;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		services = new ProductService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		services = null;
	}

	@Test(expected = ProductDetailsNotfoundException.class)
	public void testForInvalidInput() throws ProductDetailsNotfoundException, InvalidProductCodeException {
		services.getProductDetails(1201);
	}
	
	@Test
	public void testForValidInput() throws ProductDetailsNotfoundException, InvalidProductCodeException {
		Product expectedProduct = new Product(1003, "Teddy", "Toys", 800);
		Product actualProduct = services.getProductDetails(1003);
		Assert.assertEquals(expectedProduct, actualProduct);
	}

}
