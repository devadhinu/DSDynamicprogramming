package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class Duplicatezeroes {

	@Test
	public void example1()
	{
		int[] nums=  {1,0,2,3,0,4,5,0};//1,0,0,2,3,0,0,4
		duplicateZeros(nums);

	}

	@Test
	public void example2()
	{
		int[] nums=  {1,2,3};//1,2,3
		//
		//duplicateZeros(nums);

	}
	
	//DuplicatezerosBruteforce

	public void duplicateZeros(int[] arr) {

		int i =0 , j=arr.length-1;

		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==0 && i+1<arr.length)
			{

				while(j>i+1)
				{
					arr[j]=arr[j-1];
					j--; 
				}	
				arr[i+1]=0;	
				i=i+1;	
				j=arr.length-1;

			}
		} 

		System.out.println(Arrays.toString(arr));
	}
	
	
	//Sumaya
	
	/*
	 * for(int i =0; i<nums.length; i++) 
	 * {
	 * 
	 * if(nums[i] == 0 && i+1 <nums.length) 
	 * {
	 * 
	 * for(int j=nums.length-1; j>i+1; j--) 
	 * {
	 * 
	 * nums[j] = nums[j-1];
	 * } 
	 * nums[i+1] =0; 
	 * i++; 
	 * }
	 */
	
	
	//DuplicatezerosOptmized with O9n) approach
	
	
}
