package com.languagefundamentals_Methods;

//2.Method with no return type and with parameters.
public class Testmethod2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		addition(10, 20);
		subtraction(100, 50);
		multiplication(50, 10);
		modulus(100, 5);
		division(100, 5);
		System.out.println("Main method ended");
	}

//method with parameters
	static void addition(int a, int b) {
		System.out.println("Addition of numbers :" + (a + b));
	}

	static void subtraction(int a, int b) {
		System.out.println("Subtraction of numkbers :" + (a - b));
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication of numkbers :" + a * b);
	}

	static void modulus(int a, int b) {// It gives remainder
		System.out.println("Modulus of numkbers :" + a % b);
	}

	static void division(int a, int b) {// It gives coefficient
		System.out.println("Division of numkbers :" + a / b);
	}

}
