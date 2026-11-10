package com.languagefundamentals_Loops;

import java.util.Scanner;

//1)Write a Java program using a for loop and if-else-if statements 
//to print numbers from 1 to 50.  "Fizz" for numbers divisible by 5,
//"Buzz" for numbers divisible by 3, and "Fizz & Buzz" for number 
//which divisible by  both 3&5.
public class For_If_Else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Fizz and Buzz" + i);
			} else if (i % 5 == 0) {
				System.out.println("Fizz" + i);
			} else if (i % 3 == 0) {
				System.out.println("Buzz" + i);

			}
		}

	}

}
