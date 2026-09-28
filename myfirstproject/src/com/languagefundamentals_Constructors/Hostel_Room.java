package com.languagefundamentals_Constructors;

import java.util.Scanner;

public class Hostel_Room {
	String name;
	int room_id;
	int sharing;
	double rent;
	double extrakarusulu;
	double total;

	Hostel_Room(String name, int room_id, int sharing, double rent, double extrakarusulu) {
		this.name = name;
		this.room_id = room_id;
		this.sharing = sharing;
		this.rent = rent;
		this.extrakarusulu = extrakarusulu;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your hostel name !");
		String name = s.nextLine();
		System.out.println("Enter room number !");
		int room_id = s.nextInt();
		System.out.println("Enter room sharing !");
		int sharing = s.nextInt();
		System.out.println("Enter your rent !");
		double rent = s.nextDouble();
		System.out.println("Enter your karusulu !");
		double extrakarusulu = s.nextDouble();
		Hostel_Room h = new Hostel_Room(name, room_id, sharing, rent, extrakarusulu);
		h.hostelinfo();
	}

	void hostelinfo() {
		double total = rent + extrakarusulu;
		System.out.println("Name of the hostel :" + name);
		System.out.println("Room number of the hostel :" + room_id);
		System.out.println("Room sharing in hostel :" + sharing);
		System.out.println("Rent of the hostel :" + rent);
		System.out.println("Paikada karusulu :" + extrakarusulu);
		System.out.println("Total bill is :" + total);
	}

}
