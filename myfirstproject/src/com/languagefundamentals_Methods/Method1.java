package com.languagefundamentals_Methods;

//1. Create a method with no parameters and no return value.
public class Method1 {
	int id = 1;
	String name = "Rahul";

	void mem1() {
		System.out.println("No arg method called !");
		System.out.println("ID = " + id);
		System.out.println("Name = " + name);
		System.out.println("************************");
	}

	public static void main(String[] args) {
		Method1 m = new Method1();
		m.mem1();
		m.mem2(101);
		m.mem3(102, "Rahul");
		mem4(10,20);
	}
//4.	Create a method that returns an int.
	static int mem4(int a,int b) {
		System.out.println("Retype method called !");
		int add = a+b;
		System.out.println("Add two numbers :" + add);
		return add;
	}

	// 2. a method with one parameter.
	void mem2(int id) {
		System.out.println("One arg method called !");
		System.out.println("Id = " + id);
		System.out.println("************************");
	}

	//3. Create a method with two parameters.
	void mem3(int id, String name) {
		System.out.println("Two arg method called !");
		System.out.println("Id = " + id);
		System.out.println("Name =" + name);
		System.out.println("************************");

	}


}
