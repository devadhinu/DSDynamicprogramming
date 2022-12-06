package StringASCII;

import org.junit.Test;

public class circularprinter 
{
	/*
	 * Circular Array Rotation
	 * 
	 * John Watson knows of an operation called a right circular rotation on an
	 * array of integers. One rotation operation moves the last array element to the
	 * first position and shifts all remaining elements right one. To test
	 * Sherlock's abilities, Watson provides Sherlock with an array of integers.
	 * Sherlock is to perform the rotation operation a number of times then
	 * determine the value of the element at a given position.
	 * 
	 * For each array, perform a number of right circular rotations and return the
	 * values of the elements at the given indices.
	 * 
	 * Example
	 * 
	 * 
	 * 
	 * Here is the number of rotations on , and holds the list of indices to report.
	 * First we perform the two rotations:
	 * 
	 * Now return the values from the zero-based indices and as indicated in the
	 * array.
	 * 
	 * 
	 * Function Description
	 * 
	 * Complete the circularArrayRotation function in the editor below.
	 * 
	 * circularArrayRotation has the following parameter(s):
	 * 
	 * int a[n]: the array to rotate int k: the rotation count int queries[1]: the
	 * indices to report Returns
	 * 
	 * int[q]: the values in the rotated as requested in Input Format
	 * 
	 * The first line contains space-separated integers, , , and , the number of
	 * elements in the integer array, the rotation count and the number of queries.
	 * The second line contains space-separated integers, where each integer
	 * describes array element (where ). Each of the subsequent lines contains a
	 * single integer, , an index of an element in to return.
	 * 
	 * Constraints
	 * 
	 * Sample Input 0
	 * 
	 * 3 2 3 1 2 3 0 1 2 Sample Output 0
	 * 
	 * 2 3 1 Explanation 0
	 * 
	 * After the first rotation, the array is [3,1,2]. After the second (and final)
	 * rotation, the array is [2,3,1].
	 * 
	 * We will call this final state array b=[2,3,1]. For each query, we just have
	 * to get the value of b[queries[i]]
	 * 
	 * queries[0]=0,b[0]=2; queries[1]=1,b[1]=3; queries[2]=2,b[2]=1;
	 */

	@Test
	public void example()
	{
		String str ="ZNMD";
		circularprintlength(str); //op: 19
	}

	public  int circularprintlength(String str) 
	{

		int diff=0;
		int sum=0;

		char[] ch =str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0) diff=ch[i]-'a';

			else 
			{
				diff=ch[i]-ch[i-1];
			}
			if(diff>13)
			{
				diff=26-ch[i];
			}
			sum+=diff;
		}

		return sum;


	}

}
