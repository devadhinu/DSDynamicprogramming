package TwopointerArrays;

import java.lang.*;
import java.util.ArrayList;

import org.junit.Test;

public class RemoveLastElement 
{
	@Test
	public void example()
	{

		int[] arr= {0,1,2,3,4,5,6,7,8,9};

	//.out.println(findfib(arr));

	}
	
	@Test
	public void example1()
	{

		int[] arr= {1,2,3,4,5};

		System.out.println(findfib(arr));

	}


	private int findfib(int[] arr) 
	{

		ArrayList<Integer> al =new ArrayList<Integer>();

		int  left=0;
		int sum=0;
		int j=0;

		for(int i=0;i<arr.length;i++)
		{
          al.add(arr[i]);
		}
         while(left%2==0 && al.size()>1)
			{
        	    int temp=al.get(left);
				sum+= al.remove(temp);
				left++;
			}

		return sum;
	}	


}


