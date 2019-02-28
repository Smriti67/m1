package com.capgemini.takehome.dao;

import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	@Override
	public Product getProductDetails(int productId) {
		return CollectionUtil.products.get(productId);
		
	}

}
