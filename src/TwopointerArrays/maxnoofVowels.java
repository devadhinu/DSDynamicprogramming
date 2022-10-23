package TwopointerArrays;

import org.junit.Test;

public class maxnoofVowels 
{
	/*Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3*/
	/*
	 * work -1 orka-2 rkaa -2 kaat-2 aatt-2 atte-2 ttec-1 tech-1
	 */
	@Test
	public void example()
	{
		String s="workaattech";
		int k=3;
		System.out.println(findmaxVowels(s,k));
	}

	public static boolean[] vowels =new boolean[256];
	static 
	{
		vowels['a'] =true;
		vowels['e'] =true;
		vowels['i'] =true;
		vowels['o'] =true;
		vowels['u'] =true;

	}
	public int findmaxVowels(String s ,int k)
	{

		int index=0;
		int count=0, max=0;

		while(index<k)
		{
			if(vowels[s.charAt(index++)])count++;

		}
		max=count;
		while(index<s.length())
		{
			if(!vowels[s.charAt(index++)])count--;
			if(vowels[s.charAt(index++)])count++;
			max=Math.max(count, max);
		}	
		return max;


	}
}
