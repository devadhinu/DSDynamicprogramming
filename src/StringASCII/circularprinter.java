package StringASCII;

import org.junit.Test;

public class circularprinter 
{
	/*
	 * It is a circular printer wheel with the letters A through Z in sequence. It
	 * wraps so A and Z are adjacent. The printer has a pointer that is initially at
	 * 'A'. Moving from any character to any adjacent character takes 1 second. It
	 * can move in either direction. Given a string of letters, what is the minimum
	 * time needed to print the string? (Note: Assume that printing does not take
	 * any time. Only consider the time it takes for the pointer to move.) A company
	 * has invented a new type of printing technology—a circular printer that looks
	 * like this: s = "BZA" Total time to print “BZA”
	 * 
	 * = 1+ 2 + 1 = 4 seconds
	 * 
	 * First, move the pointer from 'A' to 'B' (1 second), then from 'B' to 'Z' (2
	 * seconds), and finally from 'Z' to 'A' (1 second). So the minimum time needed
	 * to print "BZA" is 4 seconds.
	 */

	@Test
	public void example()
	{
		String str ="ZNMD";
		findcircularprinterlength(str); //op: 19
	}
	@Test
	public void example2()
	{
		String str ="BZA";
		System.out.println(findcircularprinterlength(str));//op: 4
	}

	public long findcircularprinterlength(String str)
	{
		int diff=0,sum=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			if(i==0) diff = ch[i]-'A';
			else diff = ch[i] - ch[i-1];
			diff = Math.abs(diff);
			if(diff>13) diff = 26-diff;
			sum += diff;
	        }
			return sum;
	}
}
