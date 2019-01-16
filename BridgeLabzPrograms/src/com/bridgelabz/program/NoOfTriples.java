/*
Sum of three Integer adds to ZERO
a.Desc ­> A program with cubic running time. Read in N integers and counts the
  number of triples that sum to exactly 0.
b. I/P ­> N number of integer, and N integer input array
c. Logic ­> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P ­> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.*/
package com.bridgelabz.program;
import java.util.Scanner;
public class NoOfTriples
{
public static void main(String[] args) 
   {
	//Create the Scanner class To User Input 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of Array..!");
	 //Read the User Input//
	 int n =sc.nextInt();
	 // Declaration & allocation of Array// 
	 int ar[]=new int[n];
	 System.out.println("Read the Elements of Array!..");
	 for(int i=0;i<ar.length;i++)
	 {
		 ar[i]=sc.nextInt();
	 }
	 System.out.println("Enter the Elements of Array..!");
	 for(int i=0;i<ar.length;i++)
	 {
		 System.out.print(ar[i]+" ");
	 }
	 Utility u = new Utility();
	 //Calling the method From Utility Class
	 u.triples(ar);
   }
}