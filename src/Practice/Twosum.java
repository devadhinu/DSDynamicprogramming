package Practice;

import java.util.Collection;
import java.util.HashMap;

import org.junit.Test;



public class Twosum {

	@Test
	public void example()
	{
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum(nums,target);
	}
	public int[] twoSum(int[] nums, int target)
	{
		int[] output = new int[2];
		int left=0,right=1;
		int sum=0;

		while(left<nums.length-1)
		{
			sum =nums[left]+nums[right];
			if(sum==target)
			{
				output[0]=left;
				output[1]=right;
			} 
			if(right==nums.length-1)
			{
				left++;
				right=left+1;
			}
			else right++;


		}

		return output;

	}
	
	public int[] twoSumhashMap(int[] nums, int target)
	{
		
	  HashMap<Integer,Integer> hm = new HashMap<>();
	  
	for(int i=0;i<nums.length;i++)
	{
		
		if(hm.containsKey(target-nums[i])) return new int[] {}
		hm.put(nums[i],i);
		
	    Collection<Integer> s =hm.values();
		
	}
	
		
		return nums;
	
	}
}
