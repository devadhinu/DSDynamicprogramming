package TwoDimesionalArrays;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class Maximumunitsonatruck {
	/*
	 * 1710. Maximum Units on a Truck
	 * 
	 * You are assigned to put some amount of boxes onto one truck. You are given a
	 * 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi,
	 * numberOfUnitsPerBoxi]:
	 * 
	 * numberOfBoxesi is the number of boxes of type i. numberOfUnitsPerBoxi is the
	 * number of units in each box of the type i. You are also given an integer
	 * truckSize, which is the maximum number of boxes that can be put on the truck.
	 * You can choose any boxes to put on the truck as long as the number of boxes
	 * does not exceed truckSize.
	 * 
	 * Return the maximum total number of units that can be put on the truck.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4 Output: 8 Explanation:
	 * There are: - 1 box of the first type that contains 3 units. - 2 boxes of the
	 * second type that contain 2 units each. - 3 boxes of the third type that
	 * contain 1 unit each. You can take all the boxes of the first and second
	 * types, and one box of the third type. The total number of units will be = (1
	 * * 3) + (2 * 2) + (1 * 1) = 8. Example 2:
	 * 
	 * Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10 Output: 91
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= boxTypes.length <= 1000 1 <= numberOfBoxesi, numberOfUnitsPerBoxi <=
	 * 1000 1 <= truckSize <= 106
	 */
	@Test
	public void example()
	{
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize=10;
		maximumUnits(boxTypes,truckSize);
		
	}
	@Test
	public void example2()
	{
		int[][] boxTypes = {{4,2},{5,5},{4,1},{1,4},{2,5},{1,3},{5,3},{1,5},{5,5},{1,1}};
		int truckSize=24;
		maximumUnits(boxTypes,truckSize);
		
		//op : 95
		
	}
	
	/*
	 * Pseudocode:
	 * ========== 
	 * 1)boxTypes[i] = [numberOfBoxesi,numberOfUnitsPerBoxi]
	 * 2)Given the truck size which can accomodate a total
	 * 3)Find the first index position in the subarray which will be the no of boxes which can sum up to to total truck size
	 * 4)Now sum the boxTypes[left][0],boxTypes[1][0],boxTypes[2][0]
	 * 5)The sum of all if it meets the truck size , we will have the total no of units
	 * 6)If rhe sum exceeds the truck capacity , find how much has exceeded in total
	 * 7)totalsum- trucksize will give how much extra is there in the totalsum
	 * 8)Now, the extra (min) can be reduced from the numberOfBoxesi(boxTypes[left][0]-min)
	 * 9)so when the product of current box(reduced to match truck capacity) * units per box can give the exact value to be returned.
	 * 
	 */
	
	 public int maximumUnits(int[][] boxTypes, int truckSize) 
	 {
		 int sum=0;
			int min=0;
			int result=0;
			
		//to sort in ascending  order
		//	Arrays.sort(boxTypes,(i,j)->Integer.compare(i[1],j[1]));
			
			
			//to sort in descending order
			Arrays.sort(boxTypes,(i,j)->Integer.compare(j[1],i[1]));
			
	//after sorting	[5, 5], [2, 5], [1, 5], [5, 5], [1, 4], [1, 3], [5, 3], [4, 2], [4, 1], [1, 1]]		
//			0,0| 0,1
//			[5,  5]
//			
			System.out.println(Arrays.deepToString(boxTypes));
			 
			 for(int left=0;left<boxTypes.length;left++)
			 {
				 sum+=boxTypes[left][0];
				 
				 if(sum<=truckSize)result+=(boxTypes[left][0])*(boxTypes[left][1]);
				 
				 else if(sum>truckSize)
				 {
					 min=sum-truckSize;
	                 int reducedVal =boxTypes[left][0]-min;
					 result+=(boxTypes[left][1])*reducedVal;
					 break;
				 }
			 }

	     	System.out.println(result);
			return result;


	        
	        
	    }

}
