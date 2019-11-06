package com.class3;

public class relationalOperators {

	public static void main(String[] args) {
	
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("*********");
		
		
		double d=1.99;
		double d1=2.99;
				boolean b=d>d1;
				System.out.println(b);
				
				boolean b1=d<d1;
				boolean b2=d==d1;
				boolean b3=d!=d1;
			System.out.println(b1);	
			System.out.println(b2);	
			System.out.println(b3);	
			System.out.println("$$$$$$$$$$$");
			
			int a=20;
			int c=30;
			
			//if number a is bigger than number c
			// i want to print a is larger than c
	
			if (a>c) {
				System.out.println("a is larger than c");
				
			} else {  System.out.println("a is smaller than c");}
			
			
			int expectedHours=15;
			int actualHours=2;
			// if expect hours are more than actual -> you will successd
			// otherwise , please study more;
			
			if (actualHours>expectedHours) {
			System.out.println( "You will successed");
			} else { System.out.println(" please study more");}
			
			double teaPrice=4.99;
			double allowedPrice= 3.99;
			teaPrice-=2;
			
			if (allowedPrice>= teaPrice) {System.out.println(" I will not buy");}
			else {System.out.println("I will buy tea");
				} 
			System.out.println(" $$$$$$$$$$$$$");
			
			double f= 20;
			double f2=35;
			
			if (f>f2) { System.out.println("Double value "+f+ " is larger than "+ f2);}
			else { System.out.println("Double value "+f2+  " is larger than "+ f);}
			
			
			double TemperatureCheck=35;
			if (TemperatureCheck <32) { System.out.println("Water will freeze with temperature "+ TemperatureCheck);}
			else { System.out.println("Water will Not freeze with temperature "+ TemperatureCheck);}
			
			
			System.out.println("********");
			
			boolean  val=false;
			if (val) { System.out.println("hello");} else { System.out.println( " batata");}
			boolean  val1=true;
			if (val1) { System.out.println("helloooooooooooo");} else { System.out.println( " batata");}
			
			}
			
	}


