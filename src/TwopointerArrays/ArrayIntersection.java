package TwopointerArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import org.junit.Test;

public class ArrayIntersection {

	private static final boolean Ispresent = false;
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
	public void positive() {

		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};

		intersection(arr1,arr2);

	}
	@Test
	public void positive1() {

		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2,2};

		//intersection(arr1,arr2);

	}
	@Test
	public void edge() {

		int[] arr1 = {2};
		int[] arr2 = {2,2};

		//intersection(arr1,arr2);

	}
	public int[] intersection(int[] arr1, int[] arr2)
	{
		//if(arr1.length <0 || arr2.length <0) return new int[]{};

		int p1=0,p2=0,k=0;
		int[] target = null ;
		Set<Integer> set = new HashSet<Integer>(); 


		while(arr1.length<arr2.length || arr1.length>arr2.length)
		{		
			if(p1<arr1.length)
			{
				if(arr1[p1]==arr2[p2])
				{	
					set.add(arr2[p2++]);
				}
				p1++;
				if(arr1.length ==0 ||arr2.length==0)return target;
				target = new int[set.size()];	
				for(Integer i: set) 
				{
					target[k++] = i;
				}
			}
			
			  if(p2<arr2.length) { if(arr2[p2]==arr1[p1]) { set.add(arr1[p1++]); } p2++;
			  target = new int[set.size()];
			  for (Integer i: set) { target[k++] = i; } }
			  
			  
			 
			System.out.println(Arrays.toString(target)); 	
		}return target;
	}
}
