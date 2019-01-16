/*
Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */
package com.bridgelabz.program;
public class LeapYaer 
{
 public static void main(String[] args) 
 {
     //Initialization//
	 int year,n;
	 String st;
	 Utility u = new Utility();
	 
	 //Input Data
	 System.out.println("Enter the Year to check is leap Or Not!..");
	 st=u.inputString();
	 year=Integer.parseInt(st);
	 
	 //Compute the Length//
	 n=st.length();
	 
	 //Check Length Condition if Length is less than 4 then no need to check//
	 if(n!=4)
	 {
	 System.out.println("Enter the Year In Valid Formate: ");
	 return;
	 }
	 //Computation
	 else
	 {
		 if(year %400==0 && year % 100==0)
			 System.out.println("Year: "+year+ " is a Leap Year");
		 else if( year % 100 !=0 && year% 4==0)
			 System.out.println("Year: "+year+" is a Lear Year ");
		 else
			 System.out.println("Year: "+year+" is not Leap Year");
	 }
 }
}
