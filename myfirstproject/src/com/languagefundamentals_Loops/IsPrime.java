package com.languagefundamentals_Loops;

import java.util.Scanner;

public class IsPrime {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = s.nextInt();
		boolean status = isPrime(n);
		if (status) {
			System.out.println("The given number is prime !");
		} else {
			System.err.println("The given  number is not price !");
		}

	}

}
