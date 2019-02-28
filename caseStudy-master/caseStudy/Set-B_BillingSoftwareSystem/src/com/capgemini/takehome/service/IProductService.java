package com.capgemini.takehome.service;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.ProductDetailsNotFoundException;

public interface IProductService {
Product getProductDetails(int productId, int productQuantity)throws ProductDetailsNotFoundException;
public boolean validateProductQuantity(int productQuantity) throws InvalidProductQuantityException;
public boolean validateProductCode(int productId)throws InvalidProductCodeException;
//public int calculateLineTotal(int productQuantity) ;
}
