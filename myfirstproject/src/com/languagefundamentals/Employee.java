package com.languagefundamentals;

public class Employee {
	String name;
	int empid;
	byte empage;
	double sal;
	char grade;
	int experience;
	boolean empisactive;
	int leaves;
	long phone;
	


	static int availableleaves = 5;

	void apply() {
		availableleaves--;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Rahul";
		e.empid = 1;
		e.empage = 22;
		e.sal = 36000;
		e.grade = 'A';
		e.experience = 0;
		e.empisactive = true;
		e.leaves = 5;
		e.phone = 7675988832L;
		e.apply();
		e.apply();
		e.apply();
		System.out.println("Employee name :" + e.name);
		System.out.println("Employee id :" + e.empid);
		System.out.println("Employee age :" + e.empage);
		System.out.println("Employee salary :" + e.sal);
		System.out.println("Employee grade :" + e.grade);
		System.out.println("Employee experience :" + e.experience);
		System.out.println("Employee is active :" + e.empisactive);
		System.out.println("Employee leaves :" + e.leaves);
		System.out.println("Employee phone :" + e.phone);
		System.out.println("Available leavs :" + availableleaves);

	}

}
