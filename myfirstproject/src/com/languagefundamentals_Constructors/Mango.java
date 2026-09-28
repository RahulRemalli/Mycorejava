package com.languagefundamentals_Constructors;

class Fruit {
	String name = "fruit";

	Fruit() {
		System.out.println("No arg constructor called from fruit !");
	}

	public static void main(String[] args) {
		System.out.println("Main method started from fruit !");
	}
}

public class Mango extends Fruit {
	String name = "Mango";

	Mango() {
		System.out.println("No arg constructor called from mango !");
	}

	public static void main(String[] args) {
		System.out.println("Main method started from mango !");
		Mango m = new Mango();
		m.getinfo();
	}

	void getinfo() {
		System.out.println("Fruit name is :" + super.name);
		System.out.println("Mango name is :" + this.name);

	}

}
