package packageBankSystem;

import java.io.Serializable;

//import java.io.*;
//import java.util.*;

public abstract class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* https://www.geeksforgeeks.org/composition-in-java/ */
	long   accountNumber;
	String ifscCode;
	String bankName; 
	double balance;
	String openingDate;
	String type;

	
	public Account(	String type,long accountNumber,String ifscCode,String bankName, double balance,String openingDate){
		this.accountNumber=accountNumber;
		this.ifscCode=ifscCode;
		this.bankName=bankName; 
		this.balance=balance;
		this.openingDate=openingDate;
		this.type=type;
	}
	abstract public double calculateInterest();
	abstract public void checkBalance();
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public double getBalance() {
		return balance;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public String getType() {
		return type;
	}


}



