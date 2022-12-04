package Analytical;

public class MaximumDiffBeIncreasingEle {
	
	/*
	 * 2016. Maximum Difference Between Increasing Elements
	 * 
	 * Given a 0-indexed integer array nums of size n, find the maximum difference
	 * between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j <
	 * n and nums[i] < nums[j].
	 * 
	 * Return the maximum difference. If no such i and j exists, return -1.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [7,1,5,4] Output: 4 Explanation: The maximum difference occurs
	 * with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4. Note that with i = 1 and
	 * j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not
	 * valid. Example 2:
	 * 
	 * Input: nums = [9,4,3,2] Output: -1 Explanation: There is no i and j such that
	 * i < j and nums[i] < nums[j]. Example 3:
	 * 
	 * Input: nums = [1,5,2,10] Output: 9 Explanation: The maximum difference occurs
	 * with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == nums.length 2 <= n <= 1000 1 <= nums[i] <= 109
	 */
	
	/*
	 * Pseudocode: 
	 * 1)Assume first element as min element 
	 * 2)We get the maximum elemennt when we get the element subtracted with min value element
	 * 3)Declare the diff as -1; 
	 * 4)Ietrate through the loop and when nums[i] > min element ,subtract it and find the max diff
	 * 5) When the nums[i]< min , chand your min value to the new nums[i] value encountered.
	 * 
	 */
	 public int maximumDifference(int[] nums) 
	 {
		 int diff =-1;
	        int min=nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	          if(nums[i]>min)
	          {
	              diff=Math.max(diff,nums[i]-min);
	          }
	            else min=nums[i];
	        }
	        return diff;
	    }
	 }

