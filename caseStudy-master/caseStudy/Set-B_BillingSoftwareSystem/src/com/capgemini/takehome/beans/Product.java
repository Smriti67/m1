package com.capgemini.takehome.beans;

public class Product {
public int productId;
public int productQuantity;
public String productName;
public String productCategory;
public int productPrice;
public int lineToatl;

public Product(){}

public Product(int productId, int productQuantity, String productName, String productCategory, int productPrice) {
	super();
	this.productId = productId;
	this.productQuantity = productQuantity;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
}

public Product(int productId, String productName, String productCategory, int productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productCategory = productCategory;
	this.productPrice = productPrice;
}

public Product( int productQuantity,int productId) {
	this.productQuantity=productQuantity;
	this.productId=productId;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public int getProductQuantity() {
	return productQuantity;
}

public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getProductCategory() {
	return productCategory;
}

public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}

public int getProductPrice() {
	return productPrice;
}

public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}

public int getLineToatl() {
	return lineToatl;
}

public void setLineToatl(int lineToatl) {
	this.lineToatl = lineToatl;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + lineToatl;
	result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
	result = prime * result + productId;
	result = prime * result + ((productName == null) ? 0 : productName.hashCode());
	result = prime * result + productPrice;
	result = prime * result + productQuantity;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (lineToatl != other.lineToatl)
		return false;
	if (productCategory == null) {
		if (other.productCategory != null)
			return false;
	} else if (!productCategory.equals(other.productCategory))
		return false;
	if (productId != other.productId)
		return false;
	if (productName == null) {
		if (other.productName != null)
			return false;
	} else if (!productName.equals(other.productName))
		return false;
	if (productPrice != other.productPrice)
		return false;
	if (productQuantity != other.productQuantity)
		return false;
	return true;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productQuantity=" + productQuantity + ", productName=" + productName
			+ ", productCategory=" + productCategory + ", productPrice=" + productPrice + ", lineToatl=" + lineToatl
			+ "]";
}


}