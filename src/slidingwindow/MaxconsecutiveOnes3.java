package slidingwindow;

public class MaxconsecutiveOnes3 {
	
    public int longestOnes(int[] nums, int k) 
    {
        int left = 0, right =0, max=0; // slow pointer
		for (right = 0; right < nums.length; right++) {
			if(nums[right] == 0) {
				k--; // decrement k --> flip zeros to ones !!
			}
			
			if(k < 0) {
				if(nums[left] == 0) { // move the left and reset the k
					k++;
				}
				left++;
			}
			max = Math.max(max, right-left+1);

		}
		System.out.println(max);
        return max;
    }

}
