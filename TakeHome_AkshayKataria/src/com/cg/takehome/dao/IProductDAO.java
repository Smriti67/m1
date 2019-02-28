package com.cg.takehome.dao;

import com.cg.takehome.beans.Product;

public interface IProductDAO {
	Product getProductDetails(int productCode);
}
