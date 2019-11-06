package com.class10;

public class task2 {
	public static void main(String[] args) {

		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country.
		 * 
		 */

		String[] countries = { "Algeria", "Tunisia", "France" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("Algeria")) {
				System.out.println("The capital of Algeria is Algiers");
			} else if (countries[i].equals("Tunisia")) {
				System.out.println("The capital of Tunisia is Tunis");

			} else if (countries[i].equals("France")) {
				System.out.println("The capital of France is Paris.");

			}
		}

	}

}
