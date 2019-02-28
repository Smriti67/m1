package com.cg.takehome.service;

import com.cg.takehome.beans.Product;
import com.cg.takehome.dao.IProductDAO;
import com.cg.takehome.dao.ProductDAO;
import com.cg.takehome.exceptions.InvalidProductCodeException;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductDetailsNotfoundException;

public class ProductService implements IProductService {

	private IProductDAO productDaoService= new ProductDAO();
	
	//Get the product details and throws exception if product not found
	@Override
	public Product getProductDetails(int productCode) throws ProductDetailsNotfoundException, InvalidProductCodeException{
		if(checkProductCodeLen(productCode)) {
			Product product = productDaoService.getProductDetails(productCode);
			if(product == null)
				throw new ProductDetailsNotfoundException("Sorry! The Product Code <<" + productCode + ">> is not available");
			return product;
		}
		throw new InvalidProductCodeException("Product code length should be of length 4");
	}
	
	// Calculate the bill by taking product code and quantity of product
	@Override
	public double calculateLineTotal(int productCode, int quantity) throws InvalidQuantityException {
		if(quantity <= 0) 
			throw new InvalidQuantityException("Quantity should not be Less than or equals to zero");
		return productDaoService.getProductDetails(productCode).getProductPrice() * quantity;
	}
	
	// Checks for valid length of product code
	boolean checkProductCodeLen(int productCode) {
		String str = productCode + "";
		if(str.length() == 4)
			return true;
		return false;
	}

}
