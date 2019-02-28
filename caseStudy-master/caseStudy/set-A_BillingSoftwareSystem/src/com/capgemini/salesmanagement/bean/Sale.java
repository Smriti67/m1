package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {
private int saleId;
private int productCode;
private String productName;
private String category;
private LocalDate saleDate;
private int quantity;
private float lineTotal;

public Sale(){}

public Sale(int productCode, String productName, String category, LocalDate saleDate, int quantity, float lineTotal) {
	super();
	this.productCode = productCode;
	this.productName = productName;
	this.category = category;
	this.saleDate = saleDate;
	this.quantity = quantity;
	this.lineTotal = lineTotal;
}

public int getSaleId() {
	return saleId;
}

public void setSaleId(int saleId) {
	this.saleId = saleId;
}

public int getProductCode() {
	return productCode;
}

public void setProductCode(int productCode) {
	this.productCode = productCode;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public LocalDate getSaleDate() {
	return saleDate;
}

public void setSaleDate(LocalDate saleDate) {
	this.saleDate = saleDate;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public float getLineTotal() {
	return lineTotal;
}

public void setLineTotal(float lineTotal) {
	this.lineTotal = lineTotal;
}



}
