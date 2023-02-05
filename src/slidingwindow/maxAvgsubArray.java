package slidingwindow;

import org.junit.Test;

public class maxAvgsubArray {

	/* Problem statement :(class work)
	 * Given an array of integers and a number k.Return the highest sum of any k consecutive elements 
	 * in a array
	 * 
	 * You are given an integer array nums consisting of n elements, and an integer k.

      Find a contiguous subarray whose length is equal to k that has the maximum average value and   
      return this value. Any answer with a calculation error less than 10-5 will be accepted.

      Constraints:
      =============
      n == nums.length
      1 <= k <= n <= 105
      -104 <= nums[i] <= 104
    
    Pseudocode 
    ==========
    1) 


	 */

	@Test
	public void example()
	{

		int[] nums= {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(findMaxAverage(nums,k));
	}
	
	@Test
	public void edge()
	{

		int[] nums= {5};
		int k = 1;  //output:5.0000
		System.out.println(findMaxAverage(nums,k));
	}
	@Test
	public void edge2()
	{

		int[] nums= {4,0,4,3,3};
		int k = 5;  //output:5.0000
		System.out.println(findMaxAverage(nums,k));
	}
	
	
	@Test
	public void edge3()
	{

		int[] nums= {0,4,0,3,2};
		int k = 1;  //output:5.0000
		System.out.println(findMaxAverage(nums,k));
	}
//
//	Next question
//	644. Maximum Average Subarray II
//	More challenges
//	644. Maximum Average Subarray II
//	2090. K Radius Subarray Averages

	
	public double findMaxAverage(int[] nums, int k) 
	{


	       int i=0,sum=0;
			double avg = 0.00;
			int max;
			//double max=Integer.MIN_VALUE;
	        if(nums.length==1) return (double)nums[i];
			while(i<k)
			{
				sum+=nums[i++]; 
			}
			
			max=sum;
			if(k==nums.length)return (double)max/k;
			while(i<nums.length)
			{
				sum=sum-nums[i-k]+nums[i++];
				max=Math.max(sum, max);
				avg=(double)max/k;
			}
			
		
		return avg;
}
}
