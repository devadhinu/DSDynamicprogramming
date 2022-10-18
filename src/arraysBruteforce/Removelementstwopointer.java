package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;
/*
27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

 *Pesudocode :
 *1)Take 2 pointers (left and right )slow at first index and fast at last index
 *2)
 *
 *
 */

public class Removelementstwopointer {

	@Test
	public void example1()
	{
		int[] nums= {2,1,2,2,3,0,4,2};
		int target =2;
		//System.out.println(removeElemts(nums,target));
		//removeElemts(nums,target);
		// o/p: [0,1,4,0,3,_,_,_]
	}

	@Test
	public void example2()
	{
		int[] nums= {0};
		int target=2;
		//removeElemts(nums,target);
	}

	@Test
	public void example3()
	{
		int[] nums= {};
		int target=2;
		//removeElemts(nums,target);
	}
	
	public void example4()
	{
		int[] nums= {2,2,2,2,2};
		int target=2;
	}
	
	public void example5()
	{
		int[] nums= {1,0,1};
		int target=2;
		removeElemts(nums,target);
	}

	private int removeElemts(int[] nums, int target) 
	{
		int left=0,n=nums.length,right=n-1;
		int counter=0;
		while(left<right)
		{
  //{2,1,2,2,3,0,4,2};
			if(nums[left]==target && nums[right] ==target)
			{
				right--;
				

			}
			if(nums[left]==target && nums[right] !=target)
			{
				int temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			
			}
			if(nums[left]!=target && nums[right] !=target)left++;			
		}

		System.out.println(Arrays.toString(nums));
		return left;
	}

}
