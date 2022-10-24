package slidingwindow;

import org.junit.Test;

public class ValidPalindromeII 
{
	@Test
	public void example1()
	{
		String s = "aba";
	//	System.out.println(verifyIfvalidPalindrome(s));
	}
	@Test
	public void example2()
	{
		String s = "aba";
	//	System.out.println(verifyIfvalidPalindrome(s));
	}
	@Test
	public void example3()
	{
		String s = "abc";
	//	System.out.println(verifyIfvalidPalindrome(s));
	}

	@Test
	public void example4()
	{
		String s = "abca";
	//	System.out.println(verifyIfvalidPalindrome(s));
	}

	@Test
	public void example5()
	{
		String s = "eccer";
		System.out.println(verifyIfvalidPalindrome(s));
	}
	public boolean verifyIfvalidPalindrome(String s)
	{
		int left=0,right=s.length()-1;
		int count=0;

		while(left<right)
		{  
			if(s.charAt(left)==s.charAt(right))
			{
				left++;right--;
				return true;
			}

		
			if(count!=1 && s.charAt(left)!=s.charAt(right))
			{
				if(s.charAt(left)==s.charAt(left+1))
				{
					left++;count++;

				}
				else if( s.charAt(right)==s.charAt(right-1))
				{
					right--;count++;

				}
				else if(s.charAt(left)==s.charAt(right-1))
				{
					right--;count++;

				}

			}
			if(count==1 && s.charAt(left)!=s.charAt(right))return false;



		}

		return false;
	}

}
