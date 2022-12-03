package Hashing;

import java.util.HashMap;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

//Pranathi interview questions


public class Ispalindromeafterrearrange {
	/*
	 * Given a String AABB, return true if this given str can be made a polindrome
	 * by rearranging the chars ex : AABB -> true ABBD -> false AAB -> true
	 */

	/*Pseudocode:

    1) As its rearrange of the string , no sequence needs to be followed to validate
    2) Create a hashmap and iterate through the values and store its occurence
    3) Verify whether the each occurence is twice 
    4) Only for one character key , value 1 occurence is allowed (for the odd length sceanrio
       eg: aabaa (b:1)
    5) make a counter variable to catch the single char occurnece
    6) If any more char has a single occurence , return false 
    7)else return true.

	 */
	@Test
	public void example()
	{
		String s="AABB";
		//op: true																									
		//	isPalindromeafterarrange(s);
		Assert.assertEquals(isPalindromeafterarrange(s), true);
	}
	@Test
	public void example2()
	{
		String s="ABBD";

		//op: false		
		//	isPalindromeafterarrange(s);
		Assert.assertEquals(isPalindromeafterarrange(s), false);
	}
	@Test
	public void example3()
	{
		String s="AAB";
		//op: true																									
		//	isPalindromeafterarrange(s);
		Assert.assertEquals(isPalindromeafterarrange(s), true);
	}
	public boolean isPalindromeafterarrange(String s)
	{

		HashMap<Character,Integer> hm = new HashMap<>();

		int count=0;

		for(char c : s.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}

		Set<Character> entry = hm.keySet();

		for(Character c : hm.keySet())
		{ 
			if((hm.get(c))/2==0) return true;

			else if((hm.get(c))/2!=0 ) 
			{
				count++;

				if(count==1 ||count==0) return true;
				else 
				{ 
					return false;
				}
			}
		}

		return true;
				
	}	
}
