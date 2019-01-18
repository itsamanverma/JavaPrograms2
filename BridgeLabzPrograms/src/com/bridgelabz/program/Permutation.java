/*
Write static functions to return all permutation of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.
*/
package com.bridgelabz.program;
import java.util.Scanner;
public class Permutation 
{
public static void main(String[] args) 
  {
	//create the Scanner class to Take User inputs//
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String to get the Possible permutation:");
	String st=sc.next();
	int n=st.length();
      Utility.permute(st,0,n-1);	
  }
}
