package com.cg.project.beans;

public class Loan {
	private long loanId;
	private double loanAmount;
	private long custId;
	private int duration;
	
	public Loan() {
		super();
	}

	public Loan(long loanId, double loanAmount, long custId, int duration) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;
	}
	
	public Loan(double loanAmount, long custId, int duration) {
		super();
		this.loanAmount = loanAmount;
		this.custId = custId;
		this.duration = duration;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		 this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", custId=" + custId + ", duration=" + duration
				+ "]";
	}
	

}
