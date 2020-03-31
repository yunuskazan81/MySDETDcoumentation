package com.class3;
import java.util.Scanner;

public class ClassThree {

	public static void main(String[] args) {
		
		
		
//		//we'll go over this together 
//		  boolean a = false;
//	      boolean b = true;
//	      System.out.println("a && b = " + (a&&b));
//	      System.out.println("a || b = " + (a||b) );
//	      System.out.println("!(a && b) = " + !(a && b));
	     
	      
	      
	      
	      
	      
//		   int month = 3; 
//	    String mothString; 
	// 
//	       // switch statement with int data type 
//	       switch (month) { 
//	       case 1: 
//	    	   mothString = "Jan"; 
//	           break; 
//	       case 2: 
//	    	   mothString = "Feb"; 
//	           break; 
//	       case 3: 
//	    	   mothString = "Mar"; 
//	           break; 
//	       case 4: 
//	    	   mothString = "Apr"; 
//	           break; 
//	       case 5: 
//	    	   mothString = "May"; 
//	           break; 
//	       case 6: 
//	    	   mothString = "Jun"; 
//	           break; 
//	       case 7: 
//	    	   mothString = "Jul"; 
//	           break; 
//	       case 8: 
//	    	   mothString = "Aug"; 
//	           break; 
//	       case 9: 
//	    	   mothString = "Sep"; 
//	           break; 
//	       case 10: 
//	    	   mothString = "Oct"; 
//	           break; 
//	       case 11: 
//	    	   mothString = "Nov"; 
//	           break; 
//	       case 12: 
//	    	   mothString = "Dec"; 
//	           break; 
//	       default: 
//	    	   mothString = "Invalid Month"; 
//	           break; 
//	       } 
//	       System.out.println(monthString); 


		
		
		
		
		
		
		
		
		
		
		
		// Write a program to find out what to do for the following temperatures 
				// Temperatures is greater than 100 print out Stay inside it's too hot
				// temperatures is greater than 50 and less than 99 print out Wear summer  clothes 
				// temperatures is greater than 30 and less than 49 print out Wear winter clothes 
				// temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
				// lastly if the temperature  is lower than that print out Call for help it's too cold outside
			

		
		
//		
//	      int temp=100;
//	      String output;
//	      
//	      if (temp>100) {
//	    	  output="Stay inside it is too hot";
//	      }else if (temp >=50 && temp <=99) {
//	    	  output="Wear summer clothes"; 
//	      }else if (temp >=30 && temp <=49) {
//	    	  output="Wear winter clothes"; 
//	      }else if (temp >=10 && temp <=29) {
//	    	  output="Stay inside it is too cold";  
//	      }else {
//	    	  output="Help, it is too cold";
//	      }
//	      
//	      System.out.println(output);
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		
		
		
		
		

		//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old 
		// Age should NOT be greater than 18  print out  Too Young 
		// Age should be between 18 and 35 inclusive  print out Young Person
		// Age should greater or equal to 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
		// If the age is greater than 100  print print out  You are too Old
		// Create an int variable named age 
		// Must use a Scanner 

		
		
		
		
		
		
		
	  	    int age;
	         String output;
	 	    Scanner sc = new Scanner(System.in);
	 		System.out.println(" Please Enter Your Age: ");
	 		age = sc.nextInt();
	 		
	 		if (!(age > 18)) {
	 			output ="You are Too Young";
	 		}
	 		else if (age >= 18 && age <= 35) {
	 			output ="Young Person";
	 		}
	 		else if (age <= 36 || age <= 99) {
	 			output ="You are Middle Age Person";
	 		}
	 		else {
	               output ="You are too Old";
	 			}
	     System.out.println(output);

	
		
		
		
		
		
		
		
		
		

		//Write a program that will use a switch statement to display what day of the week and also the weekend

		
		
		
//		
//		
//		 int day = 44; 
//	     String dayString; 
//	  
//	        // switch statement with int data type 
//	        switch (day) { 
//	        case 1: 
//	            dayString = "Monday"; 
//	            break; 
//	        case 2: 
//	            dayString = "Tuesday"; 
//	            break; 
//	        case 3: 
//	            dayString = "Wednesday"; 
//	            break; 
//	        case 4: 
//	            dayString = "Thursday"; 
//	            break; 
//	        case 5: 
//	            dayString = "Friday"; 
//	            break; 
//	        case 6: 
//	            dayString = "Saturday"; 
//	            break; 
//	        case 7: 
//	            dayString = "Sunday"; 
//	            break; 
//	        default: 
//	            dayString = "Invalid day"; 
//	            break; 
//	        } 
//	        System.out.println(dayString); 
//
//	}
		
		
		
		
		
		
		
		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		// Write a program to found out the user level of experience 
		// Must use a switch statement with  a String variable named levelString and a int variable named level
		
	// Beginner level should be 1
	// Intermediate level should be 2
	// Expert level should be 3
		
	
	
	
//    String levelString="Expert";  
//    int level=0;  
//    //Using String in Switch expression  
//    switch(levelString){    
//    //Using String Literal in Switch case  
//    case "Beginner":
//    	level=1;  
//    	break;    
//    case "Intermediate": 
//    	level=2;  
//    break;    
//    case "Expert":
//    break;    
//    default:
//    	level=0;  
//    break;  
//    }    
//    System.out.println("Your Level is: "+level);  

	  
	  
	  
	  
	  
		
		
		

	}

}
