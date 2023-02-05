import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import TwopointerArrays.LeftRotation;

public class AllStringPermutations 
{
	@Test
	public void example()
	{
		String s ="greek";
		int l = s.length()-1;
		char[] chararray= s.toCharArray();

		System.out.println(permute(chararray, 0, l));
	}

	public static List<String> permute(char[] chararray, int startIndex, int endIndex) 
	{
		if(startIndex == endIndex)
		{
			return (String.valueOf(chararray));
		}
		else
		{
			for(int i=startIndex;i<=endIndex;i++) 
			{
				swap(chararray, startIndex, i );
				permute(chararray, startIndex+1, endIndex);
				swap(chararray, startIndex, i );
			}
		}
		return Arrays.asList(output);


	}
	public static char[] swap(char[] chararray, int x, int y)
	{

		char temp = chararray[x];
		chararray[x] = chararray[y];
		chararray[y] = temp;

		return chararray;
	}

}
