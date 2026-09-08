package com.languagefundamentals;

public class Auto_boxing_unboxing {
//	Auto-Boxing
	int a1 = 10;
	Integer a2 = a1;
// Auto-Unboxing
	Integer a3 = 49;
	int a4 = a3;

	public static void main(String[] args) {
		System.out.println("Main method started");
		Auto_boxing_unboxing a = new Auto_boxing_unboxing();
		System.out.println(a.a2);
		System.out.println(a.a4);
		System.out.println("Main method ended");
	}

}
