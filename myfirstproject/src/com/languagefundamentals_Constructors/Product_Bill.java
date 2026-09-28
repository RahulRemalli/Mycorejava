package com.languagefundamentals_Constructors;
import java.util.Scanner;
public class Product_Bill {
	String name;
	double price;
	int quantity;
	int discount;
	double final_amount;
	double totalamount;
	double tdiscount;
	double final_bill;
	

	Product_Bill() {
		this("Unknoun", 0.0, 0, 0);
	}

	Product_Bill(String name, double price, int quantity, int discount) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		
		this.totalamount = price * quantity;
		this.tdiscount = totalamount * discount/100;
		this.final_bill = totalamount - tdiscount;

	}

	public static void main(String[] args) {
//		Product_Bill p = new Product_Bill();
//		p.productinfo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your product name");
		String name = s.next() ;
		System.out.println("Enter product price");
		double price = s.nextDouble();
		System.out.println("Enter quantity of product");
		int quantity = s.nextInt();
		System.out.println("Enter product discount");
		int discount = s.nextInt();
       Product_Bill p1 = new Product_Bill(name,price,quantity,discount);		
	    p1.productinfo();
	}

	void productinfo() {

		System.out.println("Name of the product :" + " " + name);
		System.out.println("Price of the product :" + " " + price);
		System.out.println("Quantity of the product :" + " " + quantity);
		System.out.println("Discount of the product :" + " " + discount);
		System.out.println("Total amount of product :" + " " + totalamount);
		System.out.println("Total discount of the product :" + " " + tdiscount);
		System.out.println("Final bill of the product : " + " " + final_bill);
	}

}
