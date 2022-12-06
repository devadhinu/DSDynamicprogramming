package TwopointerArrays;

import org.junit.Assert; 

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class Checkdoubleexists {
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
	/*
	 * Problem statement:
	 * ====================
	 * 1346. Check If N and Its Double Exist
	 * Given an array arr of integers, check if there exist two indices i and j 
	 * such that :

          i != j
          0 <= i, j < arr.length
          arr[i] == 2 * arr[j]

       Input: arr = [10,2,5,3]
       Output: true
       Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
       Example 2:

       Input: arr = [3,1,7,11]
       Output: false
       Explanation: There is no i and j that satisfy the conditions.   

	 * Constraints:
	 * =============

         2 <= arr.length <= 500
        -103 <= arr[i] <= 103
	 * 
	 * Pseudocode : 
	 * ========== 
	 * 1)Sort the array
	 * 2) Take two pointers and one at 0the index[i] and multiply with 2 
	 * 3) keep othe rpointer at second index j and check whether  2 * arr[j] is equivalent to a[i]
	 * 

	 * 
	 */

	@Test
	public void positive() {
		//Positive Test Data
		int[] nums = {10,5,2,3};
		boolean output = true;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		int[] nums = {-1,-1};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		int[] nums = {2,3};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void negative2() {
		//Negative Test Data
		int[] nums = {-19,-16};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void negative3() {
		//Negative Test Data
		int[] nums = {10,5,5,5};
		boolean output = true;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void negative4() {
		//Negative Test Data
		int[] nums = {5,5,5,5};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void negative5() {
		//Negative Test Data
		int[] nums = {-10,12,-20,-8,15};
		boolean output = true;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void edge3() {
		//edge Test Data
		int[] nums = {-2,0,10,-19,4,6,-8};
		boolean output = false;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}
	
	@Test
	public void edge4() {
		//edge Test Data
		int[] nums = {0,0};
		boolean output = true;
		Assert.assertEquals(checkIfDoubleExist_UsingSet(nums), output);
	}


	private boolean ifDoublevalueexist(int[] arr)
	{
		int left=0;
		
		HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
	
		
		if(arr.length==1)return false;
		
		for(int i=0;i<arr.length;i++) 
		{
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
			
		System.out.println(hm);
		
		while(left<arr.length)
		{
		if(hm.containsKey(arr[left]*2) || (arr[left]%2==0 && hm.containsKey(arr[left]/2>0)))
		{
			return true;
		}
		left++;
		}
       		
		
		return false;
	}
	
	/*
	 * Pseudocode 
	 * ==========
	 * 1)Iterate through all the elements in the string 
	 * 2)If the  no in the array is a multiple of 2 as given in the prob 
	 * 3)The second possibility could be if the element is divisible by 2.
	 * 4)When we are checking the element divisible by 2 , we also need to see whether
	 *  its mod value is 0. return true for this condition 
	 * 5)continue to add the element in the HashSet over iteration as usual
	 * 6) Over the iteration verify the condition and return true
	 * 7)Out of the loop , return false.
	 * 
	 
	 
	 */	//optimized solution
	
	private boolean checkIfDoubleExist_UsingSet(int[] arr)
	{
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]*2) || (arr[i]%2==0 && hs.contains(arr[i]/2))) return true;
			hs.add(arr[i]);
		}
		
		
		return false;
		
	}

}
