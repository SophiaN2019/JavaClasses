package com.class8;


public class WhileExemple {

	public static void main(String[] args) {
	
             for (int i=0; i<=100; i++) {
            	 System.out.print(i+" ");
             }
             
             for (int b=100; b>=1; b--) {
            	 
            	 System.out.print(b+ " ");
             }
             for (int i=1; i<=20 && i>=1 ; i++) {
            	 
            	 if (i%2==0) {
            		 System.out.println(i+" ");
            	 }
             }
             
             for ( int i=20; i<=20 &&i>=1; i--) {
            	 if (i%2==0) {
            		 System.out.println(i+" ");
            	 }
             }
             
             for ( int i=20; i<=50; i++) {
            	 if (i%2!=0) {
            	 System.out.println(i+ " ");
             } }
             
             int sumAll=0;
             
             for ( int i=0; i<=20; i+=5) {
            	 sumAll=sumAll+i;
             }
             
             System.out.println(" the result is "+ sumAll);
            	 
            	 
            	 
            	 
             }
}


