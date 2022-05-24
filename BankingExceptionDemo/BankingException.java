package com.Exception.BankingExceptionDemo;

import java.util.Scanner;
import java.util.*;
public class BankingException {
	int transactionCount = 0;
	int transactionAmount =0;
	float accountBalance;
	Scanner obj = new Scanner(System.in);
	BankingException(float accountBalance){
		this.accountBalance = accountBalance;
	}
	
	public void WithDraw() {
		System.out.println("Enter the amount to be withdrawn ");
		int withDrawAmount = obj.nextInt();
		try {
			if(accountBalance < 1000) {
				throw new AccountBalance(accountBalance);
			}
		}		
		catch(AccountBalance e) {
			System.out.println("Alret! account balance is below 1000");
		}
		try {
			if(transactionCount >3) {
				throw new transactionCountablove3(transactionCount);
			}
		}
		catch(transactionCountablove3 e) {
			System.out.println("Alret! you have already done 3 transactions");
		}
		
		try {
			if(transactionAmount > 100000) {
				throw new transactionAmountAbove1L(transactionAmount);
			}
		}
		catch(transactionAmountAbove1L e) {
			System.out.println("Alret! transaction amount more than 100000");
		}

		try {
			if(accountBalance < withDrawAmount ) {
				throw new InsufficientBalance();
				
			}
			else {
				accountBalance= accountBalance - withDrawAmount;
				System.out.println(" Balance after transaction is "+accountBalance);
				transactionCount++;
				transactionAmount = transactionAmount+withDrawAmount;
				try {
					if(accountBalance < 1000) {
						throw new AccountBalance(accountBalance);
					}
				}		
				catch(AccountBalance e) {
					System.out.println(" Alret! account balance below 1000");
				}
				
			}
		}
		catch(InsufficientBalance e) {
			System.out.println("alret! not enogh money");
		}
	}



}
