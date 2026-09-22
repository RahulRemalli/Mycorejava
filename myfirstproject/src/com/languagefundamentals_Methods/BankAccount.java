package com.languagefundamentals_Methods;

public class BankAccount {
	static int balance = 1000;

	static void deposite(int amount) {
		System.out.println("Deposite amount :" + amount);
		balance = balance + amount;
		System.out.println("After Deposite balence :" + balance);

	}

	static void withdraw(int amount) {
		System.out.println("Withdraw amount :" + amount);
		balance = balance - amount;
		System.out.println("After Withdraw balence :" + balance);

	}

	public static void main(String[] args) {
		System.out.println("Total balence :" + balance);
		deposite(500);
		withdraw(300);
	}

}
