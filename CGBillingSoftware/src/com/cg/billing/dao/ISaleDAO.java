package com.cg.billing.dao;

import java.util.HashMap;

import com.cg.billing.beans.Sale;

public interface ISaleDAO {
	public HashMap<Integer,Sale>insertSalesDetails(Sale sale);

}
