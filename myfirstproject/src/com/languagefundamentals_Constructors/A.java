package com.languagefundamentals_Constructors;

public class A {
	int id;
	String name;
	int age;

	A(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {

	}

}

class B extends A {
	B(int id, String name, int age) {
		super(id, name, age);
	}
	B(B b){
		this(b.id,b.name,b.age);
	}

	public static void main(String[] args) {
		B b = new B(549, "Rahul", 22);
		b.get();
		B b1 = new B(b);
		b1.get();
	}

	void get() {
	    System.out.println("**********************");
		System.out.println("Enter your id :" + id);
		System.out.println("Enter your name :" + name);
		System.out.println("Enter your age :" + age);

	}
}
