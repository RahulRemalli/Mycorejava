package com.languagefundamentals_Constructors;

public class Bank_Accounts {
	long accountno;
	String holdername;
	double balance;
	String branch;

	Bank_Accounts(long accountno, String holdername, double balance, String branch) {
		this.accountno = accountno;
		this.holdername = holdername;
		this.balance = balance;
		this.branch = branch;
	}

	Bank_Accounts(Bank_Accounts b) {
		this(b.accountno, b.holdername, b.balance, b.branch);

	}

	public static void main(String[] args) {
		Bank_Accounts b = new Bank_Accounts(46552554l, "Rahul", 2000.00, "KPHB");
		b.get();

		Bank_Accounts b1 = new Bank_Accounts(b);
		b1.balance = 3000.00;
		b1.branch = "JNTU";

		b1.get();
	}

	void get() {
		System.out.println("*****************************");
		System.out.println("Account number :" + accountno);
		System.out.println("Holder name :" + holdername);
		System.out.println("Account balance :" + balance);
		System.out.println("Branch of bank :" + branch);

	}

}
