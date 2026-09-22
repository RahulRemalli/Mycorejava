package com.languagefundamentals_Constructors;

// Understanding to constructor related program.
// In the below program has default constructor 
//provided by the java compiler.

public class Student {
	int sid;
	String sname;
	{
		System.out.println("Instance block called !");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid = 49;
		s1.sname = "Rahul";
		System.out.println("Student id :" + s1.sid);
		System.out.println("Student name :" + s1.sname);
	}

}
