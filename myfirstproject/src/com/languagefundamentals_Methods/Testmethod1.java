package com.languagefundamentals_Methods;

//1.Method with no return type and no parameters.
public class Testmethod1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Testmethod1 t = new Testmethod1();
		hello();
		t.welcome();
		System.out.println("Main method ended");
	}

	public static void hello() {
		System.out.println("Hello method called");
	}

	void welcome() {
		System.out.println("Welcome method called");
	}

}
