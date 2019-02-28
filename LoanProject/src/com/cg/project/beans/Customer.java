package com.cg.project.beans;

public class Customer {
	private long customerId;
	private String customerName;
	private String address;
	private long mobNo;
	private String email;
	
	public Customer() {
		super();
	}

	public Customer(long customerId, String customerName, String address, long mobNo, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.mobNo = mobNo;
		this.email = email;
	}
	public Customer(String customerName, String address, long mobNo, String email) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.mobNo = mobNo;
		this.email = email;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", mobNo=" + mobNo + ", email=" + email + "]";
	}
	
	
 
}
