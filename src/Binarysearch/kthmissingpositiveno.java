package Binarysearch;

public class kthmissingpositiveno {
	
	/*
	 * 1539. Kth Missing Positive Number
	 * 
	 * Given an array arr of positive integers sorted in a strictly increasing
	 * order, and an integer k.
	 * 
	 * Return the kth positive integer that is missing from this array.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [2,3,4,7,11], k = 5 Output: 9 Explanation: The missing positive
	 * integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
	 * Example 2:
	 * 
	 * Input: arr = [1,2,3,4], k = 2 Output: 6 Explanation: The missing positive
	 * integers are [5,6,7,...]. The 2nd missing positive integer is 6.
	 * 
	 * pseudocode : 1)Find the mid of the target 2)If the mid of the target is less
	 * than the k position 3)find the missing elements in the left hand side ,put in
	 * a new array 4)If the mid of the element is missing 5)
	 */

	public findMissingindex(int k,int[] arr)
	{

	int[] output = new int[arr.length()];

	 while (left<=right)
		        {
	                  int left =0,right=arr.length-1;

		            int  mid = (left+right)/2; ->2 
		            
		            if(mid>target)
		            {
	                  mid =temp;
	                  leftmiss=nums[temp]-(nums[temp-1]);
	                  if(nums[left]==leftmiss)temp--;
	                  else
	                  {
	                    output[left]=leftmiss;
	                  }

		            }
		            else if(mid<target)
		            {
	                  mid =temp;
	                  rightmiss=nums[temp]+1;
	                  if(nums[right]==rightmiss)temp++;
	                  else
	                  {
	                    output[i++]=rightmiss;
	                  }
	                 if(i==5)  result=output[i];
		               
	                  
		        }
		       return result;

	}

}
