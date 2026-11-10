package com.languagefundamentals_Loops;

import java.util.Scanner;

public class FactorialofGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of a given number is :" + fact);
	}
}
