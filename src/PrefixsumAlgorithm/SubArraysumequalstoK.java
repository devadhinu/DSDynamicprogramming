package PrefixsumAlgorithm;

import java.util.HashMap;

import org.junit.Test;

public class SubArraysumequalstoK {
	
	/*
	 * https://leetcode.com/problems/subarray-sum-equals-k/
	 * 560. Subarray Sum Equals K Medium
	 
	 * 
	 * Share Given an array of integers nums and an integer k, return the total
	 * number of subarrays whose sum equals to k.
	 * 
	 * A subarray is a contiguous non-empty sequence of elements within an array.
	 * 
	 * 
	 * 
	 * Continuous Subarray Sum
       Subarray Product Less Than K
       Find Pivot Index
       Subarray Sums Divisible by K
       Minimum Operations to Reduce X to Zero
       K Radius Subarray Averages
       Maximum Sum Score of Array
	 * 
	 * 
	 */
	 
	
	@Test
	public void example1()
	{
		int[] nums=  {1,1,1};//2
		int k=2;
		System.out.println(subarraySumequalstoK(nums,k));
		//findNicesubarraycount(nums,k);

	}

	@Test
	public void example2()
	{
		int[] nums=  {1,2,3};//2
		int k=3;
		System.out.println(subarraySumequalstoK(nums,k));
		//findNicesubarraycount(nums,k);

	}

	public int subarraysumequalstoKBruetforce(int[] nums, int k) {

		int count=0;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=0;
			for(int j=i;j<nums.length;j++)
			{

				sum+=nums[j];
				if(sum==k) count++;

			}

		}
		return count;
	}
	
	
	 public int subarraySumequalstoK(int[] nums, int k) {
		 
		 HashMap<Integer,Integer> hm = new HashMap<>();
		  
		    int sum=0;
		    int count=0;
		     hm.put(0,1);
		    for(int i=0;i<nums.length;i++)
		    {
		      sum+=nums[i];
		       if(hm.containsKey(sum-k)) count+=hm.get(sum-k);
		       hm.put(sum,hm.getOrDefault(sum,0)+1);    
		        
		    }
    		            
		   return count;  
		 
	
		 
	 }
}
