package while_loop.com;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			i++;
			System.out.print(i + " ");
		}
	}

}
