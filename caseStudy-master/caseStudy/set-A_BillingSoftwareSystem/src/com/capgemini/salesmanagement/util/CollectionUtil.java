package com.capgemini.salesmanagement.util;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;


public class CollectionUtil {

public static HashMap<Integer,Sale>sales = new HashMap<Integer,Sale>();
public static int SALE_ID= (int) (Math.random()*1000);
public static HashMap<Integer, Sale> getSales() {
	return sales;
}
public static void setSales(HashMap<Integer, Sale> sales) {
	CollectionUtil.sales = sales;
}
public static int getSALE_ID() {
	return SALE_ID;
}
public static void Date()
{
	
}


}
