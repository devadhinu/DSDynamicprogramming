package TwopointerArrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 *
 *
 */

public class Movezerostwopinter {

	@Test
	public void positive() {
		//Positive Test Data
		int[] nums = {0,1,0,3,12};
		int[] output = {1,3,12,0,0};
		Assert.assertArrayEquals(moveZeroes(nums), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		int[] nums = {0};
		int[] output = {0};
		Assert.assertArrayEquals(moveZeroes(nums), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		int[] nums = {0,0,0,3,0,0};
		int[] output = {3,0,0,0,0,0};
		Assert.assertArrayEquals(moveZeroes(nums), output);
	}
	
	@Test
	public void edge2() {
		//Negative Test Data
		int[] nums = {1,0,1};
		int[] output = {1,1,0};
		Assert.assertArrayEquals(moveZeroes(nums), output);
	}

	private int[] movezerostoLast(int[] nums) 
	{
		int left=0,right=left+1;
		int temp;
		//{0,1,0,3,12};
		while(right<nums.length) 
		{
			if(nums[left]==0 && nums[right]!=0) 
			{
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right]=temp;
			}			
			else if(nums[left]!=0 && nums[right]!=0) 			
			{
				left++;
				
			}
      right++;
		}
		System.out.println(Arrays.toString(nums));
		return nums;

	}
	//optimized
	 public int[] moveZeroes(int[] nums)
	 {
		 int index=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]!=0)nums[index++]=nums[i];
		 }
		 while(index<nums.length)
		 {
			 nums[index++]=0;
		 }
		 return nums;
	 }
	
}
