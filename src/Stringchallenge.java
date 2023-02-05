import java.util.Arrays;

import org.junit.Test;

public class Stringchallenge {
	@Test
	public void example()
	{
		String str1="cdoer";
		String str2="coder";
		System.out.println(compare(str1,str2));
	}
//	@Test
//	public void example2()
//	{
//		String str1="h3llko";
//		String str2="hello";
//		System.out.println(compare(str1,str2));
//	}
//	
//	@Test
//	public void example3()
//	{
//		String str1="rkqodlw";
//		String str2="world";
//		System.out.println(compare(str1,str2));
//	}
//	
	public boolean compare(String str1,String str2)
	{
		
		int[] asci1= new int[26];
		int[] asci2= new int[26];
		
		for(int i=0;i<str1.length();i++)
		{
			asci1[str1.charAt(i)-'a']++;
		}
		for(int j=0;j<str2.length();j++)
		{
			asci2[str2.charAt(j)]++;
		}
		return false;

	}

}
