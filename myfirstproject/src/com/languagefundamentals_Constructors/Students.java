package com.languagefundamentals_Constructors;

public class Students {
	static int count = 0;

	Students() {
		count++;
	}

	public static void main(String[] args) {
		Students s = new Students();
		Students s1 = new Students();
		Students s3 = new Students();
		System.out.println("count = " + count);

	}

}
