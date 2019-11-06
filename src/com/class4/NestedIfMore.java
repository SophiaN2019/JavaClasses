package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {

// check age if age is less than 16 --> you are too young to drive
		// otherwise you are eligible to drive , then we will check if you are older
		// than 18--> you can get driver license, if not you can drive's permit
		//

		int age = 55;
		if (age < 16) {
			System.out.println("You are too young to Drive");
		} else {
			System.out.println(" You are eligible to drive");
			if (age >= 18) {
				System.out.println(" you can get alone");
			} else if (age > 100) {
				System.out.println(" you cannot drive");
			} else {
				System.out.println("you need to get a learner permit");
			}
		}
		System.out.println("88888888888888888888888888888888");

		boolean Quiz = true;
		int score = 23;

		if (Quiz) {
			System.out.println("Good job");
			if (score > 90) {
				System.out.println("You got an A");
			} else if (score > 80) {
				System.out.println("You got a B");
			} else {
				System.out.println("You should study more");
			}

		} else {
			System.out.println("not good job");
		}

	}
}
