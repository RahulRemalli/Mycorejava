package com.languagefundamentals;

class Address {
	String country = "India";
	String city = "KPHB";
	int roadno = 2;
	long pincode = 733425L;
}

public class Employeee {
	String name = "Rahul";
	int id = 549;
	int age = 22;
	long phone = 7675988832L;
	Address address;

	public static void main(String[] args) {
		Employeee e = new Employeee();
		Address a = new Address();
		System.out.println("Employee name :" + e.name);
		System.out.println("Employee id :" + e.id);
		System.out.println("Employee age :" + e.age);
		System.out.println("Employee phone :" + e.phone);
		System.out.println("Employee Address ");
		System.out.println("Country name :" + a.country);
		System.out.println("City name :" + a.city);
		System.out.println("Road number :" + a.roadno);
		System.out.println("Pincode of city :" + a.pincode);
	}

}
