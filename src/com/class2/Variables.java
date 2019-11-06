package com.class2;

public class Variables {
public static void main (String[] args) {
	String name= "jesse";
	String lastName="Mac";
	char grade='A';
	String city="vienna";
	String state=" va";
	long phoneNumber=12346909; // we can use L or l or not use it
	
	
	// I don't need string because I already declared the variable
	 city="Alexandria";
      state="DC";
	  phoneNumber=23991932;
	  grade='B';
	

	System.out.println(city);
	System.out.println(state);
	System.out.println(phoneNumber);
	System.out.println(grade);
	
	
	
	System.out.println("My name is "+ name);
	System.out.println("I live in city of "+ city);
	System.out.println("My phone number is "+ phoneNumber);
}
}
