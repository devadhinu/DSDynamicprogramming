package slidingwindow;

import org.junit.Test;

public class RecolorBlackBoxes {
	
	/*
	 * 2379. Minimum Recolors to Get K Consecutive Black Blocks 
	 * 
	 *  You are given a 0-indexed string blocks of length n, where
	 * blocks[i] is either 'W' or 'B', representing the color of the ith block. The
	 * characters 'W' and 'B' denote the colors white and black, respectively.
	 * 
	 * You are also given an integer k, which is the desired number of consecutive
	 * black blocks.
	 * 
	 * In one operation, you can recolor a white block such that it becomes a black
	 * block.
	 * 
	 * Return the minimum number of operations needed such that there is at least
	 * one occurrence of k consecutive black blocks.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: blocks = "WBBWWBBWBW", k = 7 Output: 3 Explanation: One way to achieve
	 * 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks so that
	 * blocks = "BBBBBBBWBW". It can be shown that there is no way to achieve 7
	 * consecutive black blocks in less than 3 operations. Therefore, we return 3.
	 * Example 2:
	 * 
	 * Input: blocks = "WBWBBBW", k = 2 Output: 0 Explanation: No changes need to be
	 * made, since 2 consecutive black blocks already exist. Therefore, we return 0.
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == blocks.length 1 <= n <= 100 blocks[i] is either 'W' or 'B'. 1 <= k <= n
	 */
	
	/*
	 * Pseudcode : 
	 * 1) This falls in sliding window pattern 
	 * 2) This problem has to have a while loop till the array length whenever
	 *    the right-left==k , means when the right pointer crosses k size
	 *    ,reduce your left count and move your left.
	 * 3) Get the occurence of white and capture in counter variable
	 * 4) How much ever W occurence is there, till the k length , that much
	 *    has to be converted to balck
	 * 5) So when right meets k , reduce your left pointer counter 
	 *    occurence if it was 'W'.and increment left pointer.
	 * 6) Find the min insie the right-left>k condition as the min should be counted
	 *    once all the final counts are counted till k.
	 * 7) Keeping the Math.min out of if condition or the end of while loop will
	 *    un necessarily capture the all min occurence of single iteration W
	 *    and will get wrong min.      
	 *       
	 * 
	 * 
	 * Note : If we give right++ before right-left condition , then the if condition
	 * should be like right-left>k
	 * 
	 * if the right++ is given at the end of the loop , then the condition is like
	 * right-left==k
	 */
    @Test
	public void example()
	{
		
		String  blocks = "WBBWWBBWBW";
		int k=7;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	 public int minimumRecolors(String blocks, int k) {

	        char[] block = blocks.toCharArray();
	        int left=0,right=0;
	        int min=Integer.MAX_VALUE;
	        int count=0;
	        while(right<block.length)
	        {
	        if(block[right]=='W')  count++;
	        
	// If this else was not handled , loop will never end bcz when the ietration encounters 
	// B , it does not know what to do ..so the loops never gets broken        
	        else count=count;
		    right++;
		         
	          if(right-left>k)
	          {
	        	  min=Math.min(min,count);
	        	  if(block[left]=='W')count--;
	        	  else count=count;
	              left++;
	          }
	         
	        }
	     return min;   
	    }
}
