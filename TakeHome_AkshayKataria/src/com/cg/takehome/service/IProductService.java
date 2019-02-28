package com.cg.takehome.service;

import com.cg.takehome.beans.Product;
import com.cg.takehome.exceptions.InvalidProductCodeException;
import com.cg.takehome.exceptions.InvalidQuantityException;
import com.cg.takehome.exceptions.ProductDetailsNotfoundException;

public interface IProductService {
	Product getProductDetails(int productCode) throws ProductDetailsNotfoundException, InvalidProductCodeException;
	double calculateLineTotal(int productCode, int quantity) throws InvalidQuantityException;
}
