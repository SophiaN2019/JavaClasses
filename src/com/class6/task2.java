package com.class6;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter your gender :F or M");
		
		char gender=scan.next().charAt(0);
		String userGender;
		
		switch (gender) {
		
		case'F':
			userGender="Female";
			break;
		case'M':
		userGender="male";
		break;
		default:
			userGender="Unknown";
		}
		System.out.println("Your gender is "+userGender);
		
		
		
		
	
	}
	
}
