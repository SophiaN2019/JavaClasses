package com.class4;

import java.util.Scanner;

public class task4 {
public static void main(String[] args) {
	
	//You are DMV representative and you need to ask customer their age. 
	 
	// 	 If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit
	 System.out.println(" Please enter your age");
	 Scanner so1=new Scanner(System.in);
	 int age=so1.nextInt();
	 
	 if ( age >=18) { System.out.println(" we will issue a driver license");
	 } else { System.out.println(" we can only offer a learer's permit");}
}
}
