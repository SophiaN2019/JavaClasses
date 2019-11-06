package com.homeTesting;

import java.util.Scanner;

public class classweds {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");

		String a, b;
		a = scan.nextLine();
		b = scan.nextLine();

		System.out.println("enter two numbers");

		int c, d;
		c = scan.nextInt();
		d = scan.nextInt();

		String output;

		if (c == d && a == b) {

			output = "AND";
		} else if (c == d || a == b) {
			output = "OR";
		} else if (c != d && a != b) {
			output = "None";
		} else {
			output = "invalid";
		}
		System.out.println(output);
	}
}
