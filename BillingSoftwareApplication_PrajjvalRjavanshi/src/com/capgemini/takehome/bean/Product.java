package com.capgemini.takehome.bean;

public class Product {
	private int productId;
	private String productName;
	private String productCateogery;
	private int productPrice;
	private int quantity;
	private int lineTotal;
	public Product() {}
	public Product(int productId, String productName, String productCateogery, int productPrice, int quantity,
			int lineTotal) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCateogery = productCateogery;
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lineTotal;
		result = prime * result + ((productCateogery == null) ? 0 : productCateogery.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		result = prime * result + quantity;
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
		if (lineTotal != other.lineTotal)
			return false;
		if (productCateogery == null) {
			if (other.productCateogery != null)
				return false;
		} else if (!productCateogery.equals(other.productCateogery))
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
		if (quantity != other.quantity)
			return false;
		return true;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(int lineTotal) {
		this.lineTotal = lineTotal;
	}
	public Product(int productId, String productName, String productCateogery, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productCateogery = productCateogery;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCateogery() {
		return productCateogery;
	}
	public void setProductCateogery(String productCateogery) {
		this.productCateogery = productCateogery;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product "+ "\n Product Name:                " + productName + "\n Product Cateogery:         "
				+ productCateogery + "\n Product Price:                  " + productPrice + "\n Quantity:                          " + quantity + "\n Line Total:                         "
				+ lineTotal ;
	}
	
	
}
