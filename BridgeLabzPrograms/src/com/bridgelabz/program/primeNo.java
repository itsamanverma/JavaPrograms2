package com.bridgelabz.program;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class primeNo 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range of Number..!");
	boolean flag=true;
	String input;
	System.out.println("Enter the Starting point of range..!");
	input=sc.next();
	while(flag)
	{
		if(Utility.isNumber(input))//to make validation 
		{
			flag=false;
		}
		else
		{
			System.out.println("Enter the Correct Type Of Satarting point of range..!");
			input=sc.next();
		}
	}
	int start=Integer.parseInt(input);
	
	boolean flag1=true;
	String input1;
	System.out.println("Enter the end range of Number..!");
	input1=sc.next();
	while(flag1)
	{
		if(Utility.isNumber(input1))
		{
			flag1=false;
		}
		else
		{
			System.out.println("Enter the Correct Type Of end point of range..!");
			input1=sc.next();
		}
	}
	int end=Integer.parseInt(input1);
	List<Integer> list = new ArrayList<Integer>();//create the ArrayList To store the list of Prime no..@
	
	list=Utility.isPrime(start, end);//calling the isPrime method to check Prime number Condition..
	
	List<String> li=new ArrayList<String>();//create the List of Type String to convert the Integer into String type
	for (int i : list) 
	{
		li.add(String.valueOf(i));
	}
	System.out.println(li);
	
	Set<String> set = new HashSet<String>();//create the HashSet<String> type get set of PrimeAnagram.
	System.out.println("print the Prime no that are Anagram..! ");
	
	set=Utility.primeAnagram(li);
	System.out.println(set);
	
	Set<String> pal_set = new HashSet<String>();//create the HashSet<String> type to get the Set of primePolindrome
	System.out.println("Print the prime No which are Polindrome..!");
	
	pal_set=Utility.primePolindrome(li);
	System.out.println(pal_set);
	

 }
}
