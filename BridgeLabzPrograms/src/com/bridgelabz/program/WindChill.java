/*Write a program WindChill.java that takes two double command­line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to
be:
Note : the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).*/
package com.bridgelabz.program;

public class WindChill
{
	public static void main(String[] args) 
	{
		if(args.length<2)
		{
			System.out.println("Please.! Enter the atleast 2 arguments ..!");
		}
		else 
		{
			double temp;
			double wc;
			try {
				temp=Double.parseDouble(args[0]);
				  wc=Double.parseDouble(args[1]);
				
			      double windchill= Utility.windChill(temp,wc);
			    }catch(Exception e)//NumberFormatException
			         {
				      System.out.println("Enter the Two number as Inputs:"+e.getMessage());
			         }
		 }
	   	
	}

}
