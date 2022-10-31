package threepointers;

import java.util.Arrays;

import org.junit.Test;

public class SortDescusingdutchflagAlgorithm {
	
	@Test
	public void example()
	{
		int[] nums= {1,2,0,1,2};
		System.out.println(Arrays.toString(sortArraybydescending(nums)));
	}
	
	//Dutch Flag algorithm or 3 pointer algorithm
	
	/*
	 * 1) If the middle index value=low ,swap low and middle index and increment and Iflow and middle pointer
	 * 2) If middle index =middle , increment middle pointer 
	 * 3) If the middle index=high, swap high and middle and decrement high pointer
	 */
	/*
	 * Pseudocode :
	 * 
	 * 1) If three different values are given and asked to sort 
	 * 2) 3 pointer algorithm with different pointers low at 0th index and mid at 0th index and
	 *    high at last index of the array
	 * 3) If the middle index value=low ,swap low and middle index and increment low and middle pointer
	 * 4)  If middle index =middle , increment middle pointer 
	 * 5)  If the middle index=high, swap high and middle and decrement high pointer
	 */
	
	
	private int[] sortArraybydescending(int[] nums) 
	{
		int low=0,mid=nums.length-1,high=nums.length-1;
		//0,1,2
		
		while(mid<=high)
		{
			if(nums[mid]==0) 
			{
				int temp =nums[mid];
				nums[mid--]=nums[high];
				nums[high]=temp;
			}

			else if (nums[mid]==1)mid++;
			
			else if(nums[mid]==2)
			{
				int temp =nums[low];
				nums[low++]=nums[mid];
				nums[mid--]=temp;
				
			}
			
		}
		return nums;
	}


}
