package TwopointerArrays;

import org.junit.Test;

/*
 * Given a array of integers and a number k 
 * 
 * 
 */

/*1. Did I understand the problem? 
 * 	yes or no  -YES
 * 	If no ask the person to provide
 * 	with more details with examples 
 * 	If yes go to the next step What is the
 * 	input(s)? What is the expected output? 
 * 
 * 	Do I have any constraints to solve the
 * 	problem?  NO
 *  Do I have all the information to go to the next steps -YES
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
/*Pseudocode:
 * 1)Take two pointers left and right and move two pointers at a time 
 * 2)The max length for left to traverse  is array length-k
 * 3)use three variable to position the values
 * 4)Iterate 
 * 5)
 */

public class HightestKconsecutivesum {
	
	@Test	
	public void positive()
	{
		int[] arr= {1,5,2,3,7,1};
		int k=3;

		findMaxKconsecutivesum(arr,k);
	}
	@Test	
	public void negative()
	{
		int[] arr= {1,-5,2,-3,7,1};
		int k=3;

		//findMaxKconsecutivesum(arr,k);
	}
	@Test	
	public void positive1()
	{
		int[] arr= {1,1,1,1,1,1};
		int k=3;

		//findMaxKconsecutivesum(arr,k);
	}

	private int findMaxKconsecutivesum(int[] arr, int k) 
	{
	  
		int left =0, next=left+1,right=left+k-1;
		int target =0;
		int max=Integer.MIN_VALUE;
		if(arr.length==0)return 0;
		while(left<arr.length-k && right<arr.length-1)
		{
		 target = arr[left++]+arr[left+1]+arr[right++];
		 
		 max=Math.max(target, max);			
		}
		System.out.println(max);
		return max;
		
	}
	
	

}
