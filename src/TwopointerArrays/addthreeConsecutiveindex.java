package TwopointerArrays;

import java.util.Arrays;

import org.junit.Test;

public class addthreeConsecutiveindex 
{
	
	/*
	 * Given 2 int sorted arrays, print the intersection elements 
	 * of two arrays 
	 * 
	 * int[] arr1 = {2,3,5,6,8,10};
	 * int[] arr2 = {2,4,5,7,8};
	 * 
	 * 2,5,8
	 * Psedocode :
	 * 1)Identify two pointers and traverse through the array till its max length
	 * 2)if both pointer match , add in a set 
	 * 3)If any of the pointer1<pointer2 dont match ,move the first pointer
	 * 4)
	 * 
	 * /*
	 * 1. Did I understand the problem? 
	 * 	yes or no 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem? Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */

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
