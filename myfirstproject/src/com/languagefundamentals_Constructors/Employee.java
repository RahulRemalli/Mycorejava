package com.languagefundamentals_Constructors;

public class Employee {
	int id;
	String name;

	Employee() {
		System.out.println("No arg constructor called !");
		id = 101;
		name = "Unknown";
	}

	Employee(int id) {
		System.out.println("One arg constructor called !");
		this.id = id;
	}
	Employee(int id,String name) {
		System.out.println("Two arg constructor called !");
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empinfo();

		Employee e2 = new Employee(50);
		e2.empinfo();
		
		Employee e3 = new Employee(50,"Rohith");
		e3.empinfo();

	}

	void empinfo() {
		System.out.println("Employee id :" + id);
		System.out.println("Employee name :" + name);
		System.out.println("***********************");
	}
	

}
