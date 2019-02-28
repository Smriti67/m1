package com.cg.billing.dao;

import java.util.HashMap;

import com.cg.billing.beans.Sale;
import com.cg.billing.util.CollectionUtil;

public class SaleDAO implements ISaleDAO{

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		sale.setSaleId(CollectionUtil.generateSaleId());
		sale.setdate(CollectionUtil.createDate());
		CollectionUtil.getCollection().put(sale.getSaleId(), sale);           // because collectionUtil.getcollection 
		                                                         // is returning sales so CollectionUtil.getCollection.put      
																 // wholly means sales.put
		
	
		return CollectionUtil.getCollection();
	
}
}
