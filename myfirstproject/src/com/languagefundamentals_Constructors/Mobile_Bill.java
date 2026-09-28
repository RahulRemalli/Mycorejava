package com.languagefundamentals_Constructors;

public class Mobile_Bill {
	String model;
	double price;
	int quantity;
	double dcharge;
	double mcost;
	double final_bill;
	

	Mobile_Bill() {
		this("", 0.0);
	}

	Mobile_Bill(String model, double price) {
		this(model, price, 0);
	}

	Mobile_Bill(String model, double price, int quantity) {
		this(model, price, quantity, 0.0);
	}

	Mobile_Bill(String model, double price, int quantity, double dcharge) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
		this.dcharge = dcharge;
		this.mcost = price * quantity;
		this.final_bill = mcost + dcharge;

	}

	public static void main(String[] args) {
		Mobile_Bill m1 = new Mobile_Bill();
		m1.getmobileinfo();

		Mobile_Bill m2 = new Mobile_Bill("TochScreen", 25000.0);
		m2.getmobileinfo();

		Mobile_Bill m3 = new Mobile_Bill("TochScreen", 25000.0, 2, 200.0);
		m3.getmobileinfo();

		Mobile_Bill m4 = new Mobile_Bill("S25ultra", 25000.0, 2, 200.0);
		m4.getmobileinfo();
	}

	void getmobileinfo() {


		System.out.println("**************************");
		System.out.println("Model of mobile :" + model);
		System.out.println("Price of the mobile :" + price);
		System.out.println("Quantities of mobile :" + quantity);
		System.out.println("Delivery charges of mobiole :" + dcharge);
		System.out.println("Mobile cost :" + mcost);
		System.out.println("Final bill of mobile :" + final_bill);
	}

}
