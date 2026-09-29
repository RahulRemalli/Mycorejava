package com.languagefundamentals_Constructors;

import java.util.Scanner;

public class Manager {
	int id;
	String name;
	double salary;

	Manager(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Manager(Manager m) {
		id = m.id;
		name = m.name;
		salary = m.salary;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id !");
		int id = s.nextInt();
		System.out.println("Enter name !");
		String name = s.next();
		System.out.println("Enter salary !");
		double salary = s.nextDouble();
		
		Manager m = new Manager(id, name, salary);
		m.info();
		
		Manager m1 = new Manager(m);
		m1.info();
	}

	void info() {
		System.out.println("*******************");
		System.out.println("Manager id :" + id);
		System.out.println("Manager name :" + name);
		System.out.println("Manager salary :" + salary);
	}

}
