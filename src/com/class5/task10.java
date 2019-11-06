package com.class5;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println(" Please enter the month you were born");
		
		String month=scan.nextLine();
		String season = null;
		
		if (month.equals("january") || month.equals("february") || month.equals("december")){
			
			season="Winter";
		} else if (month.equals("march")|| month.equals("may")|| month.equals("may")) {
			season= "Spring";
		} else if ( month.equals("june")|| month.equals("july")|| month.equals("august")) {
			 season=" Summer";
		}else if (month.equals("septemeber")|| month.equals("october")|| month.equals("november")) {
			season="Fall";
		} else {
			season="unknown";
		}
		
		System.out.println(" You were born in "+ season );
		System.out.println(month);
	}

}
