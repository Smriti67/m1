package com.cg.billing.util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.cg.billing.beans.Sale;

public class CollectionUtil {
	private static HashMap<Integer, Sale> sales=new HashMap<Integer,Sale>();
    private static Date date=new Date();
	
	public static Date createDate()
	{
	 return date;
	}
	
	public static int generateSaleId()
	{
		return (int)(1000+(Math.random()*1000));
	}
	public static HashMap<Integer,Sale>getCollection(){
		return sales;
	}

}
