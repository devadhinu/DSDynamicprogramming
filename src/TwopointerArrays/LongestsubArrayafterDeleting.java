package TwopointerArrays;

import org.junit.Test;

public class LongestsubArrayafterDeleting {
	
	
	 @Test
		public void edge1()
		{
			int[] nums= {1,1,0,1};//op:3
			int k=1; 
		System.out.println(findlongsubArrayafterDeleting(nums,k));

		}
	    @Test
		public void edge2()
		{
			int[] nums= {0,1,1,1,0,1,1,0,1};//op:5
			int k=1; 
		 //System.out.println(findlongsubArrayafterDeleting(nums,k));

		}	
		
		@Test
		public void edge3()
		{
			int[] nums= {1,1,1};//op:2
			int k=1; 
		// System.out.println(findlongsubArrayafterDeleting(nums,k));

		}	

		private int findlongsubArrayafterDeleting(int[] nums, int k) {
			int left=0,right=0;
			int max=0,maxones=0;
		   System.out.println("hi");
			
			
			if(right==nums.length-1 && k==1)return nums.length-1-k;
			while(right<nums.length)
			{
				if(nums[right]==0)k--;
				
				
				if(k<0)
				{
					if(nums[right]==0)left++;
				}
			    right++;	
				max=right-left-1;
				maxones=Math.max(maxones, max);
			}
			
			
			
			return maxones;
		
		
		}
}
