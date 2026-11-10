package com.lab_programs;

import java.util.Scanner;

public class Is_neonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number !");
		int n = sc.nextInt();
		
		int square = n * n;
		int sum = 0;
		
		
		while (square > 0) {
			
			int digit = square % 10;// 81%10 = 1
			square = square / 10;// 81/1=8
			sum = sum + digit;//
		}
		if (sum == n) {
			System.out.println(n + "" + "Is neon number!");
		} else {
			System.err.println(n + "" + "Is not a neon number !");
		}

	}

}
