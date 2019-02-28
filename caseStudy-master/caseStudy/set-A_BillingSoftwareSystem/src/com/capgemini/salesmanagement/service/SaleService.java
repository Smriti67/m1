package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvaidQuantityExceptition;
import com.capgemini.salesmanagement.exceptions.InvalidPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProdctCodeEception;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidQuantityException;

public class SaleService implements ISaleService{
ISaleDAO saleDAO= new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
	
		return saleDAO.insertSalesDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productCode) throws InvalidProdctCodeEception {
		if(productCode>=1001&&productCode<=1005)
		{
			return true;
		}
		else
		{
			throw new InvalidProdctCodeEception("Enter valid product code");
		}
	
	}

	@Override
	public boolean validateQuantity(int quantity)throws InvaidQuantityExceptition {
		if(quantity >=2&& quantity<=5){
		return true;
		}
		else
		{
			throw new InvaidQuantityExceptition("Enter valid quantity");
		}
	}

	@Override
	public boolean validateProductCat(String category)throws InvalidProductCategoryException {
		if(category.equalsIgnoreCase("electronics")|| category.equalsIgnoreCase("toys")){
		return true;
		}
		else
		{
			throw new InvalidProductCategoryException("Enter valid product category");
		}
	}

	@Override
	public boolean validateProductName(String productName,String category)throws InvalidProductNameException{
		if(category.equalsIgnoreCase("electronics"))
		{
			if(productName.equalsIgnoreCase("TV")||productName.equalsIgnoreCase("smartphone")||productName.equalsIgnoreCase("videogame"))
			{
				return true;
			}
		}
		else if(category.equalsIgnoreCase("toys"))
		{
			if(productName.equalsIgnoreCase("SoftToys")||productName.equalsIgnoreCase("Telescope")||productName.equalsIgnoreCase("barbiedoll"))
			{
				return true;
			}
		}
		else
		{
			throw new InvalidProductNameException("Enter valid product name-category");
		}
		return false;
	
	}

	@Override
	public boolean validateProductPrice(float price) throws InvalidPriceException {
		if(price>200){
			return true;
		}else
		{
			throw new InvalidPriceException("Enter valid product price");
		}
		
	}

	

}
