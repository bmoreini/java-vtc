/**
 * IFWS2.java
 * Copyright 2015, Craig A. Damon
 * all rights reserved
 */

import java.util.Scanner;

/**
 * IFWS2 - description
 * @author Craig A. Damon
 *
 */
public class IFWS2
{

	/** simple (and biased) major advisor
	 * @param args
	 */
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Do you like to program?");
	   String reply = input.next();
/*		 switch (reply)
		 {
			 case "yes":
			 case "y":
	  		 if (reply.equalsIgnoreCase("yes")  || reply.equalsIgnoreCase("y"))
	  			 {
	  				 System.out.println("Try CPE");
	  			 }
	  		 else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n"))
	  			 {
	  				 System.out.println("Try CSE");
	  			 }
	  		 else
	  			 {
	  				 System.out.println("Please answer yes or no");
	  			 }
				 break;
			 case "no":
			 case "n":
	  		 System.out.println("Do you like to manage computers?");
	  		 reply = input.next();
	  		 if (reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y"))
	  			 {
	  				 System.out.println("Try IT");
	  			 }
	  		 else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n"))
	  			 {
	  				 System.out.println("Learn to flip burgers");
	  			 }
	  		 else
	  			 {
	  				 System.out.println("Please answer yes or no");
	  			 }
				default:
				 System.out.println("Please answer yes or no");
				 break;
		 }
*/
		 
		 if (reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y"))
	  	 {
	  		 System.out.println("Do you like to build hardware?");
	  		 reply = input.next();
		  		 if (reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y"))
	  			 {
	  				 System.out.println("Try CPE");
	  			 }
	  		 else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n"))
	  			 {
	  				 System.out.println("Try CSE");
	  			 }
	  		 else
	  			 {
	  				 System.out.println("Please answer yes or no");
	  			 }
	  	 }
	   else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n"))
	  	 {
	  		 System.out.println("Do you like to manage computers?");
	  		 reply = input.next();
	  		 if (reply.equalsIgnoreCase("yes") || reply.equalsIgnoreCase("y"))
	  			 {
	  				 System.out.println("Try IT");
	  			 }
	  		 else if (reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n"))
	  			 {
	  				 System.out.println("Learn to flip burgers");
	  			 }
	  		 else
	  			 {
	  				 System.out.println("Please answer yes or no");
	  			 }
	  	 }
		 else
			 {
				 System.out.println("Please answer yes or no");
			 }
	  input.close();
	}

}