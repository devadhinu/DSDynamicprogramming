package arraysBruteforce;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Twosumtarget {
	
	@Test
	public void example()
	{
     int[] nums = {2,5,7,9,6};
     int target = 12;
     Assert.assertEquals(findsum(nums,target),new int[]{5,7});
		
	}
	//negative
	@Test
	public void example1()
	{
    int[] nums = {1};
     int target = 12;
		
	}
	
	//edge
	@Test
	public void example2()
	{
     int[] nums = {1,4,6,8,9};
     int target = 12;
		
	}
public int[] findsum(int[] nums ,int target)
{		
	int i,j;
	int[] result;
	for (i = 0; i < nums.length; i++) {
			for (j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					
				}
			}
		}
	return new int[] {};
		 
		
	
	}
//	public void findsumtwopinter(int[] nums ,int target)
//	
//	{
//	
//		int i=0,j=nums.length-1;
//		
//	while(i<j)
//		
//		
//	
//		}}

}