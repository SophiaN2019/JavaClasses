package com.class9;

public class Nestloop2 {

	public static void main(String[] args) {
		
		// 24 hours, 60 minutes, 
		
		for ( int i=0; i<=24; i++) {
			
			for (int j=0; j<=59; j++) {
				
				 if ( j<10) {
					 
					 System.out.println(i+":"+"0"+j);
					 
				 }  else {System.out.println(i+ ":"+ j);}
			}
		}
		
		System.out.println("**********");
		
		
		
	}
}
