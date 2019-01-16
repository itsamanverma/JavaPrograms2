/*
Factors
a.Desc ­> Computes the prime factorization of N using brute force.
b. I/P ­> Number to find the prime factors
c. Logic ­> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P ­> Print the prime factors of number N.*/
package com.bridgelabz.program;
import java.util.Scanner;
public class PrimeFactor 
{
	public static void main(String args[])
	{
	      //Initialization//	
	      int number;
	      //create the Scanner class to Takes The User Inputs//
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      //Read the Input From User//
	      number = sc.nextInt();
	      
	      //Computation//
	      for(int i = 2; i< number; i++) 
	      {
	         while(number%i == 0) 
	         {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      
	      if(number >2) 
	      {
	         System.out.print(number+" ");
	      }
	   }
}
