package slidingwindow;

import java.util.ArrayList;

import org.junit.Test;

public class MaxvowelsinSubstring 
{
	/*
	 * 1456. Maximum Number of Vowels in a Substring of Given Length
	 * 
	 * Given a string s and an integer k, return the maximum number of vowel letters
	 * in any substring of s with length k.
	 * 
	 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abciiidef", k = 3 Output: 3 Explanation: The substring "iii"
	 * contains 3 vowel letters. Example 2:
	 * 
	 * Input: s = "aeiou", k = 2 Output: 2 Explanation: Any substring of length 2
	 * contains 2 vowels. Example 3:
	 * 
	 * Input: s = "leetcode", k = 3 Output: 2 Explanation: "lee", "eet" and "ode"
	 * contain 2 vowels.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 105 s consists of lowercase English letters. 1 <= k <=
	 * s.length
	 */
	@Test
	public void example()
	{
		String s="abciiidef";
		int k=3;
		maxVowels(s,k);
	}
	public void example2()
	{
		String s="aeiou";
		int k=2;
	}
	public void example3()
	{
		String s="leetcode";
		int k=3;
	}
	 public int maxVowels(String s, int k) {
		    
	        int max=Integer.MIN_VALUE;
	        int count=0;
	        
	        ArrayList<Character> al =new ArrayList<>();

	         al.add('a');
	         al.add('e');
	         al.add('i');
	         al.add('o');
	         al.add('u');

	         int left=0,right=0;
	         char[] sArray =s.toCharArray();
	      
	while(right<sArray.length)
	{
	    char c=sArray[right++];
	    if(al.contains(c))
	    {
	    count++;
	    }
	    if(right-left==k)
	    {
	       char cl=sArray[left];
	        if(al.contains(cl))
	        {        
	                count--;
	        }
	        left++;
	    }
	    max =Math.max(max,count);
	}
	          
	       return max; 
	    }

}
