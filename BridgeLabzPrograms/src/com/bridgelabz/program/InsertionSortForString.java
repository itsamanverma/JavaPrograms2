/*insertionSort method for String*/
package com.bridgelabz.program;
import java.util.Scanner;
public class InsertionSortForString 
{
	public static void main(String[] args) 
	   {
		//create the Scanner Object to take The User Inputs
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the String");
		   //Read the User inputs..
		   String st= sc.nextLine();
		   //Convert the String Into Char type Array..
		   char ch[]=st.toCharArray();
		   System.out.println("Enter the String Character by Character...");
		   for(int i=0;i<ch.length;i++)
		   {
			   System.out.print(ch[i]+" ");
		   }
		   Utility u = new Utility();
		   u.insertionSort(ch);
	   }
}
