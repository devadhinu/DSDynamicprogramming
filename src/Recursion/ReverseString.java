package Recursion;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString {

	@Test
	public void example()
	{
		char[] s = {'h','e','l','l','o'};
		char[] output ={'o','l','l','e','h'};
		
		strReverse(s);
		
        Assert.assertEquals(s,output);
	}

	public void strReverse(char[] s )
	{
		int index=0;

		recursion(s,index);
		
        System.out.println(Arrays.toString(s));
	}

	void recursion(char[] s, int index) 
	{
		
		if(index>=s.length/2)
		{
			return;
		}
		char temp=s[index];
		s[index]=s[s.length-1-index];
		s[s.length-1-index]=temp;
	//	index++;
		
		recursion(s,index+1);
	   
	}	
}


