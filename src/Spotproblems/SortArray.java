package Spotproblems;

import java.util.Arrays;

import org.junit.Test;

public class SortArray {
	
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
	public int[] sort(int[] arr)
	{
		
		if(arr.length==0) return null;
		for(int i=0;i<arr.length-1;i++)
		{
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		return arr;
		
		
	}
}
