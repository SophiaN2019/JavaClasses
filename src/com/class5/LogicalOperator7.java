package com.class5;

import java.util.Scanner;

public class LogicalOperator7 {

	public static void main(String[] args) {
	
  Scanner scan;
	  int quiz, midTerm, finalScore,score;
	scan=new Scanner(System.in);
	 System.out.println(" Please enter your quiz score");
	 quiz=scan.nextInt();
	 System.out.println(" Please enter your mid term");
	 midTerm=scan.nextInt();
	 System.out.println(" Please enter your final score");
	 finalScore=scan.nextInt();
	 
	 score= (quiz+ midTerm+ finalScore)/3;
  
  

 if (score>=90) {
	 System.out.println(" grade A");
 } else if (score>=70 &&  score<90) { 
	System.out.println("Grade=B");
} else if (score>=50 && score < 70) {
	System.out.println(" grade c");
} else if (score<50  ) {
	System.out.println("grade F ");

	}
}
}