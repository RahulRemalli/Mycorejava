package com.lab_programs;

//2.Write a Java program to count positive and negative elements in an array.
public class Array_Positive_Nagative {

	public static void main(String[] args) {
		int[] a = { 1, 2, -2, 4, -6, -7, 8 };
		System.out.print("Positive numbers are :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.print(a[i] + " ");
			}

		}
		System.out.println();
		System.out.print("Nagative numbers are :");
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.print(a[i] + " ");
			}

		}

	}

}
