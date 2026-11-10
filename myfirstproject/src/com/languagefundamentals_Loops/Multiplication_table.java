package com.languagefundamentals_Loops;

import java.util.Scanner;
//9 * 1 = 9
public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number where you want to print !");
		int n = sc.nextInt();
		System.out.println("Enter a number upto where you want to print !");
		int n1 = sc.nextInt();
		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

}
