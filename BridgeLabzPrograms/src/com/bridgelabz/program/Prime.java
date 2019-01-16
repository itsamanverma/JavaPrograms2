package com.bridgelabz.program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prime 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);//create the Scanner class Instance To Take user Inputs 
	System.out.println("Enter the Range of Numbers..!");
	int range=sc.nextInt();
	
	Utility u = new Utility();
	List<Integer> prime = new ArrayList<Integer>();//create List of Integer generic type to get the  list of number
	prime.add(2);
	for(int i=3;i<range;i=1+2)
	{
		if(u.isPrime(i))
		  prime.add(i);
	}
	System.out.println("Enter the Range Of Prime Number"+range+"in the List:");
	for (Integer pr : prime) 
	{
	    System.out.println(pr);	
	}	
	
 }
}
