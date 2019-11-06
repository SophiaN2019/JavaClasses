package com.class5;

import java.util.Scanner;

public class LogicalOperatos6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age");

		int age = input.nextInt();

		if (age>=1 && age <=3) {
			System.out.println(" You re a baby ");
		} else if (age > 3 &&  age <= 5) {
			System.out.println(" you are a toddler");
		} else if (age < 5 &&  age > 12) {
			System.out.println(" You are a kid");
		} else if (age > 12 && age < 19) {
			System.out.println(" teenager");
		} else {
			System.out.println("you are a sharef");
		}
	}
}
