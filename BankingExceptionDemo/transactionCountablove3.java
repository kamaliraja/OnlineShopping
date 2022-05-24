package com.Exception.BankingExceptionDemo;

public class transactionCountablove3 extends Exception {

	int count;
	public transactionCountablove3(int count) {
		// TODO Auto-generated constructor stub
		this.count =count;
		System.out.println("This is your "+count+" transaction");
	}
}
