package slidingwindow;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindMaxelementinaksizeWindow {

	//	You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
	//
	//	Return the max sliding window.
	//
	//	 
	//
	//	Example 1:
	//
	//	Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
	//	Output: [3,3,5,5,6,7]
	//	Explanation: 
	//	Window position                Max
	//	---------------               -----
	//	[1  3  -1] -3  5  3  6  7       3
	//	 1 [3  -1  -3] 5  3  6  7       3
	//	 1  3 [-1  -3  5] 3  6  7       5
	//	 1  3  -1 [-3  5  3] 6  7       5
	//	 1  3  -1  -3 [5  3  6] 7       6
	//	 1  3  -1  -3  5 [3  6  7]      7
	//	Example 2:
	//
	//	Input: nums = [1], k = 1
	//	Output: [1]
	//	 
	//
	//	Constraints:
	//
	//	1 <= nums.length <= 105
	//	-104 <= nums[i] <= 104
	//	1 <= k <= nums.length
	//	
	@Test
	public void example()
	{
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		System.out.println(findmax(nums,k));
		
		//3 3 5 5 6 7 
	}

//time limit exceeded for higher inputs
	
	public List<Integer> findmax(int[] nums,int k)
	{
		int left =0;
		int right=0;
		int max=Integer.MIN_VALUE;
		ArrayList<Integer> al = new ArrayList<>();
		while(right<nums.length)
		{
			max=Math.max(nums[right], max);

			right++;
			
			if(right-left==k)
			{
				left++;
				al.add(max);
				max=Integer.MIN_VALUE;
				right=left;
			}
		}
        
		return al;
	}

}


