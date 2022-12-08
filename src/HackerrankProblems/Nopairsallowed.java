package HackerrankProblems;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

public class Nopairsallowed {

	/*
	 * For each word in a list of words, if any two adjacent characters are equal,
	 * change one of them. Determine the minimum number of substitutions so the
	 * final string contains no adjacent equal characters.
	 * 
	 * 
	 * 
	 * Example
	 * 
	 * words = ['add', 'boook', 'break']
	 * 
	 * 
	 * 
	 * 'add': change one d (1 change) 'boook': change the middle o (1 change)
	 * 'break': no changes are necessary (0 changes)
	 * 
	 * 
	 * The return array is [1,1,0].
	 * 
	 * 
	 * 
	 * Function Description
	 * 
	 * Complete the function minimalOperations in the editor below.
	 * minimalOperations has the following parameter(s):
	 * 
	 * string words[n]: an array of strings
	 * 
	 * 
	 * 
	 * Returns:
	 * 
	 * int[n]: each element i is the minimum substitutions for words[i]
	 * 
	 * 
	 * 
	 * Constraints
	 * 
	 * 1 ≤ n ≤ 100 2 ≤ length of words[i] ≤ 105 Each character of words[i] is in the
	 * range ascii[a-z].
	 */
	@Test
	public void example()
	{
		String[] words = {"add","booooooooook","break"};// 2:1 , 3:1 4:2 5:2 6:3
		//op: 	[1,5,0]
		substituteAdjacentcharacter(words);
	}
	@Test
	public void example2()
	{
		String[] words = {"add", "boook", "break"};
		//op: 	[1,1,0]
		substituteAdjacentcharacter(words);
	}

	public int[] substituteAdjacentcharacter(String[] words)
	{
		int count=0;

		Stack<Character> stack = new Stack<>();

		int[] output= new int[words.length];

		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				if(stack.isEmpty() || stack.peek()!=words[i].charAt(j))
				{
					stack.push(words[i].charAt(j));
				}
				else if(stack.peek()==words[i].charAt(j))
				{
					stack.pop();
					count++;
				}
				
			}
			output[i]=count;
			count=0;
		}
		stack.clear();
		
		System.out.println(Arrays.toString(output));
		return output;

	}

}
