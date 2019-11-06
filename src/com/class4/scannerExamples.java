package com.class4;

import java.util.Scanner;

public class scannerExamples {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/* nextint(); -> for numbers
		 * nextLine(); --->Strings
		 * nextDouble():----> double
		 */
		int number = scan.nextInt();
		System.out.println(" entered number is "+ number);
		
		
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println(" Please enter your name");
		
		String name=input.nextLine();
		System.out.println(" Good afternoon " + name );
		
		
	}

}
