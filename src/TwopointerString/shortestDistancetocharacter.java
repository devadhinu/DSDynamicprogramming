package TwopointerString;

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
		String s="";
		char c ='e';	
	}

	@Test
	public void example3()
	{
		String s="eloveleetocde";
		char c ='e';	
	}
	public int[] shortestToChar(String s, char c)
	{
		int left=0,right=0,i=0;
		int min =Integer.MAX_VALUE;

		int[] answer =new int[s.length()];
		
	
		while(i<answer.length) 
		{
			while(right<s.length())
			{
				if(s.charAt(left)==c && s.charAt(right)==c)
				{
					answer[i++]=right-left;
					right++;
					left++;
				}
				else if(s.charAt(right)!=c)right++;
				else if(s.charAt(right)==c)
				{
					answer[i++]=right-left;
					left++;	
				}	

			}	
			left=right=i=answer.length-1;
			System.out.println("left"+left+"right"+right);

		while(left>=0)
			{

				//char leftchar =s.charAt(left);
				//char rightchar=s.charAt(right);
				//i=answer.length;
				if(s.charAt(left)==c && s.charAt(right)==c)
				{
					answer[i--]=Math.min(Math.abs(left-right),answer[i]);
					right--;
					left--;
				}
				else if(s.charAt(left)!=c)right--;
				else if(s.charAt(left)==c)
				{
					answer[i--]=Math.min(Math.abs(left-right),answer[i]);
					left--;	
				}	


				//}		
				//[3,2,1,0,1,0,0,1,2,2,1,0]
			    //[3, 2, 1, 0, 1, 0, 0, 4, 3, 2, 1, 0]

			}

		}
		System.out.println(Arrays.toString(answer));
		return answer;	
	}
}