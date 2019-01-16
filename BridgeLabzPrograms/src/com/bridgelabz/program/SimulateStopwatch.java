/* 
Simulate Stopwatch Program
a.Desc ­> Write a Stopwatch Program for measuring the time that elapses between
 the start and end clicks
b.I/P ­> Start the Stopwatch and End the Stopwatch
c.Logic ­> Measure the elapsed time between start and end
d.O/P ­> Print the elapsed time.
*/
package com.bridgelabz.program;
public class SimulateStopwatch 
{
   public long startT=0;
   public long stopT=0;
   public long elapsed;
   //create the method to show the start time of stopwatch
   public void start()
   {
	   startT=System.currentTimeMillis();
	   System.out.println("start timer is:"+ startT);
   }
   //create the method to show the stop time of stopwatch
   public void stop()
   {
	   stopT=System.currentTimeMillis();
	   System.out.println(" Stop timer is:"+ stopT);
   }
   //create the method to calculate the elapsed time 
   public long getElapsedTime()
   {
	   elapsed=stopT-startT;
	   return elapsed;
   }
   
   public static void main(String[] args) 
   {
	 //Create the object of Stopwatch to access the methods & the variables ...
	 SimulateStopwatch ssw=new SimulateStopwatch();
	 Utility u =new Utility();
	 System.out.println(" Press 1 to get the starttime of Stopwatch..");
	 u.inputInteger();
	 ssw.start();
	 
	 System.out.println(" Press 2 to get the stoptime of Stopwatch..");
	 u.inputInteger();
	 ssw.stop();
	 //calling the elapsed method 
	 long l=ssw.getElapsedTime();
	 System.out.println("Total time elapsed in millisec is"+1 );
	 System.out.println();
	 System.out.println("Total time elasped in seconds is"+(1/1000)+"sec");
   }
}
