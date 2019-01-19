/*Binary Search the Word from Word List
a. Desc ­> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P ­> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic ­> Use Arrays to sort the word list and then do the binary search
d. O/P ­> Print the result if the word is found or not*/
package com.bridgelabz.program;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileIntoList 
{
	public static void main(String[] args) throws IOException 
	{
		
	
//   public static List<String> readFileInList(String file)
//   {
//	   List<String> lines=Collections.emptyList();
//	   try {
//		   lines =Files.readAllLines(Paths.get(file),StandardCharsets.UTF_8);
//	   }catch(IOException e)
//	   {
//		   e.printStackTrace();
//	   }
//	return lines;
//   }
//   public static void main(String[] args) 
//   {
//	  List l= readFileInList("wordList.txt");
//	  Iterator<String> itr = l.iterator();
//	  while(itr.hasNext())
//	  System.out.println(itr.next());
//   }
//  
//   public static void main(String[] args) throws Exception 
//   {
//	File file = new File("wordList.txt");
//	
//	BufferedReader br = new BufferedReader(new FileReader(file));
//	int i=0;
//	String st;
//	while((st=br.readLine())!=null)
//	{   if(i<st.length())
//		System.out.println(st+" ,");
//	    else
	    	//System.out.println(st);
	//}
   //}
	 Utility.searchWordInList();
	
	}
}
