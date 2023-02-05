package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class keyBoardrows {
	/*
	 * 500. Keyboard Row
	 * 
	 * Given an array of strings words, return the words that can be typed using
	 * letters of the alphabet on only one row of American keyboard like the image
	 * below.
	 * 
	 * In the American keyboard:
	 * 
	 * the first row consists of the characters "qwertyuiop", the second row
	 * consists of the characters "asdfghjkl", and the third row consists of the
	 * characters "zxcvbnm".
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: words = ["Hello","Alaska","Dad","Peace"] Output: ["Alaska","Dad"]
	 * Example 2:
	 * 
	 * Input: words = ["omk"] Output: [] Example 3:
	 * 
	 * Input: words = ["adsdf","sfd"] Output: ["adsdf","sfd"]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= words.length <= 20 1 <= words[i].length <= 100 words[i] consists of
	 * English letters (both lowercase and uppercase).
	 */

	@Test
	public void positive() {
		//Positive Test Data
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] output = {"Alaska","Dad"};
		System.out.println(Arrays.toString(findWords(words)));
	}
	//
	//	@Test
	//	public void positive2() {
	//		//Positive Test Data
	//		String[] words = {"adsdf","sfd"};
	//		String[] output = {"adsdf","sfd"};
	//		Assert.assertTrue(Arrays.equals(findWords(words), output));
	//	}
	//
	//	@Test
	//	public void negative() {
	//		//Negative Case Test Data
	//		String[] words = {"Hello"};
	//		String[] output = {};
	//		Assert.assertTrue(Arrays.equals(findWords(words), output));
	//	}
	//
	//	@Test
	//	public void edge() {
	//		//Edge Test Data
	//		String[] words = {"A"};
	//		String[] output = {"A"};
	//		Assert.assertTrue(Arrays.equals(findWords(words), output));
	//	}
	public String[] findWords(String[] words) 
	{ 
		String s1="qwertyuiopQWERTYUIOP";

		String s2="asdfghjklASDFGHJKL";
		String s3="zxcvbnmZXCVBNM";
		
		List<String> lst= new ArrayList<>();


		for(int i=0;i<words.length;i++)
		{	

			String word=words[i]; 
			int s1count=0;
			int s2count=0;
			int s3count=0;

			for (int j=0;j<word.length();j++)
			{
				char ch=word.charAt(j);
				
				if(s1.contains(ch+""))s1count++;

				if(s2.contains(ch+""))s2count++;

				if(s3.contains(ch+""))s3count++;

				if(s1count==word.length() || s2count==word.length() || s3count==word.length())
				{
					lst.add(word);
				}

			}
			
		}
		return	lst.toArray(new String[0]);
	}}
