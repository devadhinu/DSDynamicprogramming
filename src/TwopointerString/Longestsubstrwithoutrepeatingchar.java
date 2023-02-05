package TwopointerString;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Longestsubstrwithoutrepeatingchar {

	@Test
	public void example()
	{
		String s="abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public int lengthOfLongestSubstring(String s) 
	{
		int length=0;
		int maxlength=0;

		StringBuilder sb = new StringBuilder();//-space complexity -o(log n)

		char[] ch = s.toCharArray();
		String unique="";

		for(int i=0;i<ch.length;i++) //O(n) -time complexity
		{
			char c =ch[i];

			//check the length and whether the character sequence is already present to add the char value

			if(unique==null || !(unique.contains(c+"")))
			{
				sb=sb.append(ch[i]);
				unique=sb.toString();
			}

			else if(unique.contains(c+""))
			{
				length=unique.length();
				sb.setLength(0);
				unique="";
			}
			maxlength= Math.max(length,maxlength); 
		}

		//identify the lax length and 

		return maxlength;

	}

	public int lengthOfLongestSubstringMap(String s) 
	{
		int left=0,right=0;
		Map<Character,Integer> hMap = new HashMap<>();
		int maxLength = 0;

		while(right<s.length()){
			hMap.put(s.charAt(right),hMap.getOrDefault(s.charAt(right),0)+1);
			if(hMap.keySet().size()==right-left+1)
			{
				if(maxLength < right-left+1) maxLength = right-left+1;
			} 
			else
			{
				while(hMap.size()!=right-left+1)
				{
					hMap.put(s.charAt(left),hMap.get(s.charAt(left))-1);
					if(hMap.get(s.charAt(left))==0) hMap.remove(s.charAt(left));
					left++;
				}
			}
			right++;
		}
		return maxLength;

	}
}
