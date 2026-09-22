package com.languagefundamentals;

public class Floting_Literals {

	public static void main(String[] args) {
		float a1 = 123;
		float a2 = 123.5f;
//		float a3 = 254.5;  Type mismatch cannot convert double to float
		float a3 = 123.f;
		float a4 = 0123.5f;
		float a5 = 0123;
		float a6 = 0x123;
		float a7 = 0123.5f;
		float a8 = 0x123f;
//		float a9 = 0x123.5f; Invalid hex literals
//	float a10 = 0x123.5; Invalid hex literals

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
//		System.out.println(a9);
//		System.out.println(a10);
		
	}

}
