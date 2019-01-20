/*Take燼爎ange爋f񁔹000燦umbers燼nd爁ind爐he燩rime no in that range */
package com.bridgelabz.program;
import java.util.Scanner;
public class PrimeNo 
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	  boolean flag=true;
      String input;//make the stake input validate format
      System.out.println("Enter the Range of Number..!");
	  input=sc.next();
	  while(flag)
	  {
		 if(Utility.isNumber(input)) 
		 {
			flag=false;
		 }else 
		 {
			 System.out.println("Enter the Corrent Range of Number..!");
			 input=sc.next();
		 }
	  }
      int range=Integer.parseInt(input);
		  //int range=sc.nextInt();
		  System.out.print("List of prime no:");
		  for(int i=2;i<range;i++)
		  {
			 boolean rs = Utility.isPrime(i);
			 if(rs)
				 System.out.print(i+" ");
	  }
	  
  }
}
