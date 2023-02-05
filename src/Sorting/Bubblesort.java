package Sorting;

import java.util.Arrays;

import org.junit.Test;

public class Bubblesort {

	@Test
	public void example2()
	{
		int[] arr = {2,4,45,-3,4,-8,9};
		System.out.println(Arrays.toString(sort(arr)));

	}

	@Test
	public void example()
	{
		int[] arr = {2,4,45,3,4,8,9};
		System.out.println(Arrays.toString(sort(arr)));
	}

	@Test
	public void example3()
	{
		int[] arr = {};
		System.out.println(Arrays.toString(sort(arr)));
	}
	/*
	 * Pseudocode: 
	 * ============= 
	 * 1) If array is empty return null 
	 * 2) Assign min as i'th index
	 * 3) If arr[j] is lesser than the minimum value , assign the jth value to min
	 * 4)  For the next loop , we can compare i with the new assigned min
	 * 5)  swap the values with the min and current i value
	 * 6)  continue till the end of i.
	 */

	// selection sort --> O(n2)

	public int[] sort(int[] arr)
	{
		if(arr.length==0) return null;

		int n=arr.length;
		
		for(int j=1;j<n;j++)
		{
			for(int i=0;i<j;i++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			
			}

		}
		return arr;

	}
	
}
