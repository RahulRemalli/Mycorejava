package com.javaintro;

public class Rahul {
	static int counts = 0;
	{
		counts++;
	}

	public static void main(String[] args) {
		Rahul r1 = new Rahul();
		Rahul r2 = new Rahul();
		Rahul r3 = new Rahul();
		Rahul r4 = new Rahul();
		
		System.out.println(counts);
	}

}
