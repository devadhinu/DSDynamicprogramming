package HackerrankProblems;

import org.junit.Assert;
import org.junit.Test;

public class Countrepeatingsequnces {

	/*
	 * Counting repeating sequences In a given string, count the number of times any
	 * character is repeated in a sequence. Some rules to take care of: • Even if a
	 * repeating sequence contains two or more occurrences, it should be treated as
	 * a single repeat. ● If a character occurs in separate repeating sequences,
	 * then they should be counted separately
	 * 
	 * Some examples to make the rules clear: 
	 * =======================================
	 * • abbc - only one repeating sequence of "b"
	 * o Output: 1
	 * 
	 * ● abbbc - only one repeating sequence of "b" 
	 * o Output 1
	 * 
	 * O aabbc- two repeating sequences, one of "a", and one of "b" 
	 * • Output: 2 
	 * 
	 * • aabbaa - three repeating sequences, two of "a" (separate repeating sequences)and one of "b" 
	 * • Output: 3 . 
	 * 
	 *  aaabbbccaaad - four repeating sequences, two of "a" (separate repeating sequences), one of "b", one of "c" 
	 *  Output 4 repeating sequences), one of "b", one of "c" 
	 * 
	 * 
	 * o Output 4 
	 * 
	 *
	 * The following test case is one of the actual test cases of this question that may be used to evaluate your submission. 
	 * 
	 * Sample input 1 ▷ 
	 * abbc
	 * abbbc
	 * aabbc
	 * aabbaa
	 * aaabbbccaaad
	 * abcdefg
	 * 
	 * Sample output
	 *  1  1 2 3 4 0 
	 *  
	 * Note: Your code must be able to
	 * print the sample output from the provided sample input. However, your code is
	 * run against multiple hidden test cases. Therefore, your code must pass these
	 * hidden test cases to solve the problem statement. Limits Time Limit: 5.0
	 * sec(s) for each input file Memory Limit: 256 MB
	 */
	@Test
	public void example1()
	{
		String s ="abbc";
		int output = 1;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}
	@Test
	public void example2()
	{
		String s ="abbbc";
		int output = 1;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}
	@Test
	public void example3()
	{
		String s ="aabbc";
		int output = 2;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}
	@Test
	public void example4()
	{
		String s ="aabbaa";
		int output = 3;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}
	@Test
	public void example5()
	{
		String s ="aaabbbccaaad";
		int output = 4;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}
	@Test
	public void example6()
	{
		String s ="abcdefg";
		int output = 0;
		Assert.assertEquals(findCountrepeatingsequence(s), output);
	}

   //Sliding window problem -Hackerrank
	public int findCountrepeatingsequence(String s) 
	{
		int left=0,right=1;

		int count=0,sum=0;
		
		int mincount=0;

		char[] ch =s.toCharArray();

		while(right<s.length())
		{
			if(ch[right]==ch[left])
			{
				
				if(right-left>=1)count=1;
			}
			else if(ch[right]!=ch[left]) //aaabbbccaaad
			{
				left=right;
			}
			right++;
		}
		sum+=count;	
		
		return sum;


	}

}
