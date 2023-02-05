package TwoDimesionalArrays;

import java.util.Arrays;

import org.junit.Test;

public class MinPlatformsHackerEarth 
{
    @Test
	public void example()
	{
		int[] arrival =  {219,0255,0051,449};
		int[] departure= {954,0355,1049,0633};
	}
    @Test
	public void example2()
	{

		int[] arrTime = {219,0255,0051,0449};			
		int[] depTime = {0959,0355,1049,0633};	

	}			

	//      train[][]{{0219,0959},{0255,0355},{0051,1049},{0449,0633}}	

	//      train[0][0]	{{0219,0959},train[0][1]
	//		train[1][0]	{0255,0355}	train[1][1]
	//		train[2][0]	{0051,1049}	train[2][1]
	//		train[3][0]	{0449,0633}	train[3][1]


	private int minimumPlatforms(int[] arrTime, int[] depTime)
	{


		int n = arrTime.length;
		int[][] train = new int[n][2];

		for(int i=0;i<n-1;i++)
		{
			train[i][0] = arrTime[i];
			train[i][1] = depTime[i];
		}

		Arrays.sort(train,(a,b) ->Integer.compare(a[0], b[0]));

		int counter=0;

		for(int i=0;i<train.length-1;i++)
		{
			if(train[i][1]>=train[i][0])
			{
				counter++;
			}
			else
			{
				if(train[i][1]>train[i][0])counter=counter;
			}
			
		}
		return counter;
	}

}
