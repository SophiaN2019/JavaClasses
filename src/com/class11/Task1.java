package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] cars= {"BMW","Mercedes", "Toyota", " Honda", "LOMBERGHINI","SPARK"};
		
		for (String a:cars) {
			System.out.println(a);
		}
		
		System.out.println("*******"); 
		 for (int i=0; i<cars.length; i++) {
			 
			 System.out.println(cars[i]);
		 }
		 
		 System.out.println("***********&&&&&&&&&&&&");
		 // Create an array on integers and calculate the sum of all elements in an array
		 int [] b= {2,3,4,5,7,4,2};
		 int sum=0;
		 for (int i=0; i<b.length; i++) {
			 sum += b[i];
			 
		 } System.out.println(sum);
		 
		 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 //Create an array of countries. While retrieving all values from an array print capital for each country.
		 // (use 2 different loops).
		 
		 String [] countries= {"Algeria", "France","Tunisia"};
		for (int i = 0; i <countries.length; i++) {
			if (countries[i].equals("Algeria")) {
				System.out.println("The capital is Algiers");
				
			} else if (countries[i].equals("France")) {
				System.out.println(" the capital of France is Paris");
				
			} else if (countries[i].equals("Tunisia")) {
				System.out.println("The capital of Tunisia is Tunis");
				
			}

		}
		 
		 
	}

}
