package Hashing;

import java.util.HashSet;

import org.junit.Test;

public class Substringsize3distinctchar_1876 
{
	
	@Test
	public void positive()
	{
		String s ="xyzzaz";
		int k=3;
		countGoodSubstrings(s,k);
		System.out.println(countGoodSubstrings(s,k));
	}
	
	@Test
	public void positive2()
	{
		String s ="aababcabc";
		int k=3;
		countGoodSubstrings(s,k);
		System.out.println(countGoodSubstrings(s,k));
	}

	//
	
	
	 public int countGoodSubstrings(String s,int k) 
	 {
		 
		 int left=0;
		 int count=0;
			int right=0;
			HashSet<Character> hs =new HashSet<>();
			while(right<k)
			 {
				hs.add(s.charAt(right));
				right++;
			 }
		
			if(hs.size()==k)count++;
			while(right<s.length() && left<right)
			 {
				hs.add(s.charAt(right++));
				if(s.charAt(left)!=s.charAt(left+1))
				{
					hs.remove(left);
				}
				left++;
			 }
			 
			 if(hs.size()==k)count++;;
			 return 0;
	 }

}
