package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class SortArraybyParity2 {
	
	//Problem : 922. Sort Array By Parity II
	//https://leetcode.com/problems/sort-array-by-parity-ii/description/

	//	  pseudocode :
	//	  ===========
	//	  1)Create a  new array 
	//    2)Take the first element in the given array
	//    3)Find the element is even and if the ith position is also even , put it in the new array
	//    4)Find the element is odd and if the ith position is also odd , put it in the new array

	//	Input: nums = [4,2,5,7]
	//		   Output: [4,5,2,7]

	@Test
	public void example()

	{
		int[] nums = {2,3,3,1,2,4};
		System.out.println(Arrays.toString(sortArrayByParity2(nums)));
	}

	//output :{2,3,3,1,2,4};
	public int[] sortArrayByParity2(int[] nums) {
		int n=nums.length;
		int evenIndex=0;
		int oddIndex=evenIndex+1;
		int[] newArray = new int[nums.length];
		for(int i=0;i<n;i++)
		{
  
		//using both the 2 pointer in the parent array to find  and not on the targetarray
			
			if(nums[i]%2==0) 
			{ 
				newArray[evenIndex] =nums[i];
				evenIndex= evenIndex+2;
			}

			else 
			{
				newArray[oddIndex] =nums[i];
				oddIndex= oddIndex+2;
			}
		}

		System.out.println(Arrays.toString(newArray));
		return newArray;
	}
	
	public int[] sortArrayByParity2poniter(int[] nums) {
		int n=nums.length;
		int newIndex=0;
		int oddIndex=newIndex+1;
				
		
		return nums;
	}
}
