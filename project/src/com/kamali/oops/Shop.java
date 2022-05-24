package com.kamali.oops;

public class Shop {

	static String shopName="kamali";
	static int doorNo=5;
	String name;
	int price=66;
	
public int buy() {
	return price;
	//System.out.println(" This is buy method");
	
}
	public static void main(String[] args){
		Shop prod1= new Shop();
		
		prod1.name="abc";
		prod1.price=77;
		System.out.println(prod1.name+ " " +prod1.price);

		int no=500;
		System.out.println(no);
	 	prod1.buy();
	 	
	}
}
