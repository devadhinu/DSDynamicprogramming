package slidingwindow;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Substringofsize3withdistinctchars 
{

	/*
	 * 1876. Substrings of Size Three with Distinct Characters
	 * 
	 * A string is good if there are no repeated characters.
	 * 
	 * Given a string s​​​​​, return the number of good substrings of length three
	 * in s​​​​​​.
	 * 
	 * Note that if there are multiple occurrences of the same substring, every
	 * occurrence should be counted.
	 * 
	 * A substring is a contiguous sequence of characters in a string.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "xyzzaz" Output: 1 Explanation: There are 4 substrings of size 3:
	 * "xyz", "yzz", "zza", and "zaz". The only good substring of length 3 is "xyz".
	 * Example 2:
	 * 
	 * Input: s = "aababcabc" Output: 4 Explanation: There are 7 substrings of size
	 * 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc". The good substrings
	 * are "abc", "bca", "cab", and "abc".
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 100 s​​​​​​ consists of lowercase English letters.
	 */

	//05.03
	//05:13 started
	//05:17 done with pseudocode

	
	//@Test
	public void example1()
	{
		String s="xyzzaz";
		// o/p: 1
		System.out.println(countGoodSubstrings(s) );
	}
    @Test
	public void example2()
	{
		String s="aababcabc";
		System.out.println(countGoodSubstrings(s) );
		// o/p: 4
	}
	public void example3()
	{
		String s="aaaaaaaaaaaaa";
		System.out.println(countGoodSubstrings(s) );
		// o/p: 4
	}


	//	Pseudocode:
	//	  1)Create a hashset an add the characters into it.
	//    2)Then clear the hashset once the window size is reached and 
	//    3)take the count as 1 if hash set size is 3
	//	  4)


	public int countGoodSubstrings(String s) 
	{
		int left=0,right=0;
		int k=3;

		int count=0;
		Set<Character> hs = new HashSet<>();

		while(right<s.length())
		{
			 if(right<k)
			 {
				 hs.add(s.charAt(right));
				 right++;
			 }
			 else if(right==k)
			 {
				 if(hs.size()==k)count=1;
			 }			
				 
		}
		return count;


	}

}
