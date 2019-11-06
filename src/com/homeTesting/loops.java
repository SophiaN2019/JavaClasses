package com.homeTesting;

import java.util.Scanner;

public class loops {

public static void main(String[] args) {
	
	/* Create a program that will be askinguser to apply for a credit card 10times. 
	 * As soon you get an “yes” froma user program should stop asking.

	 */
	
	for (int i=1; i<=20; i++) {
		
		if ( i==5 || i==6 || i==7) { 
			continue;
		}
	 System.out.println(i);
	
}

} }
