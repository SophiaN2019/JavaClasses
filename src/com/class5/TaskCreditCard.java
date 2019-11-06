package com.class5;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		
		/*Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately,
		 *  otherwise you can tell them that they can spend more
		 * 		 */
		
		
		Scanner input= new Scanner (System.in);
		 System.out.println(" Do you have credit card? true or false");
		 boolean cc=input.nextBoolean();
		 
		 if (cc) {
			 System.out.println(" what is the balance of your card");
			 int B=input.nextInt();
					 if (B>1000) { 
						 System.out.println(" please pay off your credit card");
					 }else 
					 { System.out.println(" you can spend more ");
					 }
						 
					 
		       }      else { System.out.println(" would you like to pappky for credit card"); }
		 
	}
}
