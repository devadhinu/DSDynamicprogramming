package TwopointerArrays;

import org.junit.Test;

public class Palindrome {

	@Test
	public void example()
	{
		String s="RADAR";
		System.out.println(verifyifPalindrome(s));
	}
	
	@Test
	public void example1()
	{
		String s="DEVA";
		System.out.println(verifyifPalindrome(s));
	}
	@Test
	public void edge()
	{
		String s="";
		System.out.println(verifyifPalindrome(s));
	}

	public boolean verifyifPalindrome(String s)
	{
		int left=0,right=s.length()-1;
        if(s==null)return false;
        if(s.length()==1)return true;
		while(left<right)
		{
			if(s.charAt(left)==s.charAt(right))
			{
				left++;
				right--;
				return true;
			}
			else if(s.charAt(left)!=s.charAt(right))break;
		}
		return false;

	}
}