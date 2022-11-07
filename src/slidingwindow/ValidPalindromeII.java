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
	public void example3()
	{
		String s = "abc";
		//	System.out.println(verifyIfvalidPalindrome(s));
	}

	@Test
	public void example4()
	{
		String s = "abca";
		System.out.println(validPalindrome(s));
	}

	@Test
	public void example5()
	{
		String s = "eccer";
		//System.out.println(validPalindrome(s));
	}

	//	Bruetforce approach :
	//    ======================
	public boolean verifyIfvalidPalindrome(String s)
	{
		int left=0,right=s.length()-1;
		int count=0;

		while(left<right)
		{  
			if(s.charAt(left)==s.charAt(right))
			{
				left++;right--;
				return true;//to be considered to return 
			}


			if(count!=1 && s.charAt(left)!=s.charAt(right))
			{
				if(s.charAt(left)==s.charAt(left+1))
				{
					left++;count++;

				}
				if(s.charAt(right)==s.charAt(left+1))
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
	//using expand from center approach
	/*
	 * public boolean validPalindrome(String s) {
	 * 
	 * int n=s.length(); 
	 * char[] nums=s.toCharArray();
	 * int left,right; 
	 * if(n%2==0) 
	 * {
	 * left= n/2-1; 
	 * right=n/2; 
	 * } 
	 * else { 
	 * left=n/2;
	 * right=n/2; 
	 * }
	 * 
	 * while(left>0 && right<s.length())
	 * if(s.charAt(left)==s.charAt(right)) 
	 * {
	 * left--; right++; 
	 * }
	 * 
	 * else
	 * { 
	 * return isPalindrome(s,left-n/2,left) || isPalindrome(s,right,right+n/2); 
	 * } 
	 * return true;
	 * 
	 * }
	 * 
	 * private boolean isPalindrome(String s, int left, int right) 
	 * {
	 * 
	 * while(left>=0 && right<=s.length())
	 * { 
	 * if(s.charAt(left)!=s.charAt(right))
	 * {
	 * left--; right++; 
	 * return false;
	 *  }
	 * } 
	 * return true; 
	 * }
	 */

//2 pointers from 0 and n-1 position 	
	public boolean validPalindrome(String s)
	{
		int left = 0, right = s.length() - 1;

		while(left<right) {

			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}
			else
				return isPalindrome(s, left+1, right) || isPalindrome(s, left, right-1);
		}
		return true;
	}

	private boolean isPalindrome(String s, int left, int right) {
		while(left<right) {
			if(s.charAt(left++) != s.charAt(right--)){
				return false;
			}
		}
		return true;
	}
}
