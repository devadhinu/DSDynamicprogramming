package slidingwindow;

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
 * 1)Take a single pointer and k length and in the while loop till the k length ,find the sum
 * 2)Now the k will be in 4th position(3rd index in array)
 * 3)from the current index to array lenth ,compute the sum in the below format
 *  
 *  sum=add 4th elemnt(3rd index) and subtract 1st element(0th index) and find the max 
 *  
 * 4)Iterate through the loop till the last element and compute the max element
 * 5)return the max element
 */

public class HightestKconsecutivesum {

	@Test	
	public void positive()
	{
		int[] arr= {1,5,2,3,7,1};
		int k=3;

		System.out.println(findMaxKconsecutivesumslidingwindow(arr,k));
	}
	@Test	
	public void negative()
	{
		int[] arr= {1,-5,2,-3,7,1};
		int k=3;

		System.out.println(findMaxKconsecutivesumslidingwindow(arr,k));
	}
	@Test	
	public void positive1()
	{
		int[] arr= {1,1,1,1,1,1};
		int k=3;

		System.out.println(findMaxKconsecutivesumslidingwindow(arr,k));
	}

	/*
	 * private int findMaxKconsecutivesum(int[] arr, int k) {
	 * 
	 * int left =0, next=left+1,right=left+k-1; int target =0; int
	 * max=Integer.MIN_VALUE;
	 * 
	 * if(arr.length==0)return 0;
	 * 
	 * while(left<arr.length-k && right<arr.length-1) { target =
	 * arr[left++]+arr[left+1]+arr[right++];
	 * 
	 * max=Math.max(target, max); } System.out.println(max); return max;
	 * 
	 * }
	 */

	private int findMaxKconsecutivesumslidingwindow(int[] arr, int k) 
	{

		int left =0;
		int sum=0;
		int max=Integer.MIN_VALUE;
		while(left<k)
		{
			sum+=arr[left++];
		}
		max=Math.max(max,sum);

		while(left<arr.length)
		{
			sum-=arr[left-k]+arr[left++];
			max=Math.max(max,sum);

		}
		if(arr.length==k)return sum;
		return max;
		
	}


}
