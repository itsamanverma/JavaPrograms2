package com.bridgelabz.program;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Prime 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);//create the Scanner class Instance To Take user Inputs 
    boolean flag=true;
    String input;//make the stake input validate format
    System.out.println("Enter the Range of Numbers..!");
	  input=sc.next();
	  while(flag)
	  {
		 if(Utility.isNumber(input)) 
		 {
			flag=false;
		 }else 
		 {
			System.out.println("Enter the correct type Range of Numbers..!");
			input=sc.next();
		 }
	  }
    int range=Integer.parseInt(input);
	//int range=sc.nextInt();
	Utility u = new Utility();
	List<Integer> prime = new ArrayList<Integer>();//create List of Integer generic type to get the  list of number
	prime.add(2);
	for(int i=3;i<range;i=i+2)
	{
		if(u.isPrime(i))
		  prime.add(i);
	}
	System.out.println("Enter the Range Of Prime Number"+range+"in the List:");
	for (Integer pr : prime) 
	{
	    System.out.print(pr+" ");	
	}	
	System.out.println("**********************************************************************************");
	HashMap<String,String> primeAnagram = Utility.isPrimeAnagram(prime);//create the a hashMap to stored the pairs of Anagram prime no in the hashmap..
	System.out.println("prime No which are anagrams of each other are..!");
	for(Map.Entry<String,String> entry:primeAnagram.entrySet())//shows the pairs of PrimeAnagram using forEach loop 
	{
		System.out.print(entry.getKey()+"\t");//append the value to key
		
		String[] vals=entry.getValue().split(",");//stored the value into string type array...
		
		for (String s : vals)
		{
		  System.out.println(Integer.parseInt(s)+"\t");	
		}
		System.out.println();
		sc.close();
	}
 }
}
