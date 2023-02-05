import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void example()
	{
		int[] arr= {1268,8421};
		findOccurence(arr);
	}
	
	/*
	 * Pseudocode: 
	 * 1)Iterate through the array element 
	 * 2)Convert the integer element to string and then have it stored in array or in a string variable
	 * 3)Let me traverse through the string value
	 * 4)use a hashap to go through the each value and capture its occurence
	 *  5)print the occurnce traversing through the
	 * entrySet of the hashMap
	 */
	public void findOccurence(int[] arr)
	{
		StringBuilder sb = new StringBuilder();
		String s="";
		HashMap<Character,Integer> hm = new HashMap();
		for(int i=0;i<arr.length;i++)
		{
		   sb=sb.append(arr[i]);
		}
		
		//	int[] arr= {1268,8421};
		s=sb.toString();
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}
}
