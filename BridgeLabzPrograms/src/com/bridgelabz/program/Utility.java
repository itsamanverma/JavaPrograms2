package com.bridgelabz.program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
/**
 * @author amanverma
 */
/******************************************************************************************************/
public class Utility 
{
	
	BufferedReader br;
	public Utility()//Create the Constructor to Provide Runtime Input
	{ 
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	/**
	 *take the user  string input
	 * @return string	
	 */
	/******************************************************************************************************/
	public String inputString() 
	{ 
		try
		{
		  return br.readLine();	
		}catch( Exception e)
		{
			System.out.println(e);
		}
		return"";
	}
	/**
	 * take the user Input Integer
	 * @return Integer
	 */
	/******************************************************************************************************/
	public int inputInteger() 
	{
		 try 
		 {
			return Integer.parseInt(br.readLine()); 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return 0;//Create the method To Calculate the triples
	}
	/**
	 * takes the user Inputs double
	 * @return 
	 * @return double
	 */
	 public double inputDouble()
		{
			try 
			{ 
			  return Double.parseDouble(br.readLine());	
			}catch(Exception e)
			{	
				System.out.println(e);
			}
			return 0.0;
		}
	    
		/**
		 * Create the Method To calculate the table of any number
		 * @param n shows the user given integer
		 */
	public void table(int n) 
	{
		System.out.println("Here the your table, you want");
		for(int i=1;i<=10;i++)
		{   
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	/**
	 * Create the Method to calculate the triples of integer in the given integer array
	 * @param ar shows the user given array
	 */
	public void triples(int[] ar) 
	{
		for(int i=1;i<ar.length-2;i++)
			 {
				for(int j=i+1;j<ar.length-1;j++)
				{
					for(int k=i+2;k<ar.length;k++)  
					{
						if(ar[i]+ar[j]+ar[k]==0)
						{
							System.out.print("The triple integer:"+ar[i]+" "+ar[j]+" "+ar[k]);
						}
						System.out.println();
					}
				}
			 }	
   	}
	/**
	 * Create the Method To Check String is Anagram Or Not
	 * @param st1 shows the users giver string
	 * @param st2 shows the users giver string
	 * @return boolean value in terms of true of false
	 */
	public boolean isAnagram(String st1, String st2) 
	{
		int c1[]=countOccurance(st1);
		int c2[]=countOccurance(st2);
		for(int i=0;i<c2.length;i++)
		{
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	/**
	 * create the method named as countOccurance to count the Occurance of each character in a given string  
	 * @param st shows the users giver string
	 * @return the integer array with no of Occurance of each character
	 */
	private int[] countOccurance(String st) 
	{
		int c[]= new int[26];
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90)
				c[ch-65]++;		
			if(ch>=97 && ch<=122)
				c[ch-97]++;
		}
		return c;
	}
	/**
	 * create the method named as permute to calculate the possible combinations of given string 
	 * @param st shows the users giver string
	 * @param l shows the zeroth index character 
	 * @param r shows the last index character 
	 */
   public static void permute(String st, int l, int r) 
   {
	   
	if(l==r) 
	System.out.println(st);
	else
	  {
		for(int i=l;i<=r;i++)
		{	
			st=swap(st,l,i);
			permute(st,l+1,r);
			st=swap(st,l,i);
		}
	  }		
   }
   /**
	 * create  the method named as swap to swap the character in the given string
	 * @param st shows the users giver string
	 * @param l shows the zeroth index character 
	 * @param i shows the same character 
	 * @return the string value nothing but swapped string
	 */
	private static String swap(String st, int l, int i) 
	{ int count=0;
		char temp;
		char[] chArr=st.toCharArray();
		temp=chArr[l];
		chArr[l]=chArr[i];
		chArr[i]=temp;
		return String.valueOf(chArr);
	}
	/**
	 * create the method for BinarySearch Algorithm
	 * @param str shows the array of String type
	 * @param st shows the particular string which user search
	 * @return index value of that particular string which nothing but integer value 
	 */
	public static int binarySearch(String[] str, String st) 
	{
		int l=0,r=str.length-1;
		while(l<=r)
		{                 // a,b,c,d
			int mid=l+(r-1)/2;
			int res=st.compareToIgnoreCase(str[mid]);
			if(res==0)
				return mid;
			if(res>0)
				l=mid+1;	
			else
				r=mid-1;	
		}
		return -1;	 
	}
	/**
	 * create the method for Insertion sorting Algorithm
	 * @param ch shows the array of Char type 
	 */
	public void insertionSort(char[] ch) 
	{
		for(int i=1;i<ch.length-1;i++)
		{		
			char ch1=ch[i];
			int j=i-1;
			while(j>=0 && ch1<ch[j])
			{
				ch[j+1]=ch[j];
				j--;
			}
			ch[j+1]=ch1;
	   	}
		System.out.println();
		System.out.println("String After the Insertion sort : ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	/**
	 * create the method for Insertion sorting Algorithm
	 * @param ar shows the array of Integer type 
	 */
	public static void insertionSort(int[] ar) 
	{
		for(int i=1;i<ar.length-1;i++)
		{
			int ele=ar[i];
			int j=i-1;
			while( j>=0 && ele<ar[j])	
			{
				ar[j+1]=ar[j];
				j--;		
			}
			ar[j+1]=ele;
		}
		System.out.println();
		System.out.println("Array After the Insertion Sort:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}
	/**
	 * create the method for bubble sorting Algorithm
	 * @param ar shows the array of Integer type 
	 */
	public static void bubbleSorting(int[] ar) 
	{
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++ )
			{
				if(ar[i]>ar[j])
				{
					int t=ar				[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}	
		System.out.println();
		System.out.println("Array after the Down Bubble Sort");
		for(int i=0;i<ar.length;i++)
		{
		System.out.print(ar[i]+" ");
		}
		
	}
	/**
	 * create the method for bubble sorting Algorithm
	 * @param ch shows the array of char type 
	 */
	public void bubbleDownSorting(char[] ch)
   {
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++ )
			{
				if(ch[i]>ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		} 
		System.out.println();
		System.out.println("Array after the Bubble Sort");
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]+" ");
		}
		
	}
	
	/**
	 * create the method to count the notes according to money enter by user
	 * @param st shows starting range of number
	 * @param end shows the ending range of number
	 * @return list<Integer> of prime number
	 */
	public static List<Integer> isPrime(int st, int end) 
	{
	     List<Integer> list = new ArrayList<Integer>();
	     int flag=0;
	     for(int i=st;i<=end;i++) 
	     {
	    	 for(int j=2;j<=st;j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 flag=0;
	    			 break;					
	    		 }
	    		 else
	    		 {
	    			 flag=1;		
	    		 }
	    	 if(flag==1)
	    	 {
	    		 list.add(i);
	    	 }
	     }
	 }
		return list;
	}
	
	/**
	 * create the method to check the number is prime or not
	 * @param i show the number enter by user
	 */
	public static boolean isPrime(int n) 
	{		
		for(int i = 2 ; i <= n/2 ; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}		
	/**
	 * create the method to count the notes according to money enter by user
	 * @param rupees shows money enter by user
	 */
	public static void countNotes(int rupees)  
	{											
 int ar[]= {1000,500,100,50,10,5,2,1};
		 int notes=0;	
		 for(int i=0;i<ar.length;i++)
		 {	
			 if(rupees/ar[i]>0)
			 {
				 System.out.println("No of Notes"+ar[i]+"is"+rupees/ar[i]);
				 notes=notes+rupees/ar[i];
				 rupees=rupees%ar[i];
			 }
		 }
		 System.out.println(" minimum number of Notes requires is"+notes);
		
	}
	/**
	 * create  the method to binary search for Integer
	 * @param ar shows the Array of Integer Taken by User
	 * @param low shows the zeroth index element of the Array 
	 * @param high  shows the last elements of The array 
	 * @param ele shows the Particular elements which we search 
	 * @return the index of the elements which we search
	 */
	
	public static int binarySearch(int[] ar, int low, int high, int ele) 
	{
		if(low>high)
           return -1;
		int mid =(low+high)/2;
		if(ar[mid]==ele)
			return mid;
		if(ar[mid]<ele)
			return binarySearch(ar,mid+1,high,ele);
		else
			return binarySearch(ar,low,mid-1,ele);
	}
	/**
	 * create  the method to generate the random coupon No
	 * @param noOfCoupon shows the No of Coupons required by users 
	 * @param random shows the random generate numbers
	 * @param countCoupons shows that the random coupon 
	 * @param ele shows the Particular elements which we search 
	 * @return the index of the elements which we search
	 */
	public static void coupon() 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the No of Coupon u want to genrate..!");
		int noOfCoupon=sc.nextInt();
		int random,countCoupons,countTotal=0;
		int coupons[]=new int[noOfCoupon];
		int ar[]=new int[noOfCoupon];
		for(int i=0;i<noOfCoupon;i++)
		{
			coupons[i]=(int)(Math.random()*(noOfCoupon+1));
			System.out.print(coupons[i]+" ");		
		}
		for(countCoupons=0;countCoupons<noOfCoupon;countTotal++)
		{
			random=(int)(Math.random()*(noOfCoupon+1));
			for(int i=0;i<noOfCoupon;i++)
			{
				if(coupons[i]==random && ar[i]==0)
				{
					ar[i]=1;
					countCoupons++;
				}
			}
		}
     	System.out.println("the no of times tired to get all the coupons is"+countTotal);
	}
	/**
	 * create  the method to check the Value at position
	 * @param tac shows 2D array in which comp or user enter the value 
	 * @param index shows that random position on the matrix
	 * @return the integer value at particular position
	 */
	public static int valueAtPosition(int[][] tac, int index) 
	{
		switch(index)
		{
		case 1:
			return tac[0][0];
		case 2:
			return tac[0][1];
		case 3:
			return tac[0][2];
		case 4:
			return tac[1][0];
		case 5:
			return tac[1][1];
		case 6:
			return tac[1][2];
		case 7:
			return tac[2][0];
		case 8:
			return tac[2][1];
		case 9:
			return tac[2][2];
		default:
			return 1;
		}
	}
	/**
	 * create  the method to enter the value at position by computer
	 * @param tac shows 2D array in which computer or user enter the value
	 * @param index shows the random position in the matrix
	 * @param num show that it comp chance or user chance 
	 * @return the 2D matrix with enter value on the positions
	 */
	public static int[][] enter(int[][] tac, int index, int num) 
	{
		switch(index)
		{
		case 1:
			tac[0][0]=num;
			return tac;

		case 2:
			tac[0][1]=num;
			return tac;

		case 3:
			tac[0][2]=num;
			return tac;

		case 4:
			tac[1][0]=num;
			return tac;

		case 5:
			tac[1][1]=num;
			return tac;

		case 6:
			tac[1][2]=num;
			return tac;

		case 7:
			tac[2][0]=num;
			return tac;

		case 8:
			tac[2][1]=num;
			return tac;

		case 9:
			tac[2][2]=num;
			return tac;
		}
		return tac;
	}
	/**
	 * create  the method to check that who won comp or user
	 * @param tac shows 2D array in which computer or user enter the value
	 * @param val show that it comp chance or user chance 
	 * @return the integer value which is show the comp won or user
	 */
	public static int checkIfWon(int[][] ar, int val) 
	{
	   int flag=0;
	   
	   if((ar[0][0]==val && (ar[0][1]==val && ar[0][2]==val) ||(ar[1][0]==val && ar[2][0]==val)))
		   flag=1;
	   else if((ar[1][1]==val && (ar[0][0]==val && ar[2][2]==val) ||(ar[0][2]==val && ar[2][0]==val)))
		   flag=1;
	   else if((ar[1][0]==val && ar[1][1]==val && ar[1][2]==val))
		   flag=1;
	   else if(ar[2][0]==val && ar[2][1]==val && ar[2][2]==val)
		   flag=1;
	   else if((ar[0][2]==val && ar[1][2]==val && ar[2][2]==val) || (ar[0][1]==val && ar[1][1]==val && ar[2][1]==val))
		   flag=1;
	   
	       return flag;
	}
	/**
	 * create  the method named as printGame who's show that the condition of won or loose  
	 * @param tac shows 2D array in which computer or user enter the value
	 */
	public static void printGame(int[][] tac) 
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(tac[i][j]==0)
					System.out.print("X");
				else if(tac[i][j]==1)
					System.out.print("O");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
	/**
	 * create  the method named as checkIfEnd who's shows that in these situation who is win comp or user
	 * @param tac shows 2D array in which computer or user enter the value
	 * @return 
	 */
	public static int checkIfEnd(int[][] tac) 
	{
		int i,j,won=1;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(tac[i][j]==0 || tac[i][j]==1)
				continue;
				else
				won=0;
			}
		}
		if(won==1)
			System.out.println("Game Over..!");
		return won;
	}
	
	/**
	 * create the method named gambler who start with $stake and place fair $1 bets until he/she goes broke or reach $goal  
	 * @param stake shows initial money at gambler
	 * @param goal shows if they achieve the target than gambler win
	 * @param games shows the no of games play to achieve the target or gaol.
	 */
	
	public static void gambler(int stake, int goal , int games)
	{
		int counter=0,win=0,bets=0;
		float n;
		while(counter<games && (stake>0 && stake<goal) ) 
		{
			bets++;
			n=(float) Math.random();
			if(n>0.5) 
			{
				stake++;
				win++;
				System.out.println(n+" win ");
			}
			else 
			{
				stake--;
				
				System.out.println(n+" loss ");

			}
			counter++;
		}
		System.out.println("The number of wins are: "+win+", percentage of wins: "+(win*100/(bets)+", bets: "+bets));			
	}
	/**
	 * create the method named isPrimeAnagram to print the anagram prime no by calculated prime number
	 * @param List<Integer> prime shows the list of prime no within the range
	 * @return pairs of anagram prime number in from of HashMap.
	 */
	public static HashMap<String,String> isPrimeAnagram(List<Integer> prime)
	{
		HashMap<String,String> primeAnagrams = new HashMap<String, String>();
		boolean anagram = false;
		for(int i = 0 ;i < prime.size() - 1; i++) {
			for(int j= i+1; j < prime.size(); j++) {
				Integer p1 = prime.get(i);
				Integer p2 = prime.get(j);
				anagram = Utility.checkAnagram(p1.toString(), p2.toString());
				if(anagram) {
					if(primeAnagrams.containsKey(p1))
					{
						String oldValue = primeAnagrams.get(p1);
						primeAnagrams.put(p1.toString(), oldValue+","+p2.toString());
					}
					else
						primeAnagrams.put(p1.toString(), p2.toString());
				}//end of anagram condition
			}
		}
		return primeAnagrams;
	}
	/**
	 * create the method named checkAnagram to check the Anagram Condition
	 * @param str1 shows the String taken by user
	 * @param str2 shows the String taken by user
	 * @return boolean value in terms of true or false.
	 */
	private static boolean checkAnagram(String str1, String str2) 
	{
		char[] str1ch = str1.toLowerCase().toCharArray();
		char[] str2ch = str2.toLowerCase().toCharArray();
		 
		Arrays.sort(str1ch);
		Arrays.sort(str2ch);
		
		str1 = new String(str1ch);
		str2 = new String(str2ch);
		
		return str1.equals(str2);
	}
	/**
	 * create the method named isNumber to validation check
	 * @param input shows the user input with validation.
	 * @return boolean value with true or false.
	 */
	public static boolean isNumber(String st) 
	{
		if(st.charAt(0)=='-' && st.charAt(0)=='+')
		{
			for(int i=0;i<st.length();i++)
				if(Character.isDigit(st.charAt(i))==false)
					return false;
			return true;
		}
		else 
		{
			for(int i=0;i<st.length();i++)
				if(Character.isDigit(st.charAt(i))==false)
					return false;
			return true;
		}
	}
	/**
	 * create the method named findNumber to find the user think No..
	 * @param no shows the number which is nothing but based on power of 2
	 */
	
	public static void findNumber() 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the no Which is Power Of 2..!");
		boolean flag=true;
		String input;
		int low,high,mid;
		System.out.println("Enter the no Which is Power Of 2..!");
		input =sc.next();
		while(flag)
		{
			if(Utility.isNumber(input))
			{
				flag=false;
			}
			else
			{
				System.out.println("Enter the correct type of Number no Which is Power Of 2..!");
				input=sc.next();
			}
		}
		int no=Integer.parseInt(input);
		//int no =sc.nextInt();
		int flag1=check2Power(no);
		while(flag1==0)
		{
			System.out.println("please!, Enter the no Which is a power Of @ only..! ");
			no=sc.nextInt();
			flag1=check2Power(no);
		}
		int ar[]= new int[no];
		for(int i=0;i<no-1;i++)
         ar[i]=i;
		low=0;
		high=no-1;
		
		for(;pw>0;pw--)
		{
			mid=(low+high)/2;
			
			System.out.println("Geuss..!,is the Number"+ar[mid]+"If yes type 'true' or if No type 'false'..!!");
			 if(sc.nextBoolean()==true)
			 {
				 System.out.println("!!..You Won..!!");
				 return;
			 }
			 else {
				 System.out.println("Geuss..! if the Number more than "+ar[mid]+ "If yes type 'true' or if No type 'false'..!!");
				 
				 if(sc.nextBoolean()==true)
					 low=mid+1;
				 else
					 high=mid;
			 }
		}
	}
	/**
	 * create the method named check2Power to check the user input is power of 2 or not...!
	 * @param no shows the number which is nothing but based on power of 2
	 */
	static int pw=1;
	private static int check2Power(int no) 
	{
		int flag=0;
		while(no%2==0)
		{
			if(no%2==0)
			{
				no=no/2;
				pw++;
				//System.out.println(pw);
			}
			if( no/2==1 && no%2==0)
			{
				flag=1;
				break;
			}
		}
		System.out.println("Power:"+pw);
		return flag;
	}
	/**
	 * create the method named windChill to calculate the effective temperature 
	 * @param temp shows the temperature t (in Fahrenheit);
	 * @param wc shows the wind speed v (in miles per hour)
	 * @return double value which is nothing but windChill tempareture..!
	 */
	public static double windChill(double temp, double windvelocity) 
	{
		double windChill=0.0;
		windChill= 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(windvelocity, 0.16);
		return windChill;
	}
	/**
	 * create the method named searchWordInList to read the string  from file And search particular word..!
	 * @throws IOException 
	 */
	public static void searchWordInList() throws IOException 
	{
		int noOfWord,j,k,count=0,t=0;
		String st;
		
//		FileWriter fw = new FileWriter("wordList.txt");
//		
//		System.out.println("Please.!,Enter the Number Of Words You Wish to Add to file Named as wordList.txt");
//		Scanner sc = new Scanner(System.in);
//		noOfWord=sc.nextInt();
//		System.out.println("Enter the Words ...!!");
//		
//		for(j=0;j<noOfWord;j++)
//		{
//			st=sc.next();
//			fw.write(st);
//			if(j<noOfWord-1)
//			fw.write(',');//add or separate the word by comma.!	
//		}
//		System.out.println(" Words Added Successfully..!! ");
//		fw.close();
		
		
	}
	/**
	 * create the method named printStringArray to print the list of words 
	 * @param wordList shows the List of string present in the particular file..  
	 */
	public static void printStringArray(String[] wordList) 
	{
		for (String i : wordList) 
		{
			System.out.print("\t"+i);
		}
		System.out.println();

	}
	/**
	 * create the method named searchWordInList to read the string  from file And search particular word..!
	 * @throws IOException 
	 */
	public static String getString() 
	{
		Scanner sc = new Scanner(System.in);
	    String st =sc.next();
	    while(st.trim().equals(" ")||st==null)
	    {
	    	System.out.println("Enter the valid String..!");
	    	st=sc.next();
	    }
		return st;
	}
}
