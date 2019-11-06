package com.class9;

import java.util.Scanner;

public class NestLoop {
	public static void main(String[] args) {
		
		/*write a guessing game where the user has to guess a secret number between 1
         * and 20 after every guess input, the program tells the user whether their
         * number was to large or too small. The program will keep asking the user to
         * enter the number until he finds the correct number. when the correct answer
         * is found the system should display "congratulations!!. You got it!.
         * 
         * 
         */ 
		  Scanner scan=new Scanner ( System.in);
		  int c=14;
       for ( int i=0; i>=0; i++)	{  
         System.out.println(" Please guess a number between 1 and 20 ?");
       
         int a=scan.nextInt();
         if ( a==c) {
        	 System.out.println("congratulations!!. You got it!");
        	 break;
         } else if (a<c) {
        	 System.out.println(" the number is too small");
         } else  {
        	 
        	 System.out.println(" the number is too large");
         }
       }
         
	}

}
