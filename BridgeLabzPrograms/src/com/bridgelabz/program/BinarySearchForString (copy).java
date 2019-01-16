/*binarySearch method for String*/
package com.bridgelabz.program;
import java.util.Scanner;
public class BinarySearchForString 
{
	  public static void main(String[] args)
	  {
		//create the Scanner class to take User input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		//read the user input 
		int n =sc.nextInt();
		//Declaration & Allocation of Array;
		String str[]=new String[n];
		//Read the String from User
		String st=sc.nextLine();
		System.out.println("Read the String Array Elements:");
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.nextLine();
		}
		System.out.println("Enter the String Array Elements:");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		Utility u = new Utility();
		int index=u.binarySearch(str,st);
		if(index==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at"+"index: "+index);
	  }
}
