package com.Exception.BankingExceptionDemo;

public class InsufficientBalance extends Exception {

	float amount;
	public InsufficientBalance() {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		System.out.println(" Account is shortage of  "+amount);
	}

}
