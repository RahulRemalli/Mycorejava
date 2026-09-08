package com.languagefundamentals;
//Student Details Create a class Student with a method

//display() that prints
//Name,Age,College
//Create an object in main() and call the method

public class Student {
	String name = "Rahul";
	byte age = 22;
	String college = "RCE";

	void display() {
		System.out.println("Student name :" + name);
		System.out.println("Student age :" + age);
		System.out.println("Name of college :" + college);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}

}
