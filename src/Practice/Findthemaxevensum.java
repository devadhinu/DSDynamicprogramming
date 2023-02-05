package Practice;

import org.junit.Test;

public class Findthemaxevensum {

//	@Test
//	public void example()
//	{
//		int[] val= {2,3,6,-5,10,1,1};
//
//		System.out.println(findmaxSum(val));
//	}
	@Test
	public void example2()
	{
		int[] val= {-1,1,4,10};

		System.out.println(findmaxSum(val));
	}
	@Test
	public void example3()
	{
		int[] val= {-1,-1,7,4,10};

		System.out.println(findmaxSum(val));
	}
	@Test
	public void example4()
	{
		int[] val= {-1,-2,-3,1,4,10};

		System.out.println(findmaxSum(val));
	}
	@Test
	public void example5()
	{
		int[] val= {-1,1,-3,4,10};

		System.out.println(findmaxSum(val));
	}

	public int findmaxSum(int[] val)
	{
		int currsum = 0;
		int prevsum=0;
		int maxsum=Integer.MIN_VALUE;

		for (int i=0; i < val.length; i++) 
		{
			currsum += val[i];
			if(prevsum>currsum)
			{
				currsum= currsum-val[i];
			}
			prevsum=currsum;

			if (currsum % 2 == 0) 
			{
				maxsum=  Math.max(currsum, maxsum);

			}
		}
		return maxsum;


	}

}
