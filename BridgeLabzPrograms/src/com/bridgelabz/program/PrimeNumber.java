/*Take a range of 0 ­to 1000 Numbers and find the Prime numbers in that range.*/
package com.bridgelabz.program;
import java.util.ArrayList;
import java.util.List;
public class PrimeNumber 
{
public static void main(String[] args) 
    {
	  //we simply take two variables named as start and end to show the range;
	   int start=0;
	   int end=1000;
	  
    	List<Integer> list	=new ArrayList<Integer>();//create List of Integer generic type to get the  list of number 
	    list = Utility.isPrime(start, end);     //call the method from Utility class 
	
	    List<String> list1=new ArrayList<String>();//create List of String generic type to get the  list of Prime number
    	for (int i : list) 
 	    {
		   list1.add(String.valueOf(i));
	    }
    	System.out.println(list1);
     }
}
