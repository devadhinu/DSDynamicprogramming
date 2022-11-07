package PrefixsumAlgorithm;

import java.util.HashMap;

import org.junit.Test;

public class SubArraysumdivisiblebyK {

	/*
	 * Given an integer array nums and an integer k, return the number of non-empty
	 * subarrays that have a sum divisible by k.
	 * 
	 * A subarray is a contiguous part of an array.
	 * 
	 * Constraints:

    1 <= nums.length <= 3 * 104
   -104 <= nums[i] <= 104
    2 <= k <= 104
	 */


	@Test
	public void example1()
	{
		int[] nums=  {4,5,0,-2,-3,1};//7
		int k=5;
		System.out.println(findsubarraysDivByK(nums,k));
		//findNicesubarraycount(nums,k);

	}

	@Test
	public void example2()
	{
		int[] nums=  {5};//0
		int k=9;
		System.out.println(findsubarraysDivByK(nums,k));
		//findNicesubarraycount(nums,k);

	}
	//bruetforce
	public int findsubarraysDivByKbruteforce(int[] nums, int k) {

		int count=0;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=0;
			for(int j=i;j<nums.length;j++)
			{

				sum+=nums[j];
				if(sum%k==0) count++;

			}

		}
		return count;
	}

	public int findsubarraysDivByK(int[] nums, int k) {

		int count=0;
		int sum=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(0,1);
		
		for(int i=0;i<nums.length;i++)
		{
			
			if(hm.containsKey(sum%k)) count+=hm.get(sum%k);
			sum+=nums[i];
			hm.put(sum,hm.getOrDefault(sum,0)+1);    

		}


		return count;
	}


}
