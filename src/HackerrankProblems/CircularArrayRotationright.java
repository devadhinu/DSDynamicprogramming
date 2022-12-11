package HackerrankProblems;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotationright {
	/*
	 * John Watson knows of an operation called a right circular rotation on an
	 * array of integers. One rotation operation moves the last array element to the
	 * first position and shifts all remaining elements right one. To test
	 * Sherlock's abilities, Watson provides Sherlock with an array of integers.
	 * Sherlock is to perform the rotation operation a number of times then
	 * determine the value of the element at a given position.
	 * 
	 * For each array, perform a number of right circular rotations and return the
	 * values of the elements at the given indices.
	 * https://www.hackerrank.com/challenges/circular-array-rotation/problem?h_r=
	 * internal-search
	 * 
	 * Sample Input 0
	 * 
	 * 3 2 3 1 2 3 0 1 2 Sample Output 0
	 * 
	 * 2 3 1
	 */

	public void example()
	{
		int[] arr = {3,2,3,1,2,3,0,1,2};
		List<Integer> a = new ArrayList<>();;
		for(int i=0;i<arr.length;i++)
		{
			a.get(arr[i]);
		}
	}
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) 
	{

		int input[] = new int[a.size()];
		for(int i=0;i<a.size();i++)
		{
			input[i] = a.get(i);
		}
		k = k%input.length;
		input = rightRotate(input,0,input.length-1);
		input = rightRotate(input,0,k-1);
		input = rightRotate(input,k,input.length-1);

		List<Integer> output = new ArrayList<>();
		for(int i=0;i<queries.size();i++)
		{
			output.add(input[queries.get(i)]);
		}

		return output;
	}

	public static int[] rightRotate(int[] input,int left,int right)
	{
		
		while(left<right)
		{
			int temp = input[left];
			input[left++] = input[right];
			input[right--] = temp;
		}
		return input;
	
	}
}

