package com.bridgelabz.program;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
	 * @return double
	 */
	/******************************************************************************************************/
//	public double inputDouble() 
//	{
//		try 
//		{ 
//		  return Double.parseDouble(br.readLine());	
//		}catch(Exception e)
//		{	
//			System.out.println(e);
//		}
//		return 0.0;
//	}
	    
	//Create the Method To Calculate the Power Of Any Number//
	public void table(int n) 
	{
		System.out.println("Here the your table, you want");
		for(int i=1;i<=10;i++)
		{   
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	//create the method To Calculate  the Triples OF Integer;
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
	 * @param st1
	 * @param st2
	 * @return boolean
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
	
	//Create the Method To Count the Occurances OF Character//
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
	//create the method to find the possible permutation//
   public void permute(String st, int l, int r) 
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
	//Create the Method of Swap//
	private String swap(String st, int l, int i) 
	{
		char temp;
		char[] chArr=st.toCharArray();
		temp=chArr[l];
		chArr[l]=chArr[i];
		chArr[i]=temp;
		return String.valueOf(chArr);
		
	}
	//create the method to Searching
	public int binarySearch(String[] str, String st) 
	{
		int l=0,r=str.length-1;
		while(l<=r)
		{
			int mid=l+(r-1)/2;
			int res=st.compareToIgnoreCase(str[mid]);
			if(res==0)
				return mid;
			if(res>0)
				l=mid+l;	
			else
				l=mid-l;	
		}
		return -1;	 
	}
	//Create the method for insertionSort for String
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
	//Create the method For Insertion Sort For Integer
	public void insertionSort(int[] ar) 
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
	//create the method for bubble sort for Integer
	public void bubbleSorting(int[] ar) 
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
	//create the method for bubble sort For String//
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
		System.out.println("Array after the D		own Bubble Sort");
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]+" ");
		}
		
	}
	
	//create the method to check the prime number
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
//create the method to prime no
	public boolean isPrime(int i) 
	{
		int r=2;
		while(r<i/2)
		{
			if(i%r==0)
				return false;
		}
		return true;		
	}		
	//create the method
	public static void currency(int rupee)  
	{											
 int ar[]= {1000,500,100,50,10,5,2,1};
		 int notes=0;	
		 for(int i=0;i<ar.length;i++)
		 {	
			 if(rupee/ar[i]>0)
			 {
				 System.out.println("No of Notes"+ar[i]+"is"+rupee/ar[i]);
				 notes=notes+rupee/ar[i];
				 rupee=rupee%ar[i];
			 }
			 System.out.println("");
		 }
		
	}
}
