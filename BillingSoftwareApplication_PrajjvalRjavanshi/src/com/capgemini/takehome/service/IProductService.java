package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exceptions.InvalidQuantityException;
import com.capgemini.takehome.exceptions.ProductNotFoundException;

public interface IProductService {
	Product getProductDetails(int productCode, int quantityOfProduct)throws InvalidQuantityException,ProductNotFoundException;
}
