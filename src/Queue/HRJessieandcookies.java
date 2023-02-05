package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.junit.Test;

public class HRJessieandcookies {
	
	@Test
	public void example()
	{
		int k=9;
		int[] arr= {2,7,3,6,4,6};
		List<Integer> A =new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			A.add(arr[i]);
		}
		System.out.println(cookies(k,A));
	}

	/*
	 * Pseudocode :
	 * 
	 * 1)The key idea is to use Queue so the manipulated items gets added in the
	 * queue in the order of insertion
	 * 
	 * 
	 */
	public static int cookies(int k, List<Integer> A) {
	    int[] array = new int[A.size()]; 
	    int temp=0;   
	    for(int i=0;i<A.size();i++)
	    {
	       array[i]=A.get(i); 
	    }
	    int count=0;
	   
	    Deque<Integer> dq =new ArrayDeque<>();
	    
	   for(int i=0;i<A.size();i++)
	   {
		   dq.push(A.get(i));
	   }
	   if(dq.peek()<k)
	   {
		   temp=1*dq.pop()+2*dq.pop();
		   dq.push(temp);
		   count++;
	   }
	   if(dq.peek()>=k)
	   {
		  count=count; 
	   }
	   else {
		   count=-1;
	   }
	    return count;
	    
	    }

	}

