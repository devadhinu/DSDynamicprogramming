package TwopointerString;

import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyletters {

	/*
	 * Given a string s, reverse the string according to the following rules:
	 * 
	 * All the characters that are not English letters remain in the same position.
	 * All the English letters (lowercase or uppercase) should be reversed. Return s
	 * after reversing it. Constraints:
	 * 
	 * 1 <= s.length <= 100 s consists of characters with ASCII values in the range
	 * [33, 122]. s does not contain '\"' or '\\'.
	 * 
	 * Pseudocode:
	 * ============
	 * 1)take two pinters one at left side of 0th index and right at length of the string
	 * 2)Start to swap the char one by one by checking whether the character is char or number.
	 * 3)Use isAlphabetic method in Character class to validate and to swap
	 * 4)If its not isAlphabetic , then increment and decrement the two pointers
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void positive1() {

		String s = "ab-cd";

		//Output: dbcd
		reverseOnlyLetters(s);
	}
	@Test
	public void positive2() {

		String s = "ab-cdz-x576";

		//Output: dbcd
		//reverseOnlyLetters(s);
	}
		@Test
		public void negative() {

		String s = "-rv8989670";

			//Output: dbcd
			reverseOnlyLetters(s);
		}
		public String reverseOnlyLetters(String s)
		{
			char[] ch =s.toCharArray();
			int left=0,right=ch.length-1;
			char temp=0;
			String result="";
			//boolean a =false;
			while(left<right)
			{
		
				if(Character.isAlphabetic(ch[left])==true) 
				{
					System.out.println("yes true");
				}
				if(Character.isAlphabetic(ch[left])&& Character.isAlphabetic(ch[right]))   
				{
					temp=ch[left];
					ch[left++]=ch[right];
					ch[right--]=temp;
				}
				else if(!Character.isAlphabetic(ch[left]))
					left++;
				else right--;
			}

			//result=Arrays.toString(ch);

			System.out.println(Arrays.toString(ch));  
		



		return String.valueOf(ch)  ;
	}
}