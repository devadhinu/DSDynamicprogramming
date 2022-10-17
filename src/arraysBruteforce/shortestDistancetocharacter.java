package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class shortestDistancetocharacter {

	@Test
	public void example1()
	{
		String s="loveleetcode";
		char c ='e';
		System.out.println(shortestToChar(s,c));
		shortestToChar(s,c);
		// o/p: [3,2,1,0,1,0,0,1,2,2,1,0]
	}

	@Test
	public void example2()
	{
		int[] nums= {0};	
	}

	@Test
	public void example3()
	{

	}
	public int[] shortestToChar(String s, char c)
	{
		int left=0,right=0,i=0;
		int min =Integer.MAX_VALUE;
		
        int[] answer =new int[s.length()];
       
		while(right<s.length()&&i<answer.length)
		{
			char leftchar =s.charAt(left);
			char rightchar=s.charAt(right);
			
			if(leftchar==c && rightchar==c)
				{
				answer[left++]=right-left;
				right++;
				left++;
				}
			else if(rightchar!=c)right++;
			else if(rightchar==c)
			{
				answer[left++]=right-left;
				left++;	
			}	
			
		
		}
		System.out.println(Arrays.toString(answer));//[3,2,1,0,1,0,0,1,2,2,1,0]
		return answer;

	}
}
