package slidingwindow;

import java.util.Arrays;

import org.junit.Test;

public class HighestandlowestKscores {

	/*
	 * 1984. Minimum Difference Between Highest and Lowest of K Scores
	 * 
	 * You are given a 0-indexed integer array nums, where nums[i] represents the
	 * score of the ith student. You are also given an integer k.
	 * 
	 * Pick the scores of any k students from the array so that the difference
	 * between the highest and the lowest of the k scores is minimized.
	 * 
	 * Return the minimum possible difference.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [90], k = 1 Output: 0 Explanation: There is one way to pick
	 * score(s) of one student: - [90]. The difference between the highest and
	 * lowest score is 90 - 90 = 0. The minimum possible difference is 0. Example 2:
	 * 
	 * Input: nums = [9,4,1,7], k = 2 Output: 2 Explanation: There are six ways to
	 * pick score(s) of two students: - [9,4,1,7]. The difference between the
	 * highest and lowest score is 9 - 4 = 5. - [9,4,1,7]. The difference between
	 * the highest and lowest score is 9 - 1 = 8. - [9,4,1,7]. The difference
	 * between the highest and lowest score is 9 - 7 = 2. - [9,4,1,7]. The
	 * difference between the highest and lowest score is 4 - 1 = 3. - [9,4,1,7].
	 * The difference between the highest and lowest score is 7 - 4 = 3. -
	 * [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
	 * The minimum possible difference is 2.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= k <= nums.length <= 1000 0 <= nums[i] <= 105
	 */
	@Test
	public void example()
	{
		int[] nums= {9,4,1,7};
		int k=2;
		System.out.println(minimumDifference(nums,k));
		
	}

	public int minimumDifference(int[] nums, int k) 
	{

		
		int diff=0;
		int m=nums.length;
		int min=Integer.MAX_VALUE;

		Integer[] desc = new Integer[nums.length];

		Arrays.setAll(desc, i -> nums[i]);
	
		
		Arrays.sort(desc,(a,b) -> Integer.compare(a,b));

		System.out.println(Arrays.toString(desc));
		
		/*
		 * Pseudocode: 
		 * 1)The prob statement is to find the min diff for a maximim and
		 * minimum element of k window 
		 * 2)Take two pointer , right and left 
		 * 3)Keep the pointer at 0 first and right at k-1 which will be the end of k elements
		 * 4)NOw subtract the value and store it in a min
		 * 5)Now move your left one position and right one position maintaining the window size
		 * 6)This will continue till right<array.length
		 * 
		 */

		if(nums.length==1)return 0;
		
		//******************Fixed window size*************
//		while(right<desc.length)
//		{
//			if(right-left>k-1)
//			{
//				left++;
//				right=left+k-1;
//			}
//			if(right-left==k-1)
//			{
//				diff=desc[right]-desc[left];
//				min=Math.min(min,diff);
//			}
//			right++;
//		}
		int left=0;
		int right=k-1;
		while(right<desc.length)
		{
			diff=desc[right]-desc[left];
			min=Math.min(min, diff);
			left++;
			right++;
		}

		return min;

	}

}
