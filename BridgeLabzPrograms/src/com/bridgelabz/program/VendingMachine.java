/*
Find the Fewest Notes to be returned for Vending Machine
a.Desc ­> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
returned by Vending Machine. Write a Program to calculate the minimum number
of Notes as well as the Notes to be returned by the Vending Machine as a
Change
b. I/P ­> read the Change in Rs to be returned by the Vending Machine
c. Logic ­> Use Recursion and check for largest value of the Note to return change
to get to minimum number of Notes
*/
package com.bridgelabz.program;

import java.util.Scanner;
public class VendingMachine 
{
  public static void main(String[] args) 
  {
   Scanner sc = new Scanner(System.in);
   //System.out.println("Enter the rupee:");
     boolean flag=true;
     String input;//make the stake input validate format
     System.out.println("Enter the Rupees..!");
	  input=sc.next();
	  while(flag)
	  {
		 if(Utility.isNumber(input)) 
		 {
			flag=false;
		 }else 
		 {
			System.out.println("Enter the correct type of rupees:");
			input=sc.next();
		 }
	  }
   int enter_money=Integer.parseInt(input);
   //int enter_money=sc.nextInt();
    Utility.countNotes(enter_money);
  } 
}
 