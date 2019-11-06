package com.class4;

import java.util.Scanner;

public class ScannerPractice {
public static void main(String[] args) {
	
	Scanner Keyboard=new Scanner(System.in);
	// ask users to enter 2 numbers and then compare which is larger
	
	System.out.println(" Please enter first number");
	
	int  num1=Keyboard.nextInt();
	System.out.println(" Please enter second number");
	
	int num2=Keyboard.nextInt();
	
	if (num1>num2) {System.out.println(num1+" is larger than "+ num2);	
	else if (num2==num1)(System.out.println(num1+"is equal" + num1);)}
	}
else {		System.out.println(num1 + " is smaller than " + num2);
	}

}}
