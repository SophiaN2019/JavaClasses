package com.class11;

public class task45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
		//Develop a program which will identify/print the even numbers only.
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers
		
		int [] [] numbers= {				
				{2,3,4,5,6,7},
				{4,5,56,7,56},
				{76,67,45,88},
		};
	
		
		for (int a=0; a<numbers.length; a++) {
			int b=numbers [a].length;
			
			for (int j=0; j< b;j++ ) {
				
				if (numbers[a][j]%2!=0) {
					System.out.println(numbers);
				}
			}
		}
	}

}
