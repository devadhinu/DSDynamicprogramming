package arraysBruteforce;

import org.junit.Test;

public class subArraysumdivisiblebyKBruteforce {


	/*
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 3 * 104 
	 * -104 <= nums[i] <= 104 
	 * 2 <= k <= 104
	 */

	@Test
	public void example1()
	{
		int[] nums=  {1,1,1};//2
		int k=2;
		System.out.println(subarraysDivByK(nums,k));
		//findNicesubarraycount(nums,k);

	}

	@Test
	public void example2()
	{
		int[] nums=  {1,2,3};//2
		int k=3;
		System.out.println(subarraysDivByK(nums,k));
		//findNicesubarraycount(nums,k);

	}

	public int subarraysDivByK(int[] nums, int k) {

		int count=0;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=0;
			for(int j=i;j<nums.length;j++)
			{

				sum+=nums[j];
				if(sum==k) count++;

			}

		}
		return count;
	}
}