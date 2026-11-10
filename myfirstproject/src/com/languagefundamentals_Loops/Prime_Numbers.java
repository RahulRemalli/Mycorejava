package com.languagefundamentals_Loops;

import java.util.Scanner;

public class Prime_Numbers {
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

		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}
	}

}
