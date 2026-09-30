package com.languagefundamentals_Constructors;

public class Bank_Account {
	long accountno;
	String holdername;
	double balance;
	String branch;
	Bank_Account(long accountno,String holdername,double balance,String branch){
		this.accountno = accountno;
		this.holdername = holdername;
		this.balance = balance;
		this.branch = branch;
		
	}
	Bank_Account(Bank_Account b,String branch,double balance){
		this.accountno = b.accountno;
		this.holdername = b. holdername;
		this.balance = balance;
		this.branch = branch;
	}

	public static void main(String[] args) {
		Bank_Account b = new Bank_Account(76759888l,"Rahul",5000.00,"Eluru");
		b.bankinfo();
		Bank_Account b1 = new Bank_Account(b,"Pedapadu",6000.00);
		b1.bankinfo();
	}
	void bankinfo() {
		System.out.println("****************************");
		System.out.println("Account number :" + accountno);
		System.out.println("Holder name :"+ holdername);
		System.out.println("Account balance :" + balance);
		System.out.println("Bank branch :" + branch);
	}

}
