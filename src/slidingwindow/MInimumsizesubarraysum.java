package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MInimumsizesubarraysum {
	@Test
	public void example1()
	{
		int[] nums = {2,3,1,2,4,3};
		int target =7;
		System.out.println(findminsizesubArray(nums,target));
	}
	@Test
	public void example2()
	{
		int[] nums = {1,4,4};
		int target =4;
		System.out.println(findminsizesubArray(nums,target));
	}
	
	@Test
	public void example3()
	{
		int[] nums = {1,1,1,1,1,1,1,1};
		int target =11;
		System.out.println(findminsizesubArray(nums,target));
	}
	public int findminsizesubArray(int[] nums, int target)
	{
		int i=0;
		int left=0,right=1;
		int sum=0;
		int[] result = null;
		int count=1;
		
			
		int[] numsdesc = Arrays.stream(nums).boxed()
			    .sorted(Collections.reverseOrder())
			    .mapToInt(Integer::intValue)
			    .toArray();
		while(right<numsdesc.length)
		{	
			if(sum<target)
			{
			sum+=numsdesc[left++]+numsdesc[right++];			
			count++;
			}
			else if(sum==target)break;
			else if(numsdesc[left]==target)return 1;
			
		}	
		
		return count;
		

}
}