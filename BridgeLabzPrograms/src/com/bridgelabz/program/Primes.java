/*Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that range.*/
package com.bridgelabz.program;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Primes 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);//create the scanner class to take user inputs
	System.out.println("Enter the range of number in which we have to calculate the Prime Number:");
	int range=sc.nextInt();
	
	List<Integer> prime = new ArrayList<Integer>();//Create the list to stored the prime within the range
	prime.add(2);//since 2 is the first prime number 
	
	for(int i=3;i<range;i=i+2)
	{
		if(Utility.isPrime(i))
			prime.add(i);
	}
	
	System.out.println("Enter the List of prime number:");
	for (Integer r : prime) 
	{
	    System.out.print(r+" ");//print the prime number	
	}
    // finding all the prime number which are anagram...
    
	HashMap<String,String> primeAnagram = Utility.isPrimeAnagram(prime);
	
	
 }
}
