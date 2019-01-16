/*
Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/
package com.bridgelabz.program;
public class Distance 
{
public static void main(String[] args) 
  {
	//Take input From Command Line arguments//
    int x  = Integer.parseInt(args[0]);    
    int y  = Integer.parseInt(args[1]); 
    //math classinbiuld method calling//
    double dist = Math.sqrt(x*x + y*y);
    
    System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    
  }
}
