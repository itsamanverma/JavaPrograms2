/*
Flip Coin and print percentage of Heads and Tails
a. I/P -> The number of times to Flip Coin. Ensure it is positive integer .
b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
c. O/P -> Percentage of Head vs Tails 
*/
package com.bridgelabz.program;
public class FlipCoin 
{
 public static void main(String[] args) 
 {
   //Initialization//
	 int n, headCnt=0,tailCnt=0;
	 double heads ,tails;
	 Utility u = new Utility();
	 
	 //INPUT DATA//
	 System.out.println("Enter the no of times You Want to Flip the Coin:");
	 n=u.inputInteger();
	 
	 //Computation//
	 for(int i=0;i<n;i++) 
	 {
	   double random=Math.random();
	   if(random<0.5)
		    tailCnt++;
	   else
		    headCnt++;
	 }
	 
	 heads = headCnt/(double)n*100;
	 tails = tailCnt/(double)n*100;
	 System.out.println("Percentage of Heads: "+ heads );
	 System.out.println("Percentage of Tails:"+  tails );
 }
}
