package Practice;

import java.util.Arrays;

import org.junit.Test;

public class AddandconvertArray {
	
	@Test
	public void example()
	{
		
	}
	@Test
	public void example1()
	{
		int[] nums=  {2,3,4};//2
		int k=2;
        addarrayandSplit(nums);

	}
//
//	@Test
//	public void example2()
//	{
//		int[] nums=  {9};//2
//		int k=3;
//		System.out.println(addarrayandSplit(nums));
//
//	}
//	@Test
//	public void example3()
//	{
//		int[] nums=  {1};//2
//		int k=3;
//		System.out.println(addarrayandSplit(nums));
//	}
	

	private int[] addarrayandSplit(int[] nums) 
	{
		String str = new String();
		
//		for(int i=0;i<nums.length;i++)
//		{
//	     temp =temp.append(String.valueOf(nums[i]));
//		}
//		
//	    String s=temp.toString();
//		System.out.println(temp);
		
		for(int i = 0; i < nums.length; i++)
		{
			str+=nums[i]+"";
		}
		
		int converted =Integer.parseInt(str)+1;
		
		System.out.println(converted);
		
		int[] result = new int[str.length()];
		
		int index=str.length()-1;
		
		while(index>=0)
		{
			int placevalue=converted%10;
			
			converted=converted/10;
			
			result[index--]=placevalue;
		}
		
	System.out.println(Arrays.toString(result));
	return result;
	}


}
