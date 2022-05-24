package com.Exception.BankingExceptionDemo;

public class AccountBalance extends Exception {
	float balance; 
	public AccountBalance(float balance) {      //account balance below 1000
		// TODO Auto-generated constructor stub
		this.balance = balance;
		System.out.println("the balance is "+balance);
	}

}
