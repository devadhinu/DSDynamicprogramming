package Hashing;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;



public class NoofArithmiticTripletsusingHashing 

{

	@Test
	public void positive()
	{
		int[] nums= {0,1,4,6,7,10};

		int diff = 3;
		int output = 2;
		Assert.assertEquals(arithmeticTriplets(nums, diff), output);
	}
	
	@Test
	public void example2() {

		int nums[] = {4, 5, 6, 7, 8, 9};
		int diff = 2;
		int output = 2;
		Assert.assertEquals(arithmeticTriplets(nums, diff), output);
	}

	@Test
	public void example3() {

		int nums[] = {4, 50, 100, 200};
		int diff = 2;
		int output = 0;
		Assert.assertEquals(arithmeticTriplets(nums, diff), output);
	}

	@Test
	public void example4() {

		int nums[] = {0,0,0};
		int diff = 1;
		int output = 0;
		Assert.assertEquals(arithmeticTriplets(nums, diff), output);
	}
	
	/*
	 * Pseudocode : 
	 * 1)Create a hashmap and insert the array elements and its
	 *   occurence as key and value in it. 
	 * 2)Now loop through the same array elements and find whether the elements are
	 *   present in the hashmp as below
	 *   
	 *   1+diff(3) =4 is present in hashmap?
	 *   1+diff(3*2)=7 is present in hashmap?
	 *   
	 * 3) continue doing that and find the max such occurence as count.
	 * 4)return the count  
	 * 
	 * 
	 * 
	 * 
	 */
	
	 public int arithmeticTriplets(int[] nums, int diff) {
		
		 HashMap<Integer,Integer> hs = new HashMap<>();
		 
		 int counter =0;
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 hs.put(nums[i],hs.getOrDefault(nums[i], 0)+1);
		 }
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 if(hs.containsKey(nums[i]+diff) && hs.containsKey(nums[i]+(diff*2)))
			 counter++;	 
		 }
		 
		 
		 return counter;
	 
		 
	 }

}
