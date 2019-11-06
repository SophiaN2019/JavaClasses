package com.class9;

public class NestedLoop5 {

	public static void main(String[] args) {
		
		for ( int i=1; i<=5; i++) {
			
			for ( int j=5; j>=1; j--) {
				System.out.print(j);
			}
				System.out.println();
		}
		
		System.out.println("*******");
		
		for ( int a=5; a>=1; a--) {
			for ( int b=0; b<5; b++) {
				
				System.out.print(a);
			} System.out.println();
		}
		
		System.out.println("*********");
		
		for ( int v=0; v<=4; v++) {
			for (int u=0; u<=v; u++) {
				System.out.print("*");
			} System.out.println();
		}
	}
}
