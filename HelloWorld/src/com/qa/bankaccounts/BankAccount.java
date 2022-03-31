package com.qa.bankaccounts;

public class BankAccount {
	private String customerName;
	private float accountBalance;
	private String sortCode;
	private String accountNo;
	
	protected BankAccount(String customerName, float accountBalance, String sortCode, String accountNo) {
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.sortCode = sortCode;
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	

}
