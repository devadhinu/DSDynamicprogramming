package TwopointerString;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReversewordsinStringIII {


	/*2367. Number of Arithmetic Triplets
	 * 
	 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
	 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

          Example 1:

          Input: nums = [0,1,4,6,7,10], diff = 3
          Output: 2
          Explanation:
          (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
          (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 
	 * 
	 *    Constraints:
	 * 
	 *    1 <= s.length <= 5 * 104
          s contains printable ASCII characters.
          s does not contain any leading or trailing spaces.
          There is at least one word in s.
          All the words in s are separated by a single space.
	 * 
	 * Pseudocode : 
	 * ========== 
	 * 1)Take two pointers left and right for the array nums
	 * 2)Keep traversing the pointers to see the difference is matching with variable diff 
	 * 3)if diff matches , put the element left into the array.
	 * 
	 * 
	 */
	@Test	
	public void positive()
	{
		String s= "Let's take LeetCode contest";
		//Output: "s'teL ekat edoCteeL tsetnoc"

		reverseWords(s);
	}
	@Test
	public void positive2()
	{
		String s= "God Ding";
		// Output: "doG gniD"

		//reverseWords(nums,diff);
	}
	@Test
	public void negative()
	{

	}
	public String reverseWords(String s) 
	{
		//int left=0,right=0
		if(s.length()==1)return s;
		int i=0;
		
		String s1 = null;
		
		    String[] substr = s.split("");
		  
		    for(String word :substr) 		    
		    {
		    	System.out.println(word); 
                s1=""+reversesubstr(word);
		    }	
	
			return s1;
	
	}
	private String reversesubstr(String word) 
	
	{
	   char temp;
	   int left=0,right=word.length()-1;
	   char[] ch=word.toCharArray();

	   
	   while(left<right)
	   {
		   if(ch[left]>=33 && ch[right]<=126)
		   {
		   temp=ch[left];
		   ch[left]=ch[right];
		   ch[right]=ch[left];
		   }
	   }
	return word;
		
	}
}
	
/*
 * int left=0,right=substr[i].length()-1; if(word!=null) {
 * 
 * char[] ch = word.toCharArray(); temp=ch[left]; ch[left++]=ch[right];
 * ch[right--]=temp; i++; }
 * 
 * //System.out.println(word);
 * 
 * }
 */
	