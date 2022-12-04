package Binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertposition {
	
	@Test
	public void positive() {
		//Positive Test Data
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int output = 4;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void positive2() {
		//Positive Test Data
		int[] nums = {1,3,5,6};
		int target = 2;
		int output = 1;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void positive3() {
		//Positive Test Data
		int[] nums = {1,2,3,4};
		int target = 5;
		int output = 4;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void edge3() {
		//Positive Test Data
		int[] nums = {1};
		int target = 4;
		int output = 1;
		Assert.assertEquals(searchInsert(nums,target), output);
	}

	@Test
	public void edge() {
		//Edge Case Test Data
		int[] nums = {10};
		int target = 9;
		int output = 0;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void edge2() {
		//Edge Case Test Data
		int[] nums = {9,9,9};
		int target = 1;
		int output = 0;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		int[] nums = {1,2,3,4};
		int target = 3;
		int output = 2;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	@Test
	public void negative2() {
		//Negative Test Data
		int[] nums = {2,3,4};
		int target = 9;
		int output = 3;
		Assert.assertEquals(searchInsert(nums,target), output);
	}
	
	 public int searchInsert(int[] nums, int target) {
	        int left=0 ,right=nums.length-1; 
	     
	        while (left<=right)
	        {
	            int  index = (left+right)/2;
	            
	            if(nums[index] == target)
	            {
	              return index;
	            }
	            else if(target > nums[index])
	            {
	               left = index + 1;//continue to find the match index if it exits
	            }//else return left if the index is greater than target
	            
	            else if(target<nums[index])
	            {
	                right = index-1;//
	            }
	        
	        }
	       return left;

}}
