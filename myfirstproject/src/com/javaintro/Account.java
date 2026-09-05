package com.javaintro;

public class Account {
	int accountno;
	String name;
	double balence;
	static int accountNoGenerator = 100;
	{
		accountNoGenerator++;
		accountno = accountNoGenerator;
	}

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		Account a5 = new Account();
		a1.name = "Rahul";
		a1.balence = 40000.0;
		a2.name = "Manikanta";
		a2.balence = 50000.0;
		a3.name = "Shashank";
		a3.balence = 60000.0;
		a4.name = "Karthik";
		a4.balence = 70000.0;
		a5.name = "sunil";
		a5.balence = 80000.0;
		System.out.println("Account number :" + a1.accountno);
		System.out.println("Account Holder name :" + a1.name);
		System.out.println("Account balence :" + a1.balence);
		System.out.println("*******************************");
		System.out.println("Account number :" + a2.accountno);
		System.out.println("Account Holder name :" + a2.name);
		System.out.println("Account balence :" + a2.balence);
		System.out.println("*******************************");
		System.out.println("Account number :" + a3.accountno);
		System.out.println("Account Holder name :" + a3.name);
		System.out.println("Account balence :" + a3.balence);
		System.out.println("*******************************");
		System.out.println("Account number :" + a4.accountno);
		System.out.println("Account Holder name :" + a4.name);
		System.out.println("Account balence :" + a4.balence);
		System.out.println("*******************************");
		System.out.println("Account number :" + a5.accountno);
		System.out.println("Account Holder name :" + a5.name);
		System.out.println("Account balence :" + a5.balence);
		System.out.println("*******************************");
	}

}
