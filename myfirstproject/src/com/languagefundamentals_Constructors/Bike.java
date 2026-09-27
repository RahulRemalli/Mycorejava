package com.languagefundamentals_Constructors;

public class Bike {
	int year;
	String brand;
	String model;
	String color;
	double price;

	Bike() {
		this(0, "Unknown");
	}

	Bike(int year, String brand) {
		this(year, brand, "Unknown");
	}

	Bike(int year, String brand, String model) {
		this(year, brand, model, 120000.0);
	}

	Bike(int year, String brand, String model, double price) {
		this(year, brand, model, "Red", price);

	}

	Bike(int year, String brand, String model, String color, double price) {
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;

	}

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.bikeinfo();

		Bike b2 = new Bike(2026, "Hero");
		b2.bikeinfo();

		Bike b3 = new Bike(0, "Hero", "Glamour");
		b3.bikeinfo();

		Bike b4 = new Bike(0, "Hero", "Glamour", "Red", 150000.0);
		b4.bikeinfo();

	}

	void bikeinfo() {
		System.out.println("***********************");
		System.out.println("Year of bike : " + year);
		System.out.println("Brand of bike :" + brand);
		System.out.println("Model of bike :" + model);
		System.out.println("Color of bike : " + color);
		System.out.println("Price of bike :" + price);
	}

}
