package com.languagefundamentals_Constructors;

import java.util.Scanner;

public class Employee_sal {
	String name;
	double basic_sal;
	double bonus;
	double totalsal;

	Employee_sal() {
	}

	Employee_sal(String name, double basic_sal, double bonus) {
		this.name = name;
		this.basic_sal = basic_sal;
		this.bonus = bonus;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name !");
		String name = sc.next();
		System.out.println("Enter basic salary !");
		double basic_sal = sc.nextDouble();
		System.out.println("Enter employee bonus !");
		double bonus = sc.nextDouble();

		Employee_sal e1 = new Employee_sal(name,basic_sal,bonus);
		e1.empinfo();
		
//		Employee_sal e = new Employee_sal();
//		e.empinfo();
	}

	void empinfo() {
		double totalsal = basic_sal + bonus; 
		System.out.println("*******************************");
		System.out.println("Name of the employee :" + name);
		System.out.println("Basic salary of the employee :" + basic_sal);
		System.out.println("Bonus sof the employee :" + bonus);
		System.out.println("Total salary of the employee :" + totalsal);
	}

}
