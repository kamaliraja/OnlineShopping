package com.Exception.BankingExceptionDemo;

public class transactionAmountAbove1L extends Exception {

	int amount;
	public transactionAmountAbove1L(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		System.out.println("Total transacted amount is "+amount);
	}
}
