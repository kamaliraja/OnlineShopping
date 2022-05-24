package com.kamali.oops;
//class Book 
public class Book {  
	public static void main(String[] args) {
		Book b1=new Book();
		b1.m2();
		//Book.m1();
		
		b1.m1();
	}
public static void m1() {
	System.out.println("Static method");
}
public  void m2() {
	System.out.println("Non Static method");
}
}
