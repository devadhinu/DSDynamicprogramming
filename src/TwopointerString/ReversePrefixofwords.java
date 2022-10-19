package TwopointerString;

import java.util.Arrays;

import org.junit.Test;

public class ReversePrefixofwords {

	/*
	 * 
	 * 2000. Reverse Prefix of Word
	 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). 
	 * If the character ch does not exist in word, do nothing.

       For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
      Return the resulting string.


	 * 
	 * Constraints:
	 * 
	 * 1 <= word.length <= 250
       word consists of lowercase English letters.
       ch is a lowercase English letter.
	 * 
	 * Pseudocode : 
	 * ========== 
	 * 1)Take two pointers left and right for the string
	 * 2)
	 * 3)Keep the left pointer (Slow) at first index and start traversing the right index
	 * 4)Keep moving the right index till it meets the char value
	 * 5)stop the right pointer and swap two values using two pointer
	 * 6)If the character is not present , return the string 
	 * 
	 */
	@Test
	public void positive1() {

		String word = "abcdefd";
		char ch = 'd';
		//Output: "dcbaefd"
       System.out.println(reversePrefix(word,ch));
		
	}	
	@Test
	public void negative() {

		String word = "z";
		char ch = 'z';
		//Output: "z"
	  reversePrefix(word,ch);
	}

	@Test
	public void positive3() {

		String word = "abcd";
		char ch = 'z';
		//Output: abcd
		//reversePrefix(word,ch);
	}

	@Test
	public void edge() {

		String word = "dbcd";
		char ch = 'd';
		//Output: dbcd
		//reversePrefix(word,ch);
	}
	
	@Test
	public void addition1() {

		String word = "abcdef";
		char ch = 'f';
		//Output: dbcd
		//reversePrefix(word,ch);
	}
	public void addition2() {

		String word = "ssssssssssssssssssssssssssssssssssssssssss";
		char ch = 's';
		//Output: dbcd
		System.out.println(reversePrefix(word,ch));
	}
	private String reversePrefix(String word, char ch) {
		
		//can include to validate if char is empty
		
		int pointer=0;
		char temp=0;
		//String result='';
		char[] charArray=word.toCharArray();
		
		while(pointer<charArray.length)
		{
		if(charArray[pointer]==ch)break;
		else pointer++;
		// if(charArray.length==1 || right>=charArray.length) return word;
		
		 int  left=0,right=pointer;
	    if(right==0 || right==charArray.length-1) return word; 

		while(left<right)
		{
         temp=charArray[left];
         charArray[left++]=charArray[right];
         charArray[right--]=temp;
		}	
		
	}return String.valueOf(charArray);
}}
