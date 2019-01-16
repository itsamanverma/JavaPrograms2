/*
 User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P​ -> Take User Name as Input. ​ Ensure UserName has min 3 char
b. Logic​ -> Replace <<UserName>> with the proper name
c. O/P​ -> Print the String with User Name
 */
package com.bridgelabz.program;
public class ReplaceName 
{
   public static void main(String[] args) 
   {
	   //Initialization//
	  String st1,st2,st3,st4;
	  Utility u = new Utility();
	  
	  //Input Data
	  System.out.println("Enter the String: ");
	  st1=u.inputString();
	  
	  System.out.println("Enter the Name You Want to Replace: ");
	  st2=u.inputString();
	  
	  System.out.println("Enter the Name You Want to Replace with: ");
	  st3=u.inputString();
	  
	  st4=st1.replace(st2,st3);
	  //Output
	  System.out.println("New String With Replacement:"+ st4);
	  
   }
}
