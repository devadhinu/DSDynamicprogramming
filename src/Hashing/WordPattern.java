package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class WordPattern 
{
	/*
	 * 290. Word Pattern
	 * 
	 * Given a pattern and a string s, find if s follows the same pattern.
	 * 
	 * Here follow means a full match, such that there is a bijection between a
	 * letter in pattern and a non-empty word in s.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: pattern = "abba", s = "dog cat cat dog" Output: true Example 2:
	 * 
	 * Input: pattern = "abba", s = "dog cat cat fish" Output: false Example 3:
	 * 
	 * Input: pattern = "aaaa", s = "dog cat cat dog" Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= pattern.length <= 300 pattern contains only lower-case English letters.
	 * 1 <= s.length <= 3000 s contains only lowercase English letters and spaces '
	 * '. s does not contain any leading or trailing spaces. All the words in s are
	 * separated by a single space.
	 */

	@Test
	public void example()
	{
		String pattern ="aaaa";
		String s =s = "dog cat cat dog";
		System.out.println(wordPattern(pattern,s));
	}
	@Test
	public void example2()
	{
		String pattern ="abba";
		String s =s = "dog cat cat dog";
		System.out.println(wordPattern(pattern,s));
	}
	@Test
	public void example3()
	{
		String pattern ="abba";
		String s =s = "dog cat cat fish";
		System.out.println(wordPattern(pattern,s));
	}
	@Test
	public void example4()
	{
		String pattern ="abba";
		String s =s = "dog dog dog dog";
		System.out.println(wordPattern(pattern,s));
	}


	/*
	 * Pseudocode: 
	 * 1) Create a hashMap to store the pattern character and the string value as value pair
	 * 2) Split the string and store the value of the string in the array
	 * 3) now iterate through the pattern character by character and check whether the pattern(key) is 
	 *    already present in the map and if key present ,get the value and check whether it equals the string array value 
	 *    for the same index position in the array , if it does not match return false.
	 * 4) Now check if the key is not present already , but the value should not be present for some other key in the
	 *    map.If its present , return false
	 * 5) Else enter the values in the hashmap
	 * 6) Return true outside the block.
	 * 
	 */

	public boolean wordPattern(String pattern, String s) {
		
			HashMap<Character,String> hm1 = new HashMap<>();    
			String[] sArray = s.split(" ");
			if(pattern.length() != sArray.length) return false;
			for(int i=0;i<pattern.length();i++)
			{

				if(hm1.containsKey(pattern.charAt(i)) && (!hm1.get(pattern.charAt(i)).equals(sArray[i])))
				{
					return false;
				}
				if(!hm1.containsKey(pattern.charAt(i)) && (hm1.containsValue(sArray[i])))
				{
					return false;
				}
				hm1.put(pattern.charAt(i),sArray[i]);
			}
			return true;
		
	}
}
