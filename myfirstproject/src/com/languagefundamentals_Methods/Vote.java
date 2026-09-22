package com.languagefundamentals_Methods;

import java.util.Scanner;

//Create a method to check whether a person is eligible to vote.
public class Vote {
	static int age;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = s.nextInt();
		vote(age);
	}

	static void vote(int age) {
		if (age >= 18) {
			System.out.println("The person is eligible for voting !");
		} else {
			System.err.println("The person is not eligible for voting !");
		}
	}

}
