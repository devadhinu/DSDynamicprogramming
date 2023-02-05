package Marathon;

import org.junit.Test;

public class FIndDuplicatenoinO1 {
	
	/*
	 * 287. Find the Duplicate Number 
	 * 
	 * Given an array of
	 * integers nums containing n + 1 integers where each integer is in the range
	 * [1, n] inclusive.
	 * 
	 * There is only one repeated number in nums, return this repeated number.
	 * 
	 * You must solve the problem without modifying the array nums and uses only
	 * constant extra space.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,3,4,2,2] Output: 2 Example 2:
	 * 
	 * Input: nums = [3,1,3,4,2] Output: 3
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= n <= 105 nums.length == n + 1 1 <= nums[i] <= n All the integers in nums
	 * appear only once except for precisely one integer which appears two or more
	 * times.
	 * 
	 * 
	 * 			            0	1	2	3	4	5
nums[0]	nums[nums[0]		3	1	2	5	2	4    // 3 ,5
								
							
1		                  			
		                 	0	1	2	3	4	5
5	4	                	5	1	2	3	2	4
								
								
			                0	1	2	3	4	5
4	2	                	4	1	2	3	2	5
								
			                0	1	2	3	4	5
2	2               		2	1	2	3	4	5
								

	 * 
	 * 
	 */
	@Test
	public void example()
	{
		int[] nums = {1,3,4,2,2};
	//			Output: 2
	}
	@Test
	public void example2()
	{
		int[] nums = {2,2,2,2,2};
	//			Output: 2
	}
	@Test
	public void example3()
	{
		int[] nums = {3,1,3,4,2};
	//			Output: 3
	}
	
	/*
	 * Pseudocode : ============ 
	 * 1) Put a while condition till the length 
	 * 2) Validate every other element in the follwoing way nums[0] != nums[nums[0]] and swap if
	 *    mismatch 
	 * 3) Finding this way above will give the matching element or duplicate element
	 * 
	 */
	public int findDuplicate(int[] nums) 
	{
     int left=0;
	while(left<nums.length)
	{
		if(nums[left]!=nums[nums[left]])
        {
            int temp=nums[nums[left]];
            nums[nums[left]]=nums[left];
            nums[left]=temp;
        }

        else if(nums[left]==nums[nums[left]])
        {
            return nums[left];
        } 
      }
       return 0;
	
	}
	
	
	
}
