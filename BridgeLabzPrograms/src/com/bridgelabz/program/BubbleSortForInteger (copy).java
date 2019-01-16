/*bubbleSort method for integer*/
package com.bridgelabz.program;
import java.util.Scanner;
public class BubbleSortForInteger 
{
	 public static void main(String[] args) 
	   {
		 //Create the Scanner Object to get the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		//Declaration & Allocation of Array
		int ar[]= new int[n];
		System.out.println("Read the Element of Array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the Element of The Array");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"  ");
		}
		 Utility u = new Utility();
		 u.bubbleSorting(ar);
	   }
}
