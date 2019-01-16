/*
Harmonic Number
a.Desc ­> Prints the Nth Harmonic number: 1/1 + 1/2 + ... + 1/N
(http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
b. I/P ­> The Harmonic Value N. Ensure N != 0
c. Logic ­> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P ­> Print the Nth Harmonic Value*/
package com.bridgelabz.program;
import java.util.Scanner;
public class HarmonicSeries 
{
	public static void main(String... a)
    {   
        System.out.print("Enter any number : ");
        //create the Scanner class to take User Input
        Scanner s = new Scanner(System.in);
        //Read the Number From User..
        int num = s.nextInt();
        System.out.print("The Harmonic Series is: ");
        double result = 0.0;
        //Computation//
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+result);
    }
	   
}
