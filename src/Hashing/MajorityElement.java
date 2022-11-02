package Hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MajorityElement {
	
	@Test
	public void positive()
	{
		int[] nums ={3,2,3};
		
		int k=3;
		
		//majorityElement(nums);
		System.out.println(majorityElement(nums));
	}
	
	/*
	 * Pseudocde : ============== 
	 * 1) Traverse through the array element and insert
	 * the elements into the array 
	 * 2) if the hashmap.getKey returned value is greater than n/2?
	 * 3) verify whether the element is greater than n/2 and return if its greater.
	 */
    public int majorityElement(int[] nums) 
    {
    	int n=nums.length/2;
    	System.out.println(n);
    	
    	Map<Integer,Integer> hm = new HashMap<>();
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
    		
    		if(hm.get(nums[i])>n) return nums[i];
    	}
    	
    	
		return 0;
    	
    }
}
