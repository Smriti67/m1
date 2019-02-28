package com.capgemini.salesmanagement.service;

import java.util.HashMap;
import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvaidQuantityExceptition;
import com.capgemini.salesmanagement.exceptions.InvalidPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProdctCodeEception;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;

public interface ISaleService {
public HashMap<Integer,Sale>insertSalesDetails(Sale sale);
public boolean validateProductCode(int productCode) throws InvalidProdctCodeEception;
boolean validateQuantity(int quantity) throws InvalidQuantityException, InvaidQuantityExceptition;
public boolean validateProductCat(String category) throws InvalidProductCategoryException;
public boolean validateProductName(String productName,String category) throws InvalidProductNameException;
public boolean validateProductPrice(float price) throws InvalidPriceException;
//public boolean validateProductPrice(float lineTotal);
}
