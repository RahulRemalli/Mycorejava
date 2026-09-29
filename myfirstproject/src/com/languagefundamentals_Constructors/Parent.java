package com.languagefundamentals_Constructors;

public class Parent {
	String name;
	int age;
	
	Parent(String name,int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {

	}

}
class Child extends Parent{
	String course;
	int passedout;
	

	Child(String name,int age,String course,int passedout){
		super(name,age);
		this.course = course;
		this.passedout = passedout;
	}
	public static void main(String[] args) {
		Child c = new Child("Rahul",22,"Java",2025);
		c.get();
		
	}
	void get() {
		System.out.println("Name of the person : " + name);
		System.out.println("age of the person :" + age);
		System.out.println("Course of the person :" + course);
		System.out.println("Year of passed out : " + passedout);
	}
}
