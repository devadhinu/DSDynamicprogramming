package Spotproblems;
import java.util.HashSet;

import org.junit.Test;

public class Spotproblem {

	/*
	 * Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a
	 * subset of arr1[] or not. Both the arrays are not in sorted order. It may be
	 * assumed that elements in both arrays are distinct. Input: arr1[] = {11, 1,
	 * 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} Output: arr2[] is a subset of arr1[]
	 * 
	 * Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4} Output: arr2[] is a
	 * subset of arr1[] Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
	 * Output: arr2[] is not a subset of arr1[]
	 */
	@Test	
	public void example1()
	{
	   int arr1[] = {11, 1, 13, 21, 3, 7}; 
	   int arr2[] = {11, 3, 7, 1};
	   System.out.println(isArrayasubset(arr1 ,arr2)); //true
	}
	@Test	
	public void example2()
	{
		int arr1[] = {1, 2, 3, 4, 5, 6}; 
		int arr2[] = {1, 2, 4};
		 System.out.println(isArrayasubset(arr1 ,arr2));//true
	}
	@Test	
	public void example3()
	{
		int arr1[] = {10, 5, 2, 23, 19}; 
		int arr2[] = {19, 5, 3};
		System.out.println(isArrayasubset(arr1 ,arr2));//false

	}
	@Test	
	public void example4()
	{
		int arr1[] = {10}; 
		int arr2[] = {9};
		 System.out.println(isArrayasubset(arr1 ,arr2));//false
	}
	@Test	
	public void example5()
	{
		int arr1[] = {1,2,3,4,5,6}; 
		int arr2[] = {7,8,9,10,11,12,12,13};
		 System.out.println(isArrayasubset(arr1 ,arr2));//op false
	}

	public boolean isArrayasubset(int[] arr1 , int[] arr2)
	{

		HashSet<Integer> hs =new HashSet<>();

		for(int i : arr1)
		{
			hs.add(i);
		}
		for(int i : arr2)
		{
			if(hs.add(i)) 

			{
				return false;
			}
		}

		return true;

	}


}

