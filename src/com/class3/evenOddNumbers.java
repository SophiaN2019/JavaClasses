package com.class3;

public class evenOddNumbers {

	public static void main(String[] args) {

		int month = 12;

		if (month == 1) {
			System.out.println(" this is January");
		} else if (month == 2) {
			System.out.println(" February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("july");
		} else if (month == 8) {
			System.out.println(" august");
		} else if (month == 9) {
			System.out.println("september");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("bein il est temps de partir mes amis");
		}

		/// task2

		int i = -98;
		if (i > 0) {
			System.out.println("the number is positive");
		} else if (i < 0) {
			System.out.println(" the number is negative");
		}

		//
		int n = 6;

		if (n % 2 == 0) {
			System.out.println(" the number is Even");
		} else {
			System.out.println(" the number is odd");}
		
		if (n%2!=0) { System.out.println(n+" is an odd number");}
		else {System.out.println( n+ "  is an even number ");}
		
		
	}
}
