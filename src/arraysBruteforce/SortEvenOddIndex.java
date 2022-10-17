package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

/*
Leetocde 2164. Sort Even and Odd Indices Independently

Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation: 
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].*/



public class SortEvenOddIndex {
	//Sort Even and Odd Indices Independently
@Test
	public void example ()
	{
		int[] nums= {4,1,2,3};//positive
		sortEvenOddIndexindependent(nums);
	}
@Test
	public void example2()
	{
		int[] nums= {1,2};//negative
	}
@Test
	public void example3 ()
	{
		int[] nums= {2,2,2,2};//edge
	}

	private int[] sortEvenOddIndexindependent(int[] nums)
	{
	 int[] target =new int[nums.length];
     int i=0,j=1;
     int n=nums.length;
     while(i<n-2) {
    	 
    	int min = Math.min(nums[i],nums[i+2]);
     }
   
		System.out.println(Arrays.toString(target));
		return target;
		
	}


}

