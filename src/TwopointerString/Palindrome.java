package TwopointerString;

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
	
	
	//Bruteforce
	private boolean isPalindrome_bruteForce(String s) {
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse += s.charAt(i);
		}
		return reverse.equals(s) ? true : false;
	}

	
	//using two pointers
	public boolean verifyifPalindrome(String s)
	{
		int left=0,right=s.length()-1;
    
        if(s.length()==1)return true;
		while(left<right)
		{
			if(s.charAt(left)==s.charAt(right))
			{
				left++;
				right--;
				
			}
			else if(s.charAt(left)!=s.charAt(right))return false;
		}
		return true;

	}
}