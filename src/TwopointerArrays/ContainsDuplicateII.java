package TwopointerArrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	/*
	 * 219. Contains Duplicate II
	 * 
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1], k = 3 Output: true Example 2:
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true Example 3:
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 */

	public void positive1()
	{
		int[] nums = {1,2,3,1};
		int k=3;
		containsNearbyDuplicate(nums,k);
	}

	public void positive2()
	{
		int[] nums = {1,0,1,1};
		int k=1;
	}

	public void positive3()
	{
		int[] nums = {1,2,3,1,2,3};
		int k=2;
	}
	
	/*
	 * Pseudocde : ------------ 1)Create a map and iterate through the array values
	 * 2)Make a condition check whether the value is already present in the map 3)If
	 * present , subtract the current array value index -map value 4)verify whether
	 * it is lesser than k 5)else enter in hshmap
	 */
    

	//Bruteforce approach 
	private boolean containsNearbyDuplicate(int[] nums, int k) 
	{

	 int left=0,right=1;
     while(left<nums.length)
     {
		while(right<nums.length)
		{
			if(nums[left] == nums[right] && Math.abs(left - right) <= k)
			{
				return true;
			}
			right++;
		}
     }
		return false;
	}

	  public boolean containsNearbyDuplicateoptimised(int[] nums, int k) {
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < nums.length; i++) {
		        if (map.containsKey(nums[i])) {
		            if (i - map.get(nums[i]) <= k) return true;
		        }
		        map.put(nums[i], i);
		    }
		    return false;
}
}