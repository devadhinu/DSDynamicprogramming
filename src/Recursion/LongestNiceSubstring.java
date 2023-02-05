package Recursion;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring 
{

	/*
	 * 1763. Longest Nice Substring
	 * 
	 * A string s is nice if, for every letter of the alphabet that s contains, it
	 * appears both in uppercase and lowercase. For example, "abABB" is nice because
	 * 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b'
	 * appears, but 'B' does not.
	 * 
	 * Given a string s, return the longest substring of s that is nice. If there
	 * are multiple, return the substring of the earliest occurrence. If there are
	 * none, return an empty string.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "YazaAay" Output: "aAa" Explanation: "aAa" is a nice string
	 * because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a'
	 * appear. "aAa" is the longest nice substring. Example 2:
	 * 
	 * Input: s = "Bb" Output: "Bb" Explanation: "Bb" is a nice string because both
	 * 'B' and 'b' appear. The whole string is a substring. Example 3:
	 * 
	 * Input: s = "c" Output: "" Explanation: There are no nice substrings.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 100 s consists of uppercase and lowercase English letters.
	 */

	public void example()
	{
		String s = "YazaAay";
		//op : "aAa"
	}
	public void example2()
	{
		String s = "Bb";
		//op : "Bb"
	}
	public void example3()
	{
		String s = "c";
		//op : ""
	}
	public String longestNiceSubstring(String s) {
		if (s.length() < 2) return "";
		char[] chars = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c: chars)
			set.add(c);
		for (int i = 0; i < chars.length; i++) {
			if (set.contains(Character.toUpperCase(chars[i])) && set.contains(Character.toLowerCase(chars[i]))) continue;
			String sub1 = longestNiceSubstring(s.substring(0, i));
			String sub2 = longestNiceSubstring(s.substring(i+1));
			return sub1.length() >= sub2.length() ? sub1 : sub2;
		}
		return s; 
	}
}
