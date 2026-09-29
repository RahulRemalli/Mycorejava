package com.languagefundamentals_Constructors;

public class Student_ {
	int id;
	String name;
	String branch;

	Student_(int id, String name, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public Student_(Student_ s) {
		this.id = s.id;
		this.name = s.name;
		this.branch = s.branch;

	}

	public static void main(String[] args) {
		Student_ s = new Student_(549, "Rahul", "CSE");
		s.get();
		Student_ s1 = new Student_(s);
		s1.get();

	}

	void get() {
		System.out.println("*****************");
		System.out.println(" Your id :" + id);
		System.out.println(" Your name :" + name);
		System.out.println(" Your branch :" + branch);

	}

}
