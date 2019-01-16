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
public class Gambler 
{
	    public static void main(String[] args) 
	    {
	    	//Take input From Command Line arguments//
	        int stake  = Integer.parseInt(args[0]);    // gambler's stating bank roll
	        int goal   = Integer.parseInt(args[1]);    // gambler's desired bank roll
	        int games  = Integer.parseInt(args[2]);    // number of trials to perform

	        int bets = 0;        // total number of bets made
	        int wins = 0;        // total number of games won

	        // repeat games times
	        for (int t = 0; t < games; t++) 
	        {
	            // do one gambler's ruin simulation
	            int cash = stake;
	            while (cash > 0 && cash < goal) 
	            {
	                bets++;
	                if (Math.random() < 0.5) 
	                	cash++;     // win $1
	                else                     
	                	cash--;     // lose $1
	            }
	            if (cash == goal) 
	            	wins++;      // did gambler go achieve desired goal?
	        }
	        // print results
	        System.out.println(wins + " wins of " + games);
	        System.out.println("Percent of games won = " + 100.0 * wins / games);
	        System.out.println("Avg # bets= " + 1.0 * bets / games);
	    }
}
