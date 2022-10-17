package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class addConsecutiveindex {

	/*
	 * pseudocde : 1)Get the size of the array 
	 * 2)Define 2 index and add the two
	 * values in the two index
	 * 3)Increment both the index value (i till length-1 )(j till i)
	 * 4)
	 */

   @Test
	public void example ()//poistive
	{
		int[] nums = {1,2,3,4,5};
		int position =2;
		int[] output = {3,5,7,9};
		addindexvalues(nums, position);
	}
	public void example2 ()//edge
	{
		int[] nums = {};
		int[] output = {};
	}
	public void example3 ()//negative
	{
		int[] nums = {1};
		int[] output = {1};
	}

	private int[] addindexvalues(int[] nums ,int position)
	{

		int i=0;
		int left=0 ,right=left+1;
		int newArray[] =new int[nums.length-1];
	    while(left<=nums.length-position && right<nums.length)
	    {
	    newArray[i]=nums[left++]+nums[right++];
	    i++;    	
	    } 	
		System.out.println(Arrays.toString(newArray));
		return newArray;

	}
	}
