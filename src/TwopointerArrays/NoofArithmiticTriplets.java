package TwopointerArrays;

import java.util.Arrays;

import org.junit.Test;

public class NoofArithmiticTriplets {
	
	/*2367. Number of Arithmetic Triplets
	 * 
	 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
	 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

          Example 1:

          Input: nums = [0,1,4,6,7,10], diff = 3
          Output: 2
          Explanation:
          (1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
          (2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 
	 * 
	 *    Constraints:
	 * 
	 *     i < j < k,
           nums[j] - nums[i] == diff, and
           nums[k] - nums[j] == diff. 
	 * 
	 * Pseudocode : 
	 * ========== 
	 * 1)Take two pointers left and right for the array nums
	 * 2)Keep traversing the pointers to see the difference is matching with variable diff 
	 * 3)if diff matches , put the element left into the array.
	 * 
	 * 
	 */
	@Test	
	public void positive()
	{
		int[] nums= {0,1,4,6,7,10};
		int diff=3;
	    //findTripletInteger(nums,diff);
	}
	@Test
	public void positive2()
	{
		int[] nums= {4,5,6,7,8,9};
		int diff=2;
		//findTripletInteger(nums,diff);
	}
	@Test
	public void negative()
	{
		int[] nums= {1,2,3,4,5,6};
		int diff=1;
		System.out.println(findTripletInteger(nums,diff));
		//findTripletInteger(nums,diff);
	}
	
	private int findTripletInteger(int[] nums, int diff) 
	{
		int left=0,right=1;
		int i=0,subvalue=0;
		int target;
		int[] triplet =new int[3];
		while(right<nums.length && i<triplet.length)
		{
			subvalue =nums[right]-nums[left];
			
			if(subvalue <diff) right++;
			else if(subvalue==diff)
			{
				triplet[i++]=left;
				left=right;
				if(i==2)triplet[i]=right;
				right++;
				
			}
			else left++;
		}
		String result=Arrays.toString(triplet);
		target=Integer.parseInt(result);
	   System.out.println(target);
	   return target;
	}

}
