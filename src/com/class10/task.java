package com.class10;

public class task {
	
	public static void main(String[] args) {
		
		int [] b;
		int c[];
		
		b=new int[4];
		
		int [] array= new int[4];
		array[0]=10;
		array[1]=20;
		array [2]=30;
		array [3]=40;
		
	String[] classes=new String[4];
	classes[0]= "java";
	classes [1]= "SDLC";
	classes[2]= " Manual Testing";
	classes[3]= "GIT";
	
		String [] season= {"Winter", "fall", "summer", "spring"};
		System.out.println("I was born in "+ season[2]);
		int arraySize=season.length;
		System.out.println(arraySize);
		
		System.out.println("*********************************");
				
		char[] score = {'A','B', 'C','D','E','f'};
		char [] score1=new char[6];
		score1[0]='A';
		score1[1]='B';
		score1[2]='C';
		score1[3]='E';
		score1 [4]='F';
		int a=1;
		System.out.println(score[a]);
		
		String [] names= {"Ihsan", "Ahmet", "Asif","sophia","Samir"};
		System.out.println(names[4]);
		
		String[] words = {"Java", "Saturday"," Day","Coding","is"};
		System.out.println(words[1]+" "+ words[4]+" "+ words[0]+" "+ words[3]+" "+words[2]);
		
		System.out.println("*********************************");
		 for (int i=0; i<names.length; i++) {
			 
			 System.out.println(names[i]);
			 
		 }
		 
		 System.out.println("*********************************");
		 
				double [] number= {0.0, 1.1,1.2,2.3,2.4};
				int size=number.length;
				
				for ( int i=0; i<size; i++) {
					System.out.print(number[i]+" ");
				}
		 
		 
		
		
		
		
		
	}
	

}
