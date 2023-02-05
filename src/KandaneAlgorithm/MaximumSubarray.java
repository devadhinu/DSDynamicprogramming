package KandaneAlgorithm;

import org.junit.Test;

public class MaximumSubarray {

	/*
	 * 53. Maximum Subarray
	 * 
	 * Given an integer array nums, find the subarray which has the largest sum and
	 * return its sum.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: [4,-1,2,1] has
	 * the largest sum = 6. Example 2:
	 * 
	 * Input: nums = [1] Output: 1 Example 3:
	 * 
	 * Input: nums = [5,4,-1,7,8] Output: 23
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105 -104 <= nums[i] <= 104
	 */

	@Test
	public void positive()
	{
		int[] nums = {-2,2,-3,4,-1,2,1,-5,4};
		findmaxsumsubArray(nums);
		System.out.println(findmaxsumsubArray(nums));
	}

	@Test
	public void positive2()
	{
		int[] nums = {-2,-3,-4,-1}; //op:-1
		findmaxsumsubArray(nums);
		System.out.println(findmaxsumsubArray(nums));
	}

	@Test
	public void positive3()
	{
		int[] nums = {-1,0};//0
		findmaxsumsubArray(nums);
		System.out.println(findmaxsumsubArray(nums));
	}
	
	@Test
	public void positive4()
	{
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};//0
		findmaxsumsubArray(nums);
		System.out.println(findmaxsumsubArray(nums));
	}

	private int findmaxsumsubArray(int[] nums) 
	{
		return 0;
	}	
}
