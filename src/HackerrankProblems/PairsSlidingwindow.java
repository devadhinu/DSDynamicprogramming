package HackerrankProblems;

import java.util.Arrays;

import org.junit.Test;

public class PairsSlidingwindow {

	/*
	 * Given an array of integers and a target value, determine the number of pairs
	 * of array elements that have a difference equal to the target value.
	 * 
	 * Example
	 * 
	 * 
	 * There are three values that differ by : , , and . Return .
	 * 
	 * Function Description
	 * 
	 * Complete the pairs function below.
	 * 
	 * pairs has the following parameter(s):
	 * 
	 * int k: an integer, the target difference int arr[n]: an array of integers
	 * Returns
	 * 
	 * int: the number of pairs that satisfy the criterion Input Format
	 * 
	 * The first line contains two space-separated integers and , the size of and
	 * the target value. The second line contains space-separated integers of the
	 * array .
	 * 
	 * Constraints
	 * 
	 * each integer will be unique Sample Input
	 * 
	 * STDIN Function ----- -------- 5 2 arr[] size n = 5, k =2 1 5 3 4 2 arr = [1,
	 * 5, 3, 4, 2] Sample Output
	 * 
	 * 3 Explanation
	 * 
	 * There are 3 pairs of integers in the set with a difference of 2: [5,3], [4,2]
	 * and [3,1]. .
	 */
	@Test
	public void example()
	{
		int[] arr = {1, 5, 3, 4, 2};
		int k=2;
		//op : 3
		System.out.println(pairs(k,arr));
	}

	public  int pairs(int k, int[] arr) {
		
		int count=0;
		int left=0,right=1;

		int n=arr.length;
		int diff=0;
		Arrays.sort(arr);
		
		while(right<n)
		{
			diff=arr[right]-arr[left];
			if(diff<k)
			{
			right++;	
			}
			else if(diff>k)
			{
				left++;
				right=left+1;
			}
			if(diff==k)
				{
				count++;
				right++;
				}
		}
		
		return count;
	

	}

}
