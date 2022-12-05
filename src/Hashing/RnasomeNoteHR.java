package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class RnasomeNoteHR {

	/*
	 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will
	 * be traced back to him through his handwriting. He found a magazine and wants
	 * to know if he can cut out whole words from it and use them to create an
	 * untraceable replica of his ransom note. The words in his note are
	 * case-sensitive and he must use only whole words available in the magazine. He
	 * cannot use substrings or concatenation to create the words he needs.
	 * 
	 * Given the words in the magazine and the words in the ransom note, print Yes
	 * if he can replicate his ransom note exactly using whole words from the
	 * magazine; otherwise, print No.
	 * 
	 * Example = "attack at dawn" = "Attack at dawn"
	 * 
	 * The magazine has all the right words, but there is a case mismatch. The
	 * answer is .
	 * 
	 * Function Description
	 * 
	 * Complete the checkMagazine function in the editor below. It must print if the
	 * note can be formed using the magazine, or .
	 * 
	 * checkMagazine has the following parameters:
	 * 
	 * string magazine[m]: the words in the magazine string note[n]: the words in
	 * the ransom note Prints
	 * 
	 * string: either or , no return value is expected Input Format
	 * 
	 * The first line contains two space-separated integers, and , the numbers of
	 * words in the and the , respectively. The second line contains space-separated
	 * strings, each . The third line contains space-separated strings, each .
	 * 
	 * Constraints
	 * 
	 * . Each word consists of English alphabetic letters (i.e., to and to ). Sample
	 * Input 0
	 * 
	 * 6 4 give me one grand today night give one grand today Sample Output 0
	 * 
	 * Yes Sample Input 1
	 * 
	 * 6 5 two times three is not four two times two is four Sample Output 1
	 * 
	 * No Explanation 1
	 * 
	 * 'two' only occurs once in the magazine.
	 * 
	 * Sample Input 2
	 * 
	 * 7 4 ive got a lovely bunch of coconuts ive got some coconuts Sample Output 2
	 * 
	 * No Explanation 2
	 * 
	 * Harold's magazine is missing the word .
	 */
	
	//https://www.hackerrank.com/challenges/ctci-ransom-note/problem
	
	@Test
	public void example()
	{
		String magazinestr ="give me one grand today night";

		List<String> magazine=Arrays.asList(magazinestr.split(" "));
		String notestr = "give one grand today";
		List<String> note=Arrays.asList(notestr.split(" "));

	    checkMagazine(magazine,note); //YES
	}
		@Test
		public void example2()
		{
			String magazinestr ="two times three is not four";
			List<String> magazine=Arrays.asList(magazinestr);
			String notestr = "two times two is four";
			List<String> note=Arrays.asList(notestr);
	
			checkMagazine(magazine,note); //NO
		}
		@Test
		public void example3()
		{
			String magazinestr ="ive got a lovely bunch of coconuts";
			List<String> magazine=Arrays.asList(magazinestr);
			String notestr = "ive got some coconuts";	
			List<String> note=Arrays.asList(notestr);
	
			checkMagazine(magazine,note); //NO
		}

	public static void checkMagazine(List<String> magazine, List<String> note) 
	{
		boolean flag =true;

		magazine.size();
		

		for(String s : note)
		{
			
			if(magazine.contains(s)) 
			{
				magazine.remove(s);
				note.remove(s);
				flag =true;
			}
			else 
			{
				flag=false;
				break;
			}
		}
		if(!flag) 
		{
			System.out.println("NO");
		}
		else
		{
		System.out.println("YES");
		}
	}
	}

