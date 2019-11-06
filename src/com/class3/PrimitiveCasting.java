package com.class3;

public class PrimitiveCasting {

	public static void main (String [] args) {
	  double d=12;
	  System.out.println(d);
	  
	  // int i=12.0 ; compile time error
	  // widening or automatic or implicit casting
	  byte b=127;
	  int i=b;
	  
	  int num=123;
	  double d1=num;
	  System.out.println(num);
	  
	  // narrowing or emplicit or manual casting
	  double d2=123.67;
	  int num2=(int)d2; // I am casting the value d2 in integer
	  
	  System.out.println(num2 ); 
	  
	  
	  int num3=1000;
	  byte b1=(byte)num3;
	  
	  System.out.println(b1);
	  
	  
	  
	  
	  
}
}
