/*
Cross Game or Tic­Tac­Toe Game
a.Desc ­> Write a Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is
the Computer and the Player 2 is the user. Player 1 take Random Cell that is the
Column and Row.
b. I/P ­> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
c. Logic ­> The User or the Computer can only take the unoccupied cell. The Game
is played till either wins or till draw...
d. O/P ­> Print the Col and the Cell after every step.
e. Hint ­> The Hints is provided in the Logic. Use Functions for the Logic…*/
package com.bridgelabz.program;

import java.util.Random;
import java.util.Scanner;

public class TicTacTao 
{
/**@author amanverma
 *  Design the tic-tac-tao game
 * @param args
 */
public static void main(String[] args)
   
   {
      int tac[][]=new int[3][3];
	  for(int i=0;i<3;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  	tac[i][j]=2;//initially the matrix named as tac fill with 2;
		  }
	  }
	  System.out.println("Your position are marked X");
	  int val,index,flag=0;
	  Random rc=new Random();//create the Random class to generate the random number
	  int random;
	  
	  for(int i=0;i<10;i++)
	  {   random=rc.nextInt(10);//generate random number between 0 to 9. 
		  index=random;
		  //System.out.println(index);
		  val=Utility.valueAtPosition(tac,index);
		  //System.out.println(val);
		  while(val==0 || val==1)//check the condition at position value is present or not
		  {
			  index=rc.nextInt(10);// if that position value present that generate random number between 0 to 9.
			  val=Utility.valueAtPosition(tac,index);
		  }
		  System.out.println("Computer chance ");//enter the matrix in case of comp chance;
		  
		  tac=Utility.enter(tac,index,1);
		  flag=Utility.checkIfWon(tac,1);//check the in this situation whom won comp or user
		  if(flag==1)
		  {
			  System.out.println("You loose..!");
			  Utility.printGame(tac);//print the matrix with that situation
			  return;
		  }
		  Utility.checkIfEnd(tac);//check that if their game is over or not
		  Utility.printGame(tac);//print the games
		  System.out.println("Enter the No From 1-9 which you would like to place...!!");
		  Scanner sc= new Scanner(System.in);
		  String input; 
			do {
				 System.out.println("Enter the User input.. !!");
				input = sc.next();
			}while(!Utility.isNumber(input));
			index=Integer.parseInt(input);
		  //index=sc.nextInt();
		  val=Utility.valueAtPosition(tac, index);
		  while(val==0 || val==1)//check the condition at position value is present or not
		  {
			  System.out.println("The place is already marked enter the Number..!");
			  sc=new Scanner(System.in);
			  do {
					 //System.out.println("Enter the User input.. !!");
					input = sc.next();
				}while(!Utility.isNumber(input));
				index=Integer.parseInt(input);
			  //index=sc.nextInt();
			  val=Utility.valueAtPosition(tac, index);
		  }
		  tac=Utility.enter(tac, index, 0);
		  Utility.printGame(tac);//print the game
		  flag=Utility.checkIfWon(tac, 0);
		  if(flag==1)
		  {
			  System.out.println("You Won..!");
			  Utility.printGame(tac);
			  return;
		  }
		  flag=Utility.checkIfEnd(tac);
		  if(flag==1)
		  {
			  Utility.printGame(tac);
			  return;
		  }
	  }
   }
}
