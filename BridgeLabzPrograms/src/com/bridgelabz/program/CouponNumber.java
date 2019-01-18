/*
Coupon Numbers
a.Desc ­> Given N distinct Coupon Numbers, how many random numbers do you
need to generate distinct coupon number? This program simulates this random
process.
b.I/P ­> N Distinct Coupon Number
c.Logic ­> repeatedly choose a random number and check whether it's a new one.
d.O/P ­> total random number needed to have all distinct numbers.
e.Functions => Write Class Static Functions to generate random number and to
process distinct coupons.
*/
package com.bridgelabz.program;
import java.util.Scanner;
public class CouponNumber 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the No Of Coupon do you required:");
	   int noOfCoupon=sc.nextInt();
	   char[] ch="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	   int max=1000000;
	   for(int i=0;i<noOfCoupon;i++)
	   {
	   int random=(int)(Math.random()*max);
	   System.out.println(random);
	   //create the StringBuffer object because we need modifiable String objects.
	   StringBuffer sb= new StringBuffer();
	   
	   
	   //Computation
	   //while(random>0)
	   {
		 //the specified argument string representation at the end of the existing StringBuffer
		sb.append(ch[random % ch.length]);// generate alphanumeric random string generation
		random /=ch.length;//
	   }
	   
	   String couponCode=sb.toString();
	   System.out.println("Coupon code: "+ couponCode);  
	}
	}
}
