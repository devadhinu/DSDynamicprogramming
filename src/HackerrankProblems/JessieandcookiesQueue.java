package HackerrankProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.Test;

public class JessieandcookiesQueue {
	@Test
	public void example()
	{
		int[] a = {2,7,3,6,4,6};
		int k =9;
		List<Integer> A = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			A.add(a[i]);
		}
		
		System.out.println(cookies(k,A));
		
	}
	//@Test
	public void example2()
	{
		int[] a = {1, 2, 3, 9, 10, 12};
		int k =7;
		List<Integer> A = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			A.add(a[i]);
		}
		System.out.println(cookies(k,A));
	}
	
	public static int cookies(int k, List<Integer> A) {
		
		
//		int[] array = new int[A.size()]; /time limit exceede for this solution
//	    int temp=0;   
//	    for(int i=0;i<A.size();i++)
//	    {
//	       array[i]=A.get(i); 
//	    }
//	    int count=0;
		
//	    ArrayList<Integer> al = new ArrayList<>();
//	    Deque<Integer> dq =new ArrayDeque<>();
		
//	    int left=0,right=1;
//	    while(left<array.length && right<array.length)
//	    {       
//	        if(array[left]<k )
//	        {
//	          temp=  1*array[left++]+2*array[right++];
//	          dq.push(temp);
//	          count++;
//	        }
//	    }
//	    while(left<array.length && right==array.length)
//	    {          
//	         if(array[left]<k)
//	        {
//	          if(dq.peek()<k)
//	          temp=  1*array[left++]+2*dq.peek();
//	          dq.push(temp);
//	          count++;
//	        }
//	        
//	    }
//	    return count;
		
		
		
	 int numCookies = A.size();
	    
	    int count = 0;
	    PriorityQueue<Integer> he = new PriorityQueue<Integer>(numCookies);
	    Collections.sort(A);
	    for(int i = 0; i < numCookies; i++){
	        int sweetness = A.get(i);
	        he.add(sweetness);
	    }
	    while(he.peek() < k && he.size() > 1) {
	        int modify = he.poll() + 2*he.poll();
	        
	        he.add(modify);
	        count++;
	    }
	    if(he.peek() >= k){
	        count = count;
	    } else {
	        count = -1;
	    }
	    return count;

}}
