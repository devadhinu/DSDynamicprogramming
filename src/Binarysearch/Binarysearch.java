package Binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class Binarysearch {
//	https://leetcode.com/problems/binary-search/
		
/*		704. Binary Search
	
		Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

		You must write an algorithm with O(log n) runtime complexity.

		 

		Example 1:

		Input: nums = [-1,0,3,5,9,12], target = 9
		Output: 4
		Explanation: 9 exists in nums and its index is 4
		Example 2:

		Input: nums = [-1,0,3,5,9,12], target = 2
		Output: -1
		Explanation: 2 does not exist in nums so return -1
		 

		Constraints:

		1 <= nums.length <= 104
		-104 < nums[i], target < 104
		All the integers in nums are unique.
		nums is sorted in ascending order.*/
		
		@Test
		public void positive() {
			//Positive Test Data
			int[] nums = {-1,0,3,5,9,12};
			int target = 9;
			int output = 4;
			Assert.assertEquals(search(nums,target), output);
		}

		@Test
		public void edge() {
			//Edge Case Test Data
			int[] nums = {};
			int target = 9;
			int output = -1;
			Assert.assertEquals(search(nums,target), output);
		}
		
		@Test
		public void edge2() {
			//Edge Case Test Data
			int[] nums = {9,9,9};
			int target = 9;
			int output = 0;
			Assert.assertEquals(search(nums,target), output);
		}
		
		@Test
		public void negative() {
			//Negative Test Data
			int[] nums = {};
			int target = 9;
			int output = -1;
			Assert.assertEquals(search(nums,target), output);
		}
		
		@Test
		public void negative2() {
			//Negative Test Data
			int[] nums = {2,3,4};
			int target = 9;
			int output = -1;
			Assert.assertEquals(search(nums,target), output);
		}
		
		/*
		 * --- Pseudo Code ---
		 * 
		 * 1. Traverse through the given array
		 * 2. If nums[i] equals target, return i
		 * 3. return -1 by default
		 * 
		 * Time: O(n)
		 * Space: O(1)
		 * 
		 * 
		 * -- Binary Search --
		 * 1. Create pointers left,right and mid
		 * 2. Calculate mid as left+(right-left)/2
		 * 3. Check if the value is matching
		 * 4. If the current mid value is less than target, left = mid+1
		 * 5. If the current mid value is greater than target, right=mid-1;
		 * 
		 * Time: O(logn)
		 * Space: O(1)
		 *
		 * 
		 */	
		
 public int search(int[] nums, int target) {
        
        int left=0,right=nums.length-1;
        
        while(left<=right)
        { 
            
        int mid =(left+right)/2;
        if(nums[mid]==target) return mid;
        
        else if(nums[mid]>target)  right=mid-1;
        
        else if(nums[mid]<target)  left=mid+1;
        }
           
        return -1;
    }
}
