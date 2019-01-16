package com.bridgelabz.program;
import java.util.Scanner;
public class BubbleSortForString 
{
  public static void main(String[] args) 
  {
	  //create the scanner class object to take user inputs
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		//read the user string
		String str=sc.next();
		//convert the string into char type array
		char ch[]=str.toCharArray();
		System.out.println("Enter the Element of The Array");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"  ");
		}  
		Utility u = new Utility();
		  u.bubbleDownSorting(ch);
	    }
}
