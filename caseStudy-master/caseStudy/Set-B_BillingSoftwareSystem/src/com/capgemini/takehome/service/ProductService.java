package com.capgemini.takehome.service;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.ProductDetailsNotFoundException;

public class ProductService  implements IProductService{
IProductDAO serviceDAO = new ProductDAO();
	Product product = new Product();
	@Override
	public Product getProductDetails(int productId, int productQuantity)throws ProductDetailsNotFoundException{
		if(productId==1001||productId==1002||productId==1003||productId==1004){
		 Product product=serviceDAO.getProductDetails(productId);
		 int price =product.getProductPrice();
		 int lineTotal=price*productQuantity;
		 product.setLineToatl(lineTotal);
		 product.setProductQuantity(productQuantity);
		 return product;}
		else
		{
			throw new ProductDetailsNotFoundException("Product details for the entered productId does not exists");
		}
	}

	@Override
	public boolean validateProductQuantity(int productQuantity)throws InvalidProductQuantityException {
		if(productQuantity>0){
			return true;
		}else
		{
			throw new InvalidProductQuantityException("Quantity should be grater than zero");
		}

	}

	@Override
	public boolean validateProductCode(int productId) throws InvalidProductCodeException{
		String productid= productId+"";
		String arr[]=productid.split("");
		if(arr.length==4){
			return true;
		}
		else
		{
			throw new InvalidProductCodeException("Enter valid product code");
		}
	}

/*@Override
	public int calculateLineTotal(int productQuantity) {
		int lineTotal = (product.getProductPrice())*productQuantity;
		return lineTotal;
	}*/

	
	
}
