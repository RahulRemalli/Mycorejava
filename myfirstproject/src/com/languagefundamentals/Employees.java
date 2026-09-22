package com.languagefundamentals;
public class Employees {
	int empid;
	String empname;
	double salary;

	void show() {
		System.out.println("Employee id :" + empid);
		System.out.println("Employee name :" + empname);
		System.out.println("Employee salary :" + salary);
		System.out.println("============================");
	}

	public static void main(String[] args) {

		Employees e1 = new Employees();
		Employees e2 = new Employees();
		Employees e3 = new Employees();
		e1.empid = 549;
		e1.empname = "Rahul";
		e1.salary = 34000.999;
		e2.empid = 522;
		e2.empname = "Akhil";
		e2.salary = 35000.899;
		e3.empid = 563;
		e3.empname = "Tagoor";
		e3.salary = 36000.789;
		e1.show();
		e2.show();
		e3.show();
	}

}
