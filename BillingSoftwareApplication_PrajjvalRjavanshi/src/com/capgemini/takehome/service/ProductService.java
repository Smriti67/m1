package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.InvalidQuantityException;
import com.capgemini.takehome.exceptions.ProductNotFoundException;

public class ProductService implements IProductService{
	//To get Product Details
	@Override
	public Product getProductDetails(int productCode,int quantityOfProduct) throws InvalidQuantityException, ProductNotFoundException {
		IProductDAO servicesDAO = new ProductDAO();
		Product product =new Product();
		if(servicesDAO.getProductDetails(productCode)==null)
				throw new ProductNotFoundException("Sorry ! The Product Code <<"+productCode+">> is not available");
		else {
			if(quantityOfProduct>0) {
		product = servicesDAO.getProductDetails(productCode);
		product.setQuantity(quantityOfProduct);
		product.setLineTotal(calculateLineTotal(productCode,quantityOfProduct));
		return product;
		}
			else throw new InvalidQuantityException("Please Enter a valid Quantity");
	}
}
	//To Calculate total Billing Amount
	private int calculateLineTotal(int productCode, int quantityOfProduct) { 
		IProductDAO servicesDAO = new ProductDAO();
		Product product = servicesDAO.getProductDetails(productCode);
		int lineTotal = (int) (product.getProductPrice()*quantityOfProduct);
		product.setLineTotal(lineTotal);
		return lineTotal;
		
	}

}
