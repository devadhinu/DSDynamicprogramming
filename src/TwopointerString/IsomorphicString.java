package TwopointerString;

import java.util.HashMap;

import org.junit.Test;

public class IsomorphicString {
	
	/*
	 * 205. Isomorphic Strings Given two strings s and t, determine if they are
	 * isomorphic.
	 * 
	 * Two strings s and t are isomorphic if the characters in s can be replaced to
	 * get t.
	 * 
	 * All occurrences of a character must be replaced with another character while
	 * preserving the order of characters. No two characters may map to the same
	 * character, but a character may map to itself.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "egg", t = "add" Output: true Example 2:
	 * 
	 * Input: s = "foo", t = "bar" Output: false Example 3:
	 * 
	 * Input: s = "paper", t = "title" Output: true
	 */
	
	/*
	 * Constraints:
	 * 
	 * 1 <= s.length <= 5 * 104 t.length == s.length s and t consist of any valid
	 * ascii character.
	 */
	@Test
	public void example1()
	{
		
		String s ="egg";
		String t = "add";
		System.out.println(isIsomorphic(s,t));
	}
	@Test
	public void example2()
	{
		
		String s ="foo";
		String t = "bar";
		System.out.println(isIsomorphic(s,t));
	}
	@Test
	public void example3()
	{
		
		String s ="paper";
		String t = "title";
		System.out.println(isIsomorphic(s,t));
	}
	
	public boolean isIsomorphic(String s, String t)
	{
		
		HashMap<Character,Character> hm = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				if(hm.get(s.charAt(i)).equals(t.charAt(i))) return true;
				
				else return false;
			}
			
			if(!hm.containsValue(t.charAt(i)))
			{
				hm.put(s.charAt(i),t.charAt(i));
			}
		}
		
		return false;
		
	}
	

}
