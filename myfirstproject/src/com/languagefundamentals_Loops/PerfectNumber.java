package com.languagefundamentals_Loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		isPerfect(n);

	}

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			status = true;
		}
		if (status) {
			System.out.println("The given numbert is perfect :" + sum);
		} else {
			System.err.println("The given number is not perfect:" + sum);
		}
		return status;
	}
}
