package com.languagefundamentals_Loops;

import java.util.Scanner;

//input:6
//output:1 2 3 6
public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		findFactors(n);
	}

	static void findFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
