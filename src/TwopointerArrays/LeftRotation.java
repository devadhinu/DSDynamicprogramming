package TwopointerArrays;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
/*
Arrays: Left Rotation (HACKERANK)

A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below.

rotLeft has the following parameter(s):

int a[n]: the array to rotate
int d: the number of rotations
Returns

int a'[n]: the rotated array
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations.
The second line contains  space-separated integers, each an .

Constraints

1<=n<=10^5
1<=d<=n
1<=a[i]<=10^6*/

public class LeftRotation {
	
	@Test
	public void example()
	{
		int d=2;
		Integer[] no={1,2,3,4,5};
		List<Integer> a =Arrays.asList(no);
		System.out.println(rotLeft(a,d));
	}

	public static List<Integer> rotLeft(List<Integer> a, int d) 
	{
		Integer[] array=new Integer[a.size()];
		a.toArray(array);
		Integer[] output = new Integer[array.length];

		int n =array.length;
		
		System.out.println(n);
		System.out.println(Arrays.toString(array));
		LeftRotation res=new LeftRotation();

		output= res.rotate(array, 0 ,n-1);
		output=res.rotate(array, 0 ,n-d-1);
		output=res.rotate(array, n-d ,n-1);

		return Arrays.asList(output);


	}
	public Integer[] rotate(Integer[] array, int left,int right)
	{

		while(left<right)
		{
			int temp =array[left];
			array[left++] =array[right];
			array[right--]=temp;
		}
		return array;
	}
}


