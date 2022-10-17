package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class sortArraybruteforce {

	/*
	Problem : sort an array of integers

	int nums={4,7,2,5,1};

   Pseudocode :
   1) Take the ith and jth poistion as 0 and 1
   2)Traverse the first for loop 
   3)traverse the second for loop
   4)swap the element if i is higher than j 
   
	.*/
	
	
	@Test	
	public void example()//positive
	{
		int[] nums={4,7,2,5,1};	
		//sortArray(nums);
	}
	
	@Test	
	public void example1()//edge
	{
		int[] nums={1,1,1,1,1};	
		//sortArray(nums);
	}
	@Test	
	public void example2()//negative
	{
		int[] nums={1};	
		//sortArray(nums);
	}
	
	@Test	
	public void example3()//negative
	{
		int[] nums={};	
		sortArray(nums);
	}

	private int[] sortArray(int[] nums)
	{
		//int i=0,j=1;	
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]>nums[j])
				{
					int temp=nums[i];
					nums[i] =nums[j];
					nums[j] =temp;

				}

			}
		}
			System.out.println(Arrays.toString(nums));
			return nums;


		}
	}
