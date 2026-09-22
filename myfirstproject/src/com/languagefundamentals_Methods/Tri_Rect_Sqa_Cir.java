package com.languagefundamentals_Methods;

//Triangle = 0.5*base*height,
//Rectangle = Length*breadth,
//Square = side*side,
//	Circle = PI*r*r.
//Calculate the area of:
//- Triangle: base = 20 m, height = 10 m
//- Rectangle: length = 18 m, breadth = 5 m
//- Square: side = 12 m
//- Circle: radius = 14 m, PI = 22/7
import java.util.Scanner;

public class Tri_Rect_Sqa_Cir {

	public static void main(String[] args) {
		Tri_Rect_Sqa_Cir t = new Tri_Rect_Sqa_Cir();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a base value ");
		int base = s.nextInt();
		System.out.println("Enter height value ");
		int height = s.nextInt();

		System.out.println("Enter lenght value ");
		int length = s.nextInt();

		System.out.println("Enter breadth value ");
		int breadth = s.nextInt();

		System.out.println("Enter side value ");
		int side = s.nextInt();

		System.out.println("Enter PI value ");
		double Pi = s.nextDouble();
		System.out.println("Enter radius value ");
		int radius = s.nextInt();

		t.findtriangle(base, height);
		t.findrectangle(length, breadth);
		t.findsquare(side);
		t.findcircle(Pi, radius);
	}

	double findcircle(double pi, int radius) {
		double cir = pi * radius * radius;
		System.out.println("Area of Circle =" + " " + cir);
		return cir;
	}

	int findsquare(int side) {
		int squ = side * side;
		System.out.println("Area of Square =" + " " + squ);
		return squ;
	}

	int findrectangle(int length, int breadth) {
		int rect = length * breadth;
		System.out.println("Area of Rectangle = " + " " + rect);
		return rect;
	}

	double findtriangle(int base, int height) {
		double tri = 0.5 * base * height;
		System.out.println("Are of triangle =" + "" + tri);
		return tri;
	}

}
