package slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class ShortestDistancetoaCharacter {
	
	/*
	 * 821. Shortest Distance to a Character
	 * 
	 * Given a string s and a character c that occurs in s, return an array of
	 * integers answer where answer.length == s.length and answer[i] is the distance
	 * from index i to the closest occurrence of character c in s.
	 * 
	 * The distance between two indices i and j is abs(i - j), where abs is the
	 * absolute value function.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "loveleetcode", c = "e" Output: [3,2,1,0,1,0,0,1,2,2,1,0]
	 * Explanation: The character 'e' appears at indices 3, 5, 6, and 11
	 * (0-indexed). The closest occurrence of 'e' for index 0 is at index 3, so the
	 * distance is abs(0 - 3) = 3. The closest occurrence of 'e' for index 1 is at
	 * index 3, so the distance is abs(1 - 3) = 2. For index 4, there is a tie
	 * between the 'e' at index 3 and the 'e' at index 5, but the distance is still
	 * the same: abs(4 - 3) == abs(4 - 5) = 1. The closest occurrence of 'e' for
	 * index 8 is at index 6, so the distance is abs(8 - 6) = 2. Example 2:
	 * 
	 * Input: s = "aaab", c = "b" Output: [3,2,1,0]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s[i] and c are lowercase English letters. It is
	 * guaranteed that c occurs at least once in s
	 */
	
	@Test
	public void example1() {
		//Positive Test Data
		String s = "loveleetcode";
		char ch = 'e';
		int[] output = {3,2,1,0,1,0,0,1,2,2,1,0};
		Assert.assertArrayEquals(shortestToChar(s,ch), output);
	}
	
	

	@Test
	public void example2() {
		//Edge Case Test Data
		String s = "loveleetcode";
		char ch = 'd';
		int[] output = {10,9,8,7,6,5,4,3,2,1,0,1};
		Assert.assertArrayEquals(shortestToChar(s,ch), output);
	}
	
	@Test
	public void example3() {
		//Negative Test Data
		String s = "aaba";
		char ch = 'b';
		int[] output = {2,1,0,1};
		Assert.assertArrayEquals(shortestToChar(s,ch), output);
	}
	
	/*
	 * Pseudocode: 
	 * 1)Get the length of the string.
	 * 2)Create a array with the length of the string 
	 * 3)Declare a new variable called position with -negative index
	 * of length ,it becomes positive when the output array is updated with
	 * output[i]=i-position; 
	 * 3)Iterate through the string length and if the char is
	 * found ,declare the new variable called position with the current index and
	 * subtract i-position ,so we will end up getting 0 for the occurrence of
	 * Character. 
	 * 4)Then update the value of output with i-position.
	 * 
	 * 5)DO the same thing for second pass
	 * 6)FInd the math.min to get the min value out of first and second pass output 
	 *   array value.
	 */ 
	public int[] shortestToChar(String s, char c) 
	{
		int[] output = new int[s.length()];
		int n=s.length();
		int position =-1;
		
		for(int i=0;i<n;i++) //1st pass
		{
			if(s.charAt(i)=='c')
			{
				position=i;
			}
			output[i]=i-position;
			
			
		}
		for(int i=s.length()-1;i>n;i--) //2nd pass
		{
			if(s.charAt(i)=='c')
			{
				position=i;
			}
			output[i]=Math.min(output[i], Math.abs(i-position));
		}
		
		return output;
		
	}
	}

