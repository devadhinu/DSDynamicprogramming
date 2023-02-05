package Spotproblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

import org.junit.Test;

public class Multiplyonlyothernumbers {

	/*
	 * Write a function that takes in a non-empty array of Integers and returns an
	 * array of same length, where each element in the output array is equal to the
	 * product of other numbers in the input array.
	 * 
	 * IN other words ,the value at output[i] is equal to the product of every other
	 * number in the input array other than input[i]
	 * 
	 * Note thet , you are expected to solve this problem without using division.
	 */
	@Test
	public void example()
	{
		int[] arr = {5,1,4,2};
		findproductarray(arr);
	}

	public int[] findproductarray(int[] arr) 
	{
		Deque<Integer> dq =new ArrayDeque<>();

		int temp=1;
		int popped=0;
		int k=0;

		ArrayList<Integer> al =new ArrayList<>();
		int[] output = new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			dq.offer(arr[i]);

		}
		for(int i=0;i<arr.length;i++)
		{
			int pop =dq.pop();
			dq.push(pop);//5

			while(arr[i]!=dq.peek())
			{
				popped=dq.pop();
				dq.offer(popped);
				temp*=popped;
			}
		}
        
		al.add(temp);
		temp=1;
		System.out.println(al);
		System.out.println(Arrays.toString(output));
		return arr;


	}

}
