package com.cg.takehome.dao;

import com.cg.takehome.beans.Product;
import com.cg.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	@Override
	public Product getProductDetails(int productCode) {
		return CollectionUtil.getProductList().get(productCode);
	}

}
