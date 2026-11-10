package com.languagefundamentals_Constructors;

public class Product {
	int pid;
	String pname;
	double price;
	int quantity;

	Product(int pid, String pname, double price, int quantity) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(Product p, int quantity) {
		this(p.pid, p.pname, p.price, quantity);
	}

	public static void main(String[] args) {
		Product p = new Product(1, "Lap top", 50000.0, 1);
		p.calculateTotal();
		Product p1 = new Product(p, 3);
		p1.calculateTotal();

//		double product1 = p.price * p.quantity;
//		double product2 = p1.price * p1.quantity;
//		double total = product1 + product2;
//		System.out.println("total  : " + total);

	}

	void calculateTotal() {
		System.out.println("*************************");
		System.out.println("Enter product id :" + pid);
		System.out.println("Enter product name :" + pname);
		System.out.println("Enter product price :" + price);
		System.out.println("Enter product quantity :" + quantity);
		System.out.println("Both products total:" + (price * quantity) );
		

	}

}
