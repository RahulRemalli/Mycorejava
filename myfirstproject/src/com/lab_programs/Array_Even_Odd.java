package com.lab_programs;

//1.Write a Java program to count even and odd elements in an array.
public class Array_Even_Odd {

	public static void main(String[] args) {
		int[] num = { 10, 1, 3, 5, 7, 8, 9, 22 };

		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 == 0) {
				System.out.println("Even numbers are :" + num[i]);
				
			}
			
		}
		System.out.println("********************");
		for (int i = 0; i < num.length; i++) {

			if (num[i] % 2 != 0) {
				
				System.out.println("Odd numbers are :" + num[i]);

			}
		}

	}
}
