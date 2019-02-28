package com.cg.mra.beans;

public class Account {

	private String accountType;
	private String cutomerName;
	private double accountBalance;
	private String moobileNumber;
	public  Account(){}

	public Account(String accountType, String cutomerName, double accountBalance) {
		super();
		this.accountType = accountType;
		this.cutomerName = cutomerName;
		this.accountBalance = accountBalance;
	}



	public Account(String accountType, String cutomerName, double accountBalance, String moobileNumber) {
		super();
		this.accountType = accountType;
		this.cutomerName = cutomerName;
		this.accountBalance = accountBalance;
		this.moobileNumber = moobileNumber;
	}

	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	public String getMoobileNumber() {
		return moobileNumber;
	}

	public void setMoobileNumber(String moobileNumber) {
		this.moobileNumber = moobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((cutomerName == null) ? 0 : cutomerName.hashCode());
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (cutomerName == null) {
			if (other.cutomerName != null)
				return false;
		} else if (!cutomerName.equals(other.cutomerName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", cutomerName=" + cutomerName + ", accountBalance="
				+ accountBalance + ", moobileNumber=" + moobileNumber + "]";
	}
	
	


}
