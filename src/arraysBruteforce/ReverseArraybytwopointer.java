package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

//pseudocode:
//	
//1) Take an leftpointer and rightpoiter
//2) swap the two pointer value
//3)Increment and decrement the 2 values
//4) till it reaches the point equal

public class ReverseArraybytwopointer {
	
	@Test
	public void example1()//positive
	{
		int[] nums={1,2,3,4,5};	
		revreseArray(nums);
	}
	
	@Test
	public void example2()//negative
	{
		int[] nums={};	
		revreseArray(nums);
	}


	private int[] revreseArray(int[] nums)
	{
		
		int lpointer=0,rpointer=nums.length-1;
		System.out.println(nums.length);
		while(nums.length ==0 || nums.length ==1) return nums;
		
		while(lpointer<rpointer)
		{
		int temp=nums[lpointer];
		nums[lpointer++] =nums[rpointer];
		nums[rpointer--] =temp;	
		
		}
		System.out.println(Arrays.toString(nums));
		return nums;
				
	
	
	}
			

}
