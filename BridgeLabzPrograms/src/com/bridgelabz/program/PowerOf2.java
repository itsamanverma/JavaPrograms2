/*
Power Of 2
a.Desc ­> This program takes a command­line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P ­> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic ­> repeat until i equals N.
d. O/P ­> Print the year is a Leap Year or not.
*/
package com.bridgelabz.program;
import java.util.Scanner;
public class PowerOf2 
{
		public static void main(String[] args) 
		{
		  // Create the Scanner Class to Take User Input
		   Scanner sc = new  Scanner(System.in);
		   System.out.println("Enter the Number for you want The Table");
		   //Initialization And Declaration//
		    int n = sc.nextInt();
		    
		    Utility u = new Utility();
              // calling the Method From Utility class//		    
		      u.table(n);
		}
}
