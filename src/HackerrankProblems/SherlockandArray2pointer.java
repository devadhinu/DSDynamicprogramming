package HackerrankProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SherlockandArray2pointer {

	/*
	 * https://www.hackerrank.com/challenges/sherlock-and-array/problem
	 * 
	 * Watson gives Sherlock an array of integers. His challenge is to find an
	 * element of the array such that the sum of all elements to the left is equal
	 * to the sum of all elements to the right.
	 * 
	 * Example
	 * 
	 * 
	 * is between two subarrays that sum to .
	 * 
	 * 
	 * The answer is since left and right sum to .
	 * 
	 * You will be given arrays of integers and must determine whether there is an
	 * element that meets the criterion. If there is, return YES. Otherwise, return
	 * NO.
	 * 
	 * Function Description
	 * 
	 * Complete the balancedSums function in the editor below.
	 * 
	 * balancedSums has the following parameter(s):
	 * 
	 * int arr[n]: an array of integers Returns
	 * 
	 * string: either YES or NO Input Format
	 * 
	 * The first line contains , the number of test cases.
	 * 
	 * The next pairs of lines each represent a test case. - The first line contains
	 * , the number of elements in the array . - The second line contains
	 * space-separated integers where .
	 * 
	 * Constraints
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Sample Input 0
	 * 
	 * 2 3 1 2 3 4 1 2 3 3 Sample Output 0
	 * 
	 * NO YES Explanation 0
	 * 
	 * For the first test case, no such index exists. For the second test case, ,
	 * therefore index satisfies the given conditions.
	 * 
	 * Sample Input 1
	 * 
	 * 3 5 1 1 4 1 1 4 2 0 0 0 4 0 0 2 0 Sample Output 1
	 * 
	 * YES YES YES Explanation 1
	 * 
	 * In the first test case, is between two subarrays summing to . In the second
	 * case, is between two subarrays summing to . In the third case, is between two
	 * subarrays summing to .
	 */
    @Test
//	public void example1()
//	{
//		int[] array = {5,6,8,11};//YES
//		List<Integer> arr =new ArrayList<>();
//		for(int i=0;i<array.length;i++)
//		{
//			arr.add(array[i]);
//		}
//		System.out.println(balancedSums(arr));
//	}
//    @Test
	public void example2()
	{
		int[] array = {1,2,3};//NO
		List<Integer> arr =new ArrayList<>();
		for(int i=0;i<array.length;i++)
		{
			arr.add(array[i]);
		}
		System.out.println(balancedSums(arr));
	}
//    @Test
//	public void example3()
//	{
//		int[] array = {1,2,3,3};//YES
//		List<Integer> arr =new ArrayList<>();
//		for(int i=0;i<array.length;i++)
//		{
//			arr.add(array[i]);
//		}
//		System.out.println(balancedSums(arr));
////	}
//    @Test
//	public void example4()
//	{
//		int[] array = {1,1,4,1,1};//YES
//		List<Integer> arr =new ArrayList<>();
//		for(int i=0;i<array.length;i++)
//		{
//			arr.add(array[i]);
//		}
//		System.out.println(balancedSums(arr));
//
//	}
//    @Test
//	public void example5()
//	{
//		int[] array = {2,0,0,0};//YES
//		List<Integer> arr =new ArrayList<>();
//		for(int i=0;i<array.length;i++)
//		{
//			arr.add(array[i]);
//		}
//		System.out.println(balancedSums(arr));
//	}
//    @Test
//	public void example6()
//	{
//		int[] array = {0,0,2,0};//YES
//		List<Integer> arr =new ArrayList<>();
//		for(int i=0;i<array.length;i++)
//		{
//			arr.add(array[i]);
//		}
//		System.out.println(balancedSums(arr));
//		
//	}

	public static String balancedSums(List<Integer> arr) 
	{

		int[] array = new int[arr.size()];

		for(int i=0;i<arr.size();i++)
		{
			array[i]=arr.get(i);

		}
		
		System.out.println(Arrays.toString(array));
		int left=0,right=array.length-1;

		int leftSum=0,rightSUm=0;

		while(left<right)
		{
			if(leftSum<rightSUm || array[left]==0)
			{
				leftSum+=array[left++];
			}
			else if(leftSum>rightSUm || array[right]==0)
			{
				rightSUm+=array[right--];
			}
			leftSum+=array[left++];
			rightSUm+=array[right--];

		}
		if(leftSum==rightSUm) return "YES";

		else return "NO";

	}

}
