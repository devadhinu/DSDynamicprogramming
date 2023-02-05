package arraysBruteforce;


import java.util.stream.IntStream;



public class FIndAnagram {
	
	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise. An Anagram is a word or phrase formed by rearranging the letters
	 * of a different word or phrase, typically using all the original letters
	 * exactly once. Constrains: s and t consist of lowercase English letters.
	 * Input: s = "anagram", t = "nagaram" Output: true
	 */
	
	@Test
	public void example()
	{
		String s ="anagram";
	    String t ="nagaram";
	    
	    System.out.println(isAnagram(s,t));
	    isAnagram(s,t);
	}
	
	public boolean isAnagram(String s,String t)
	{
		
			int actualstring =0,targetstring =0;
			if(s.length()!=t.length())return false;
			
			for(int i=0;i<s.length();i++)
			{
				
				actualstring+=(int)s.charAt(i);
				targetstring+=(int)t.charAt(i);
			}	
			
			if(actualstring==targetstring)return true;
			
			return false;
			
		
	}
	
	public boolean isAnagramusingASCIIapproach(String s,String t)
	{
		
			int[] sArr=new int[26];
			int[] tArr=new int[26];
			
			for(char value :s.toCharArray()) sArr[value-'a']++;
					
			for(char value :t.toCharArray()) tArr[value-'a']++;
			
			if(sArr.equals(tArr))return true;
			
			
			
			return false;
			
		
	}
	
	public boolean isAnagramusingASCIIapproachoptimised2(String s,String t)
	{
		
		int[]  arr = new int[26];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
		}
		
		return IntStream.of(arr).allMatch(n->n==0);
		
		
	}
	
}
