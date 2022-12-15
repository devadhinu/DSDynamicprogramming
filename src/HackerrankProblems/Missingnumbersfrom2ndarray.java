package HackerrankProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Missingnumbersfrom2ndarray {

	/*
	 * Given two arrays of integers, find which elements in the second array are
	 * missing from the first array.
	 * 
	 * Example
	 * 
	 * 
	 * The array is the orginal list. The numbers missing are .
	 * 
	 * 
	 * If a number occurs multiple times in the lists, you must ensure that the
	 * frequency of that number in both lists is the same. If that is not the case,
	 * then it is also a missing number. Return the missing numbers sorted
	 * ascending. Only include a missing number once, even if it is missing multiple
	 * times. The difference between the maximum and minimum numbers in the original
	 * list is less than or equal to . Function Description
	 * 
	 * Complete the missingNumbers function in the editor below. It should return a
	 * sorted array of missing numbers.
	 * 
	 * missingNumbers has the following parameter(s):
	 * 
	 * int arr[n]: the array with missing numbers int brr[m]: the original array of
	 * numbers Returns
	 * 
	 * int[]: an array of integers Input Format
	 * 
	 * There will be four lines of input:
	 * 
	 * - the size of the first list, The next line contains space-separated integers
	 * - the size of the second list, The next line contains space-separated
	 * integers
	 * 
	 * Constraints
	 * 
	 * Sample Input
	 * 
	 * 10 203 204 205 206 207 208 203 204 205 206 13 203 204 204 205 206 207 205 208
	 * 203 206 205 206 204 Sample Output
	 * 
	 * 204 205 206 Explanation
	 * 
	 * is present in both arrays. Its frequency in is , while its frequency in is .
	 * Similarly, and occur twice in , but three times in . The rest of the numbers
	 * have the same frequencies in both lists.
	 */
	
	/*
	 * Pseudocode: 
	 * 1)Create two arrays of like ascii type with max constraintv
	 * length 10000 
	 * 2)Iterate through the list and add the elements of the list in
	 * the index which is equivalent to the element and increment its occurence from
	 * 0 to ++ 
	 * 3) Later in a loop iterate throuhg the size of the other arrays created.
	 * 4)and compare the ith position in each of the arrays to find the
	 * missing elemet from ither array
	 *  5)add the index(nothing but the element) to a 
	 * 
	 */
	@Test
	public void example()
	{
		int[] a = {203,204,205,206,207,208,203,204,205,206};
		int[] b = {203,204,204,205,206,207,205,208,203,206,205,206,204};

		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<a.length;i++)arr.add(a[i]);
		List<Integer> brr = new ArrayList<>();
		for(int i=0;i<b.length;i++)brr.add(b[i]);

		System.out.println(missingNumbers(arr,brr));
	}


	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) 
	{
		List<Integer> res=new ArrayList<>();
		int arr1[]=new int[10000];
		int arr2[]=new int[10000];
		
		for(int i=0;i<arr.size();i++)
		{
			arr1[arr.get(i)]++;
		}
		
		for(int i=0;i<brr.size();i++)
		{
			arr2[brr.get(i)]++;
		}
		
		for(int i=0;i<10000;i++){
			if(arr1[i]!=arr2[i]){
				res.add(i);
			}
		}
		return res;


	}

}
