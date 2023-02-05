package TwopointerArrays;

import java.util.Arrays;

import org.junit.Test;

public class MergedsortedArray {

	/*
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	 * order, and two integers m and n, representing the number of elements in nums1
	 * and nums2 respectively. Merge nums1 and nums2 into a single array sorted in
	 * non-decreasing order. The final sorted array should not be returned by the
	 * function, but instead be stored inside the array nums1. To accommodate this,
	 * nums1 has a length of m + n, where the first m elements denote the elements
	 * that should be merged, and the last n elements are set to 0 and should be
	 * ignored. nums2 has a length of n. 
	 * Example:
	 *  Input: nums1 = [1,2,3,0,0,0], 
	 *   m =3, nums2 = [2,5,6], n = 3 
	 * Output: [1,2,2,3,5,6] 
	 * Explanation: The arrays we
	 *are merging are [1,2,3] and [2,5,6]. The result of the merge is [1,2,2,3,5,6]
	 * with the underlined elements coming from nums1.
	 * 
	 * Constraints:
	 *  ============ 
	 *  nums1.length == m + n 
	 *  nums2.length == n 
	 *  0 <= m,n<= 200 
	 *  1 <= m + n <= 200 -109 <= nums1[i], 
	 *  nums2[j] <= 109 
	 *  
	 * 
	 * Pseudocode:
	 * ========== 
	 * 1) Two sorted arrays of diff length has to be merged , so take two pointers left and right
	 * 2) Take a copy of the array to be returned nums1[] as as newArray[]
	 * 3) If the pointer left of nums1[] reaches the size 3(m) , then copy the nums2 array elements into nums1
	 * 4) If the pointer left of nums2[] reaches the size 3(n) , then copy the newArray(copy of nums1) array elements into nums1
	 * 5) compare newArray[left]and nums2[right] and fill the nums1[] with the value of whichever is least 
	 * 6)return nums1[]
	 */


	@Test
	public void example()
	{
		int[] nums1 = {1,2,5,0,0,0};
		int m = 3; 
		int n = 3;
		int[] nums2 = {2,3,6};	

		arraymerge(nums1,nums2,m,n);
	}

	/*
	 * Pseudocode: 
	 * 1)Create a newArray taking the reference of first array nums1
	 * with length m 
	 * 2)Iterate through the two arrays with or condition on while
	 * till the length of the two array sizes 
	 * 3)Use pointer for new Arrays and left for nums1,right for nums2
	 * 4)If pointer length meet m , copy nums2 into nums1(the result array)
	 * 5)If right meets n, copy pointerArr into nums1(the result array)
	 * 6)
	 * 
	 */
	private int[] arraymerge(int[] nums1, int[] nums2, int m, int n)
	{
		int left=0,right=0;
		int pointer=0;
		int[] newArray = Arrays.copyOf(nums1, m);

		while(left<m || right<n)
		{
			if(pointer==m)nums1[left++]=nums2[right++];
			else if(right==n)nums1[left++]=newArray[pointer++];
			else if(newArray[pointer]<=nums2[right])
			{
				nums1[left++]=newArray[pointer++];
			}
			else 
			{
				nums1[left++]=nums2[right++];
			}
		}
		System.out.println(Arrays.toString(nums1));
		return nums1;

		
		

	}



}
