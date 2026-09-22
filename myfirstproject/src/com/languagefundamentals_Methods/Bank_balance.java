package com.languagefundamentals_Methods;

import java.util.Scanner;

public class Bank_balance {
	static double balance = 100000.0;
	double deposite;
	double withdraw;

	public static void main(String[] args) {
		Bank_balance b = new Bank_balance();
		Scanner sc = new Scanner(System.in);
		System.out.println("How much you want to deposite amount");
		double dep = sc.nextDouble();
		System.out.println();
		b.deposite(dep);
		System.out.println("How much you want to withdraw amount");
		double with = sc.nextDouble();
		b.withdraw(with);
	}

	double withdraw(double with) {
		if (with >= 1000) {
			balance = balance - with;
			System.out.println("After withdraw the total balance is :" + balance);
		} else {
			System.err.println("please check! Withdraw amount is greater than 1000");
		}
		return balance;
	}

	double deposite(double dep) {

		balance = balance + dep;
		System.out.println("After deposite total balance is :" + balance);
		return balance;
	}

}
