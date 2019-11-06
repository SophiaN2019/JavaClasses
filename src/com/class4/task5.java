package com.class4;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println(" Please enter the city ");
		 String city=scan.nextLine();
		 System.out.println(" Please enter the temperature in Fahrenheit");
		 int Tem=scan.nextInt();
		 int convertedTemp=(Tem-32)*5/9;
		 		 System.out.println(" the tempeature of "+ city+" is "+ convertedTemp);
		
		 
		
		
		

	}

}
