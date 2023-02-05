package slidingwindow;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


import org.junit.Test;

public class FindAllAnagramsinaString {

	/*
	 * Given two strings s and p, return an array of all the start indices of p's
	 * anagrams in s. You may return the answer in any order.
	 * 
	 * An Anagram is a word or phrase formed by rearranging the letters of a
	 * different word or phrase, typically using all the original letters exactly
	 * once.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "cbaebabacd", p = "abc" 
	 * Output: [0,6]
	 * Explanation: The substring
	 * with start index = 0 is "cba", which is an anagram of "abc". The substring
	 * with start index = 6 is "bac", which is an anagram of "abc". Example 2:
	 * 
	 * Input: s = "abab", p = "ab" 
	 * Output: [0,1,2] 
	 * Explanation: The substring with
	 * start index = 0 is "ab", which is an anagram of "ab". The substring with
	 * start index = 1 is "ba", which is an anagram of "ab". The substring with
	 * start index = 2 is "ab", which is an anagram of "ab".
	 * 
	 * 
	 * 
	 * 1 <= s.length, p.length <= 3 * 104
       s and p consist of lowercase English letters.
	 */
	@Test
	public void example()
	{
		String s ="cbaebabacd";
		String p ="abc";

		System.out.println(findAllanagrams(s,p));
		findAllanagrams(s,p);
	}

	/*
	 * Pseudocode :
	 * 
	 * 1)Create two array for two string value 
	 * 2)Use a for loop to store the values in the p array 
	 * 3)Take two pointers to move from one window to other window to
	 * compare the p string 
	 * 4)Store the alpahabet position with numericals in the sarray and compare that with parray
	 * 5)If the string matches , store the left position of sarray in the list that will be the index
	 *   of the first anagram string
	 * 6)Reduce the left index value in the sarray by sArray[s.charAt(left)-'a']--;
	 * 7)Increment the values in the right and reduce in the left
	 * 8)Once the string reaches the parray size ,repeat the sliding window technique and match both sarray
	 *   values (with parray window size) with parray values and add the index position in the list
	 */
	private List<Integer> findAllanagrams(String s, String p) 

	{
		int[] pArray =new int[26];
		int[] sArray =new int[26];

		List<Integer> lst =new ArrayList<>();

		int left=0,right=0;
		for(char c : p.toCharArray()) {
			pArray[c-'a']++;
		}

		int k=p.length();

		while(right<s.length()) 
		{
			if(right<left+k)
			{
				sArray[s.charAt(right)-'a']++;
				if(Arrays.equals(sArray,pArray))
				{
					lst.add(left);
				}
			}

			right++;
			if(right==left+k)
			{
				sArray[s.charAt(left)-'a']--;
				left++;
			}
		}

		return lst;
	}

}
