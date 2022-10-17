package arraysBruteforce;

import java.util.Arrays;

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
	public void example1()
	{
		int[] nums= {0,1,0,3,12};
		movezerostoLast(nums);
	}

	@Test
	public void example2()
	{
		int[] nums= {0};	
	}

	@Test
	public void example3()
	{

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
	/*
	 * private int[] movezerostoLast(int[] nums) { int left=0,right=left+1; int
	 * temp;
	 * 
	 * while(right<nums.length) { if(nums[left]==0 && nums[right]!=0) {
	 * temp=nums[left]; nums[left++]=nums[right]; nums[right]=temp; } right++;
	 * if(nums[left]==0 && nums[right]==0) { right++; } else if(nums[left]!=0 &&
	 * nums[right]!=0) left++;right++;
	 * 
	 * } System.out.println(Arrays.toString(nums)); return nums;
	 * 
	 * }
	 */

}
