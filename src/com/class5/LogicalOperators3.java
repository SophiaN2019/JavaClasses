package com.class5;

public class LogicalOperators3 {
	public static void main(String[] args) {
	
	 String day=("Tuesday");
	 
	 if (day.equals("Tuesday") || day.equals("Thursday")){
		 
	 
			System.out.println(" SDLC Class");
} else if ( day.equals("Saturday ")|| day.equals("Sunday"))
	
{ System.out.println(" Java Class");

} else if (day.equals("Monday") || day.equals ("Friday")) {
System.out.println(" No class");

} else if ( day.contentEquals( "Wednesday") ) { System.out.println(" review Class");

} else { System.out.println("NOt a valid day");
}
	}
}
