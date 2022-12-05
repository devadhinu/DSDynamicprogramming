package StringASCII;

import org.junit.Test;

public class RansomeNoteLeetcode {
	
	/*
	 * 383. Ransom Note
	 * 
	 * Given two strings ransomNote and magazine, return true if ransomNote can be
	 * constructed by using the letters from magazine and false otherwise.
	 * 
	 * Each letter in magazine can only be used once in ransomNote.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: ransomNote = "a", magazine = "b" Output: false Example 2:
	 * 
	 * Input: ransomNote = "aa", magazine = "ab" Output: false Example 3:
	 * 
	 * Input: ransomNote = "aa", magazine = "aab" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= ransomNote.length, magazine.length <= 105 ransomNote and magazine
	 * consist of lowercase English letters.
	 */
    @Test
	public void example1()
	{
		String ransomNote = "a";//false
		String magazine = "b";
	}
    @Test
	public void example2()
	{
		String ransomNote = "aa";
		String magazine = "ab";//false
	}
    @Test
	public void example3()
	{
		String ransomNote = "aa";
		String magazine = "aab";//true
	}
    @Test
	public void example4()
	{
		String ransomNote = "aa";
		String magazine = "ab";//false
	}
    
    public boolean canConstruct(String ransomNote, String magazine) 
    {
	
    	int[] occurence = new int[26]; //O(n)
    	
    	for(char c :magazine.toCharArray())
    	{
    		occurence[c-'a']++;
    	}
    	for(char c :ransomNote.toCharArray())
    	{
    		if(occurence[c-'a']==0) return false;
    		
    		else
    		{
    			occurence[c-'a']--;
    		}
    	}
	
	return true;
        
    }
}
