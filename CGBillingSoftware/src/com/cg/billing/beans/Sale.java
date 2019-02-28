package com.cg.billing.beans;

import java.time.LocalDate;
import java.util.Date;

public class Sale {
	private int saleId;
	public Sale(int saleId, String category, int quantity, int prodCode, int prodPrice, String productName) {
		super();
		this.saleId = saleId;
		this.category = category;
		this.quantity = quantity;
		this.prodCode = prodCode;
		this.prodPrice = prodPrice;
		this.productName = productName;
	}
	private String category;
	private int quantity;
	private int prodCode;
	private int prodPrice;
	private String productName;
	private Date date;
	private float lineTotal;
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice=prodPrice;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getDate() {
		return date;
	}
	public Sale(String category, int quantity, int prodCode, int prodPrice, String productName, float lineTotal) {
		super();
		this.category = category;
		this.quantity = quantity;
		this.prodCode = prodCode;
		this.prodPrice = prodPrice;
		this.productName = productName;
		this.lineTotal = lineTotal;
	}
	public void setdate(Date date) {
		this.date = date;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	@Override
	public String toString() {
		return "sale [saleId=" + saleId + ", category=" + category + ", quantity=" + quantity + ", prodCode=" + prodCode
				+ ",prodPrice="+prodPrice+", productName=" + productName + ", date=" + date + ", lineTotal=" + lineTotal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + Float.floatToIntBits(lineTotal);
		result = prime * result + prodCode;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + saleId;
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
		Sale other = (Sale) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Float.floatToIntBits(lineTotal) != Float.floatToIntBits(other.lineTotal))
			return false;
		if (prodCode != other.prodCode)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (saleId != other.saleId)
			return false;
		return true;
	}
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sale(String category, int quantity, int prodCode, String productName,int prodPrice, Date date, float lineTotal) {
		super();
		this.category = category;
		this.quantity = quantity;
		this.prodCode = prodCode;
		this.productName = productName;
		this.date = date;
		this.lineTotal = lineTotal;
		this.prodPrice=prodPrice;
	}
	public Sale(int saleId, String category, int quantity, int prodCode, String productName,int prodPrice, Date date,
			float lineTotal) {
		super();
		this.saleId = saleId;
		this.category = category;
		this.quantity = quantity;
		this.prodCode = prodCode;
		this.productName = productName;
		this.date = date;
		this.lineTotal = lineTotal;
		this.prodPrice=prodPrice;
	}

	
	

}
