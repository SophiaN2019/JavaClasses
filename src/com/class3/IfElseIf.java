package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println(" num1 is larger num2");
		} else if (num1 == num2) {
			System.out.println("num2 is equal to  num1");
		}

		int day = 6;
		if (day == 1) {
			System.out.println("today is monday. I have ot go work");
		} else if (day == 2) {
			System.out.println(" today is Tuesday. I have SDLC class");
		} else if (day == 3) {
			System.out.println(" today is Wednesday. I have Java Review class");
		} else if (day == 4) {
			System.out.println(" today is Thursday. I have SDLC review class");
		} else if (day == 5) {
			System.out.println(" today is friday. weekend is here");
		} else if (day == 6) {
			System.out.println(" today is Saturday. My favorite coding day");
		} else if (day == 7) {
			System.out.println(" today is Sunday, I love spending sundays at Syntax");
		}

	}

}
