package com.languagefundamentals;

public class Methods {
	static void method1() {
 	}
	static void method2() {
		method1();
		System.out.println("static method 2 called !");
	}
	void method3() {
		method2();
		System.out.println("instance method 1 called !");
	}
	void method4() {
		method3();
		System.out.println("instance method 2 called !");
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.method4();
	}

}
