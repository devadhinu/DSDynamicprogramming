package expandFromcenter;

import org.junit.Test;

public class LongestPalindromicSubstring {


	@Test
	public void example()
	{
		String s= "fordevaavedfor";
		System.out.println(longestPalindrome(s));

	}

	public void edge1()
	{
		String s= "abc123cba";
		longestPalindrome(s);

	}
	public void edge2()
	{
		String s= "m";
		longestPalindrome(s);

	}
	public void edge6()
	{
		String s= "aaaaaaaaaaa";
		longestPalindrome(s);

	}
	public void edge3()
	{
		String s= "abayuoipop";
		longestPalindrome(s);

	}
	public void edge4()
	{
		String s= "uuoipopabc";
		longestPalindrome(s);

	}



	//babad

	public String longestPalindrome(String s) {
		if(s==null || s.length() < 1) return "";
		int left=0,right=0;

		for(int i=0;i<s.length();i++) {
			int len1 = expandFromCentre(s,i,i);
			int len2 = expandFromCentre(s, i, i+1);
			int len = Math.max(len1, len2);

			if(len>right-left) {
				left = i - (len-1)/2;
				right = i + len/2;
			}
		}
		return s.substring(left,right+1);
	}

	public int expandFromCentre(String s, int left, int right){        
		while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}


}


