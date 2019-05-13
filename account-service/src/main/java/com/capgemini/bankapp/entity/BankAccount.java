package com.capgemini.bankapp.entity;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)

public class BankAccount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountId;
	private String accountHolderName;
	private float accountBalance;
	private String accountType;
	
	
	public BankAccount() {
		super();
	}


	public BankAccount(long accountId, String accountHolderName, float accountBalance,String accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	


	public BankAccount(String accountHolderName, float accountBalance,String accountType) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}


	

	public long getAccountId() {
		return accountId;
	}


	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public float getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + ", accountType=" + accountType + "]";
	}


	

}
