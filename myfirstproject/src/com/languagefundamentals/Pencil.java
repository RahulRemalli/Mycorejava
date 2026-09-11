package com.languagefundamentals;

//1) A user has ₹100 and wants to buy a pencil which 
//One pencil costs ₹7.
//Display:
//How many pencils the user can buy
//How much balance money is left .
public class Pencil {
	int money = 100;
	int pencil_cost = 7;
	int result = money / pencil_cost; // It gives remainder
	int balance = money % pencil_cost;// It gives how you can buy

	public static void main(String[] args) {
		Pencil p = new Pencil();
		System.out.println("User Money has :" + p.money);
		System.out.println("One pencile cost :" + p.pencil_cost);
		System.out.println("The user can buy :" + p.result);
		System.out.println("Balance money is :" + p.balance);
	}

}
