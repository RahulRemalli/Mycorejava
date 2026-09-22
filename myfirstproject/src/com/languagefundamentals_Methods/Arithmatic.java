package com.languagefundamentals_Methods;

public class Arithmatic {

	int addition(int a, int b) {
		int result = a + b;
		System.out.println("Addition :" + result);
		return subtraction(result, 5);
	}

	int subtraction(int a, int b) {
		int result = a - b;
		System.out.println("Subtraction :" + result);
		return multiplication(result, 2);
	}

	int multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication :" + result);
		return division(result, 4);
	}

	int division(int a, int b) {
		int result = a / b;
		System.out.println("Division :" + result);
		return modulus(result, 5);
	}

	int modulus(int a, int b) {
		int result = a % b;
		System.out.println("Modulus :" + result);
		return result;
	}

	public static void main(String[] args) {
		Arithmatic a = new Arithmatic();
		a.addition(20, 10);
	}

}
