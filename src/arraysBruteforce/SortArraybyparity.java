package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class SortArraybyparity {


	@Test
	public void example1()

	{
		int[] nums = {3,1,2,4};
		//System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
	@Test
	public void example2()

	{
		int[] nums = {2,2,2,2};
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
	
	@Test
	public void example3()

	{
		int[] nums = {1,1,1,1,1};
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}
	@Test
	public void example4()//negative

	{
		int[] nums = {1,3,3,2,4};
		System.out.println(Arrays.toString(sortArrayByParity(nums)));
	}

	//Output: [2,4,3,1]
	// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

	public int[] sortArrayByParity(int[] nums) {


		int fIndex=0;
		int lIndex = nums.length-1;
		int temp=0;
		
	while(fIndex<lIndex)
	{
	if(nums[fIndex]%2==0)++fIndex;
	if(nums[lIndex]%2!=0)--lIndex;
	else if(fIndex<lIndex)
	{
		temp=nums[fIndex];
		nums[fIndex++] =nums[lIndex];
		nums[lIndex--] =temp;
	}
	}
	
	return nums;
	}

	//System.out.println(Arrays.toString(nums)) ;
		
	

	public int[] sortArrayByParitysolution2(int[] nums) {

		
		int[] newArray = new int[nums.length];
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
        	if(nums[i]%2==0) newArray[k++] =nums[i];
        }
        for(int i=0;i<n;i++)
        {
        	if(nums[i]%2!=0) newArray[k++] =nums[i];
        }
        
        System.out.println(Arrays.toString(newArray));
		return newArray;

	}
}

