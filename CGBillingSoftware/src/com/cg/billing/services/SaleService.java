package com.cg.billing.services;

import java.util.HashMap;

import com.cg.billing.beans.Sale;
import com.cg.billing.dao.ISaleDAO;
import com.cg.billing.dao.SaleDAO;
import com.cg.billing.exception.InvalidProductCategoryException;
import com.cg.billing.exception.InvalidProductCodeException;
import com.cg.billing.exception.InvalidProductNameException;
import com.cg.billing.exception.InvalidQuantityException;
import com.cg.billing.exception.InvalidPriceException;


public class SaleService implements ISaleService{

	ISaleDAO isaleDao=new SaleDAO();
	@Override
	public boolean validateProductCode(int prodCode) throws InvalidProductCodeException{
		if(prodCode>=1001 && prodCode<=1005)
		{
			return true;
		}
		else 
		 throw new InvalidProductCodeException("The product code is invalid");
	}

	@Override
	public boolean validateQuantity(int quantity) throws InvalidQuantityException{
		if(quantity>0 && quantity<=5)
			return true;
		else
			throw new InvalidQuantityException("The quantity should be > than 0 or less than 5");
		
	}

	@Override
	public boolean validateProductCat(String prodCat) throws InvalidProductCategoryException{
		if(prodCat.equals("Electronics")|| prodCat.equals("toys"))
			return true;
		else
			throw new InvalidProductCategoryException("The category is wrong");
		
		
	}

	
	@Override
	public boolean validateProductName(String prodName) throws InvalidProductNameException{
			      if(prodName.equals("TV")||prodName.equals("smartphone")||prodName.equals("videogame")||
			    		  prodName.equals("softtoys")||prodName.equals("barbeedoll")||prodName.equals("telescope"))
			    	  return true;
		else
		{
	    	throw new InvalidProductNameException("The product name is not valid");
		}
	}

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		return isaleDao.insertSalesDetails(sale);
	}

	@Override
	public boolean validateProductPrice(float price) throws InvalidPriceException {
		if(price>200)
			return true;
		else
			throw new InvalidPriceException("The quantity should be > than 0 or less than 5");		
	}

}
