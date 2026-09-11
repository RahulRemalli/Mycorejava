package com.javaintro;

public class Employee1 {

	static int available_leaves = 10;

	void apply() {
		available_leaves--;
	}

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.apply();
		e.apply();
		e.apply();
		e.apply();
		System.out.println("Available leavs :" + available_leaves);
	}

}
