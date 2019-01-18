/*
Gambler
a.Desc ­> Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out.
b. I/P ­> $Stake, $Goal and Number of times
c. Logic ­> Play till the gambler is broke or has won
d. O/P ­> Print Number of Wins and Percentage of Win and Loss.
*/
package com.bridgelabz.program;
import java.util.Scanner;
public class G
{
public static void main(String[] args) 
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Welcome in the world of Gambling...!!");
	 
	      boolean flag=true;
	      String input;//make the stake input validate format
	      System.out.println("Enter the Stake amount:");
		  input=sc.next();
		  while(flag)
		  {
			 if(Utility.isNumber(input)) 
			 {
				flag=false;
			 }else 
			 {
				System.out.println("Enter the correct Stake amount:");
				input=sc.next();
			 }
		  }
	      int stake=Integer.parseInt(input);
	
       	String input1;//make the goal input validate format
		System.out.println("Enter the goal decided by broker..!!");
		input1=sc.next();
	    while(flag)
	    {
	    	if(Utility.isNumber(input1))
	    	{
	    		flag=false;
	    	}else
	    	{
	    		System.out.println("Enter the Correct goal decided by broker..!!");
	    		input1=sc.next();
	    	}
	    }
        int goal=Integer.parseInt(input1);
	
	   String input2;
	   System.out.println("Enter the no Of games decided by broker..!!");
	   input2=sc.next();
	   while(flag)
	   {
		   if(Utility.isNumber(input2))
		   {
			   flag=false;
		   }else
		   {
			   System.out.println("Enter the correct No Of games decided by broker..!");
			   input2=sc.nextLine();
		   }
	   }
	   int games=Integer.parseInt(input2);
	   
       Utility.gambler(stake,goal,games);//calling the method
    } 
  }
