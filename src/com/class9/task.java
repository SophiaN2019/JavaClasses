package com.class9;

import java.util.Scanner;

public class task {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner ( System.in);
		System.out.println("Please enter 2 numbers");
		
		int start=scan.nextInt();
		int end=scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		
		for ( int i=start; i>=end; i--) {
			
			if (i%2==0) {
				sumEven+=i;
			} else{
				
				sumOdd+=i;
			} 
			
		}System.out.println(sumEven);
		System.out.println(sumOdd);
		
		
			
			
		
		
	}

}
