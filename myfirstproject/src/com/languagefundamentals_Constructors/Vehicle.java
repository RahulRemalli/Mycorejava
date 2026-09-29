package com.languagefundamentals_Constructors;

public class Vehicle {
	String type;
	public Vehicle() {
		
	}

	public static void main(String[] args) {

	}
}

class Car extends Vehicle {
	Car() {

	}

	Car(String type) {
		super.type = type;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");
		Car c = new Car();
		c.vehicleinfo();
		
		Car c1 = new Car("Two_wheeler");
		c1.vehicleinfo();
		System.out.println("Main method ended !");
	}

	void vehicleinfo() {
		System.out.println("**********************");
		System.out.println("Vehicle type : " + type);
	}
}
