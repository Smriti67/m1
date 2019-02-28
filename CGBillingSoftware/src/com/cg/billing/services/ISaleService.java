package com.cg.billing.services;

import java.util.HashMap;

import com.cg.billing.beans.Sale;
import com.cg.billing.exception.InvalidPriceException;
import com.cg.billing.exception.InvalidProductCategoryException;
import com.cg.billing.exception.InvalidProductCodeException;
import com.cg.billing.exception.InvalidProductNameException;
import com.cg.billing.exception.InvalidQuantityException;

public interface ISaleService {
	public HashMap<Integer,Sale>insertSalesDetails(Sale sale);
	public boolean validateProductCode(int productCode) throws InvalidProductCodeException;
	boolean validateQuantity(int quantity) throws InvalidQuantityException;
	public boolean validateProductCat(String prodCat) throws InvalidProductCategoryException;
	public boolean validateProductName(String prodName) throws InvalidProductNameException;
	public boolean validateProductPrice(float price) throws InvalidPriceException;
	
}
