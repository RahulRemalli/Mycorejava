package com.languagefundamentals_Constructors;

//1.Create a Java class Employee with the following requirements:
//->Create instance variables name, id, and salary.
//Create a parameterized constructor to initialize these variables.
//->Use the this keyword to differentiate instance variables
//from constructor parameters.
//->Create an object in the main() method by passing 
//employee details.
//Display the employee details.
public class Employeee {
	int eid;
	String ename;
	double salary;

	Employeee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employeee e = new Employeee(49, "Rahul", 35000.0);
		
		System.out.println("Employee id :" + e.eid);
		System.out.println("Employee name :" + e.ename);
		System.out.println("Employee salary :" + e.salary);
//		e.getempinfo();
	}

//	void getempinfo() {
//		System.out.println("Employee id :" + eid);
//		System.out.println("Employee name :" + ename);
//	
//		System.out.println("Employee salary :" + salary);
//	}
}
