package com.languagefundamentals_Loops;

import java.util.Scanner;

public class Factorial_Using_Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int a = fact(n);
		// Calling the method
		System.out.println("Factorial_Recursion :" + a);

	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
