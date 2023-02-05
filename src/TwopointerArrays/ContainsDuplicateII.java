package TwopointerArrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class ContainsDuplicateII {

	/*
	 * 219. Contains Duplicate II
	 * 
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1], k = 3 Output: true 
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true 
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 * 
	 * 
	 * Constraints:

           1 <= nums.length <= 105
           -109 <= nums[i] <= 109
           0 <= k <= 105
	 */
    @Test
	public void positive1()
	{
		int[] nums = {1,2,3,1,3,5,6,2,3,3};
		int k=2; //true
		containsNearbyDuplicate(nums,k);
	}

	public void positive2()
	{
		int[] nums = {1,0,1,1};
		int k=1; //true
	}

	public void positive3()
	{
		int[] nums = {1,2,3,1,2,3};
		int k=2; //false
	}
	
	
    
//	Next question
//	220. Contains Duplicate III
//	More challenges
//	217. Contains Duplicate
//	220. Contains Duplicate III
	
	/*
	 * Pseudocde : ------------ 1)Create a map and iterate through the array values
	 * 2)Make a condition check whether the value is already present in the map 3)If
	 * present , subtract the current array value index -map value 4)verify whether
	 * it is lesser than k 5)else enter in hshmap
	 */
	
	//Map solution
	  public boolean containsNearbyDuplicateoptimised(int[] nums, int k) 
	  {
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for (int i = 0; i < nums.length; i++) 
		    {
		        if (map.containsKey(nums[i])) 
		        {
		            if (i - map.get(nums[i]) <= k) return true;
		        }
		        map.put(nums[i], i);
		    }
		    return false;
	  }
	  

		/*
		 * Peseudocode :
		 * 
		 * 1)With the constraint mentioned above  starts from 0 
		 * 2)if k=2 , it means k starts from 0,1,2
		 * 3)So , if there are two identical /duplicate nos in the k window size return true
		 * 4)Else return false
		 * 5) Create a HashSet
		 * 6) If the element cannot be added in hashset ,thats there is a duplicate element within the window size
		 * 7) If duplicates found return true else return false/.
		 * 
		 * 
		 */
	
	//Sliding window using set
	private boolean containsNearbyDuplicate(int[] nums, int k) 
	{
		 int left=0;
		   
	        HashSet<Integer> hs =new HashSet<>();
	        if(nums.length==1)return false;
	        if(nums.length==2)
	        {
	            return nums[0]==nums[1];
	        }
	      
	        if(k>nums.length) k=nums.length;  // or k=k%nums.length; both does the same k value
	      //{1,2,3,1,3,5,6,2,3,3};
	        
	        while(left<=k)
	        {
	          if(!hs.add(nums[left]))return true;
	          left++;
	        } 
	            
	        while(left<nums.length)
	        {
	         hs.remove(nums[left-k-1]);
	         if(!hs.add(nums[left++]))return true;
	        }          
			 return false;

	}
}
