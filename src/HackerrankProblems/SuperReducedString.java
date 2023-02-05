package HackerrankProblems;

import org.junit.Test;

public class SuperReducedString 
{
    @Test
	public void example()
	{
		String s ="aaabccddda";
        System.out.println(superReducedString(s));		
	}
	public String superReducedString(String s) 
	{

		int left=0;
		int right=1;
		int count=1;
		char[] arr= s.toCharArray();
		StringBuilder sb = new StringBuilder();

		while(left<arr.length-1)
		{
		
			if(arr[left]==arr[right])
			{
				count++;
				right++;
			}
			if(arr[left]!=arr[right])
			{
				if(count%2!=0)
				{
					sb=sb.append(arr[left]);
				}
				left=right;
				right++;
				count=1;
			if(left==arr.length-1)	sb=sb.append(arr[left]);

			}
			
			
		}
		return sb.toString();




	}
}
