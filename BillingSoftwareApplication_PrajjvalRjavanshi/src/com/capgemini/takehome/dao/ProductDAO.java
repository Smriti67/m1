package com.capgemini.takehome.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO{
	//get product details from Util class
	@Override
	public Product getProductDetails(int productCode) {
		Product product = CollectionUtil.products.get(productCode);
		return product;
	}

}
