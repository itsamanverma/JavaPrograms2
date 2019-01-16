/*
Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can  be  found  using  a  formula
delta  =  b*b  ­  4*a*c
Root  1  of  x  =  (­b  +  sqrt(delta))/(2*a)
Root  2  of  x  =  (­b  ­-  sqrt(delta))/(2*a)
Take  a,  b  and  c  as  input  values  to  find  the  roots  of  x.
*/
package com.bridgelabz.program;
import java.util.Scanner;
public class QuadraticRoot 
{
 public static void main(String[] args) 
 { 
   Scanner sc = new Scanner(System.in);//create the Scanner class object to take user inputs
   System.out.println("Enter the Coecient value of X^2 of Quadratic Equation..");
   double a=sc.nextDouble();
   System.out.println("Enter the Coecient value of X^1 of Quadratic Equation..");
   double b=sc.nextDouble();
   System.out.println("Enter the Coecient value of X^0 Quadratic Equation..");
   double c=sc.nextDouble();
   double root1,root2;//take a two variable named as root1 & root2 to stored the roots of equations.
   double delta=b*b-4*a*c;
   if(delta>0)//condition checking real & distinct roots
   {
	   root1= (-b+Math.sqrt(delta)/(2*a));
	   root2= (-b-Math.sqrt(delta)/(2*a));
	   System.out.printf("root1 = %.2f & root2 = %.2f",root1,root2);
   }
   else if(delta==0)//condition checking for Real & equal roots
   {
	   root1=root2=(-b/(2*a));
	   System.out.format("root1 = root2 = %.2f",root1);
   }
   else
   {
	  double realPart = -b/(2*a);
	  double imaginaryPart = Math.sqrt(delta)/(2*a);
	  System.out.format("root1 = %.2f+%.2f & root2 = %.2f-%.2f",realPart,imaginaryPart,realPart,imaginaryPart);
   }
   
 }      
}
