package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class addthreeConsecutiveindex 
{

	@Test
	public void example()

	{
		int[] nums = {2,3,3,1,2,4};
		int position =3;
		// output ={8,7,6,7}
		//System.out.println(Arrays.toString(addthreeindexvalues(nums,position)));
		addthreeindexvalues(nums,position);
	}

	//output :{2,3,3,1,2,4};
	public int[] addthreeindexvalues(int[] nums,int position) 
	{

		int i=0;
		int left=0 ,right=left+1,k=right+1;
		int n=nums.length;
		int newArray[] =new int[n-2];
		while(left<=n-position && right<=(n-2))
		{
			newArray[i++]=nums[left++]+nums[right++]+nums[k++];
			  	
		} 	
		System.out.println(Arrays.toString(newArray));
		return newArray;
	}}
