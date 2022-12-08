package TwoDimesionalArrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Meetingroom_couldattend {
	/*
	 * PROBLEM STATEMENT
	 * 
	 * Given an array of meeting time intervals consisting of start and end times
	 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all
	 * meetings. 
	 * 
	 * Example 1: Input: [[0,30],[5,10],[15,20]] 
	 * 
	 * Output: false
	 * 
	 * Example 2:
	 * Input: [[7,10],[2,4]] 
	 * 
	 * Output: true
	 */

	@Test
	public void negative() {
		//Negative Test Data
		int[][] nums = {{0,30},{5,10},{15,20}};
		boolean output = false;
		Assert.assertEquals(meetings(nums), output);
	}

	@Test
	public void example2() {
		//Edge Case Test Data
		int[][] nums = {{1,2}};
		boolean output = true;
		Assert.assertEquals(meetings(nums), output);
	}

	@Test
	public void example3() {
		//Edge Case Test Data
		int[][] nums = {{1,2},{2,4}};
		boolean output = false;
		Assert.assertEquals(meetings(nums), output);
	}

	@Test
	public void positive() {
		//Positive Test Data
		int[][] nums = {{7,10},{2,4}};
		boolean output = true;
		Assert.assertEquals(meetings(nums), output);
	}
	
//	Pseudocode:
//    ===========		
//	  1)To identify whether the person can attend meeting
//    2)Check the first meeting end time falls after the second meeting start time
//    3)If there is no conflict return true
//    4)Sort the Array to find the first meeting and other meeting order
//
//     L        R
//	 a[0][0]  a[0][1] 
//   	0	    30
//   a[1][0]  a[1][1]
//	    5	    10
//   a[2][0]  a[2][1]
//      15      20

	public boolean meetings(int[][] nums) 
	{
		Arrays.sort(nums);
		int left=0,right=1;
		while(right<nums.length-1)
		{
			if(nums[left][1] >= nums[right][0])
			{
				left++;
				right--;
				return false;
			}
		}
		return true;

	}

}
