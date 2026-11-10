
package com.lab_programs;

import java.util.Random;
import java.util.Scanner;

public class Random_Numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		char choice;

		do {
			System.out.println("Welcome to the Random number game!");
			System.out.println("3 chances to guess the correct number");
			System.out.println("-------------------------------------");

			int n = r.nextInt(6);

			for (int i = 1; i <= 3; i++) {

				System.out.println("Enter a guessed number!");
				int guessed = sc.nextInt();

				if (guessed < n) {
					System.out.println("Too Low! Try Again!");

				} else if (guessed > n) {
					System.out.println("Too High! Try Again!");

				} else {
					System.out.println("Congratulations! You won!");
					break;
				}

				if (i == 3) {
					System.out.println("Game Over!");
					System.out.println("Failed 3 chances!");
				}
			}

			System.out.println("Final result is: " + n);

			System.out.println("Do you want to play again? (y/n)");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		System.out.println("Thank you for playing!");

		sc.close();
	}
}
