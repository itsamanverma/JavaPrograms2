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
   System.out.println("Enter the Currency:");
   int enter_currency=sc.nextInt();
    Utility.currency(enter_currency);
  } 
}
