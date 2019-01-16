/*
2D Array
a.Desc ­> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b.I/P ­> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c.Logic ­> create 2 dimensional array in memory to read in M rows and N cols
d. O/P ­> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.*/
package com.bridgelabz.program;
import java.io.PrintWriter;
public class Array 
{
   public static void main(String[] args) 
   {
	  Utility u = new Utility();
	  System.out.println("Enter the number of rows: ");
	  int m=u.inputInteger();
	  System.out.println("Enter the number of Colume: ");
	  int n=u.inputInteger();
	  
	       //calling the methods
	       int[][] a  = arrayInt(m,n);
		double[][] b  = arrayDouble(m,n);
		String[][] c  = arrayBoolean(m,n);
		
	    //display method
		display(a,b,c,m,n);
   }
   
private static int[][] arrayInt(int m, int n) 
   {
	//creating a new Array And provide the Allocation 
   	int a[][]= new int[m][n];
   	Utility u = new Utility();
   	System.out.println("Integer Array: ");
   	for(int i=0;i<m;i++)
   	{
   		for(int j=0;j<n;j++)
   		{
   			a[i][j]=u.inputInteger();//calling the method to take Integer  as a Input
   		}
   	}
   	return a;
   }
private static double[][] arrayDouble(int m, int n) 
{
	//Creating the New Array And Provide the Allocation
	double b[][]=new double[m][n];
	Utility u = new Utility();
	System.out.println("Double Array:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			b[i][j]=u.inputDouble();//calling the Method to take Double as a input
		}
	}
	return b;
}
private static String[][] arrayBoolean(int m, int n)
{
	//create the 
	String c[][]=new String[m][n];
	Utility u = new Utility();
	System.out.println("String Array: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			c[i][j]=u.inputString();
		}
	}
	return c;
}
 
private static void display(int[][] a, double[][] b, String[][] c, int m, int n) 
{
	//Data to write on Console using PrintWriter  
	PrintWriter pw=new PrintWriter(System.out,true);
	
	//display Integer
	System.out.println();
	pw.println("2D Array Integer: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			//Data to write in File using PrintWriter  
			pw.print("\t"+a[i][j]+" ");
		}
		pw.println("\t");
	}
	
	//display Double
	System.out.println();
	pw.println("2D Array Double: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			////Data to write in File using PrintWriter  
			pw.print("\t"+b[i][j]+" ");
		}
		pw.println("\t");
	}
	
	//display String
	System.out.println();
	pw.println("2D Array String:");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			//Data to write in File using PrintWriter  
			pw.print("\t"+c[i][j]+"");
		}
		pw.print("\t");
	}
 }
}
