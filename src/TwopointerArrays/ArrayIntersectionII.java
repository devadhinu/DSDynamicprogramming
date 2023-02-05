package TwopointerArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class ArrayIntersectionII {

	/*350. Intersection of Two Arrays II
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
	 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
	 * 
	 * int[] arr1 = {1,2,2,1};
	 * int[] arr2 = {2,2};
	 * 
	 * 2,2
	 * Psedocode :
	 * 1)Identify two pointers and traverse through the array till its max length
	 * 2)if both pointer match , add in a set 
	 * 3)If any of the pointer1<pointer2 dont match ,move the first pointer
	 * 4)
	 * 
	 * Constraints:
	 * ===========
	 * 1 <= nums1.length, nums2.length <= 1000
       0 <= nums1[i], nums2[i] <= 1000

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
	public void positive() 
	{

		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};

		arrayIntersectionII(arr1,arr2);

	}

	@Test
	public void edge() 
	{

		int[] arr1 = {4,9,5};
		int[] arr2 = {9,4,9,8,4};

		arrayIntersectionII(arr1,arr2);

	}
	@Test
	public void edge2() 
	{

		int[] arr1 = {2};
		int[] arr2 = {2,2};

		arrayIntersectionII(arr1,arr2);

	}
  //Tried using Hashset but the case positive was not working and hence tried with list in the second
	/*
	 * private int[] arrayIntersectionII(int[] arr1, int[] arr2) {
	 * 
	 * int p1=0,p2=0,i=0;
	 * 
	 * int[] result = null; Arrays.sort(arr1); Arrays.sort(arr2);
	 * 
	 * HashSet<Integer> hs=new HashSet<Integer>();
	 * 
	 * while(p1<arr1.length && p2<arr2.length) {
	 * 
	 * if(arr2[p2]<arr1[p1])p2++; if(arr1[p1]==arr2[p2]) { hs.add(arr1[p1]); p2++; }
	 * 
	 * p1++; }
	 * 
	 * result=new int[hs.size()]; for(int item :hs) result[i++]=item;
	 * 
	 * System.out.println(Arrays.toString(result)); return result; }
	 */
	
	
	private int[] arrayIntersectionII(int[] arr1, int[] arr2) {
		 
		 int p1=0,p2=0,i=0;
		  
		  int[] result = null; 
		  Arrays.sort(arr1); Arrays.sort(arr2);
		  
		  List<Integer> lst = new ArrayList<Integer>();
		  
		  while(p1<arr1.length && p2<arr2.length) {
		  
		  if(arr2[p2]<arr1[p1])p2++; 
		  if(arr1[p1]==arr2[p2]) 
		  { 
	      lst.add(arr1[p1]);
		  p2++; 
		  }
		  
		  p1++; 
		  }
		  
		  result=new int[lst.size()];
		  for(int item :lst) result[i++]=item;
		  
		  System.out.println(Arrays.toString(result)); return result; }
		 
				
}
