package KandaneAlgorithm;

import org.junit.Test;

public class MaxsumcontigioussubArray {
	
	/*
	 * Problem :
	 * 
	 * Given an integer array nums ,find the contiguous sub array (containing
	 * atleast one number) which has the largest sum and return its sum.A subarray
	 * is a contigious part of an array.
	 * 
	 * Input : {-2,2,-3,4,-1,2,1,-5,4} 
	 * Output :6 
	 * suarray : {4,-1,2,1}
	 */

	
	/*
	 * Pseudocode : 
	 * 1)Take two variables sum and maxsum
	 * 2)Since negative integers are involved , we will use kandane algorithm as an efficient option
	 * 3)Use the breaking condition for loop as pointer <nums.length.
	 * 4)Take one pointer for this as that would solve this problem easily
	 * 4)Calculate the sum+nums[left] and increment left pointer and continue increment the left pointer
	 * 5)When the sum is less than 0 , make the sum value as 0
	 * 6)If the sum value is greater than 0 , then check the sum is greater than maxsum , if so store the sum value in maxloop on that loop and continue iterating to find that max
	 */
	
	@Test
	public void positive()
	{
		int[] nums = {-2,2,-3,4,-1,2,1,-5,4};
		findmaxcontiguoussubArray(nums);
		System.out.println(findmaxcontiguoussubArray(nums));
	}

	private int findmaxcontiguoussubArray(int[] nums) 
	{
	  int sum=0,maxsum=0;
	  
	  int left =0;
	 
	  while(left<nums.length-1)
	  {
		  sum+=nums[left++];
		  if(sum<0)sum=0;
		  if(sum>0)
		  {
			 maxsum=sum>maxsum?sum:maxsum;
		  }
		           
		  return maxsum;
	  } 
		
		
		return 0;
	
		
	}
	
}
