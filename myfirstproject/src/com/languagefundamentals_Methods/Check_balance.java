package com.languagefundamentals_Methods;

import java.util.Scanner;

public class Check_balance {
	static double balance = 100000.0;
	static double deposite;
	static double withdraw;

	public static void main(String[] args) {
		Bank_balance b = new Bank_balance();
		Scanner sc = new Scanner(System.in);
		System.out.println("How much you want to deposite amount");
		double dep = sc.nextDouble();

		double amount = deposite(dep);
		System.out.println("After deposite totall balance is :" + amount);
		System.out.println();
		System.out.println("How much you want to withdraw amount");
		double with = sc.nextDouble();
		double amount2 = withdraw(with);
		System.out.println("After withdraw totall balance is :" + amount2);
	}

	static double withdraw(double with) {
		if (with >= 1000) {
			balance = balance - with;
		} else {
			System.err.println("please check! Withdraw amount is greater than 1000");
		}
		return balance;
	}

	static double deposite(double dep) {
		balance = balance + dep;
		return balance;
	}

}
