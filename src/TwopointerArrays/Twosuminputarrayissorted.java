package TwopointerArrays;

public class Twosuminputarrayissorted {
	
	 public int[] twoSum(int[] numbers, int target) {
	        
	        // pesudocode :
	        // 1)Use two pointers and move the pointers 
	        // 2)use one slow pointer and one fast pointer
	        // 3)Mve the fast pointer till the end
	        // 4)COntinue adding the elements till it matches target
	        // 5) Return the indeices which matches the target in a array
	        
	        
	        int left =0, right=left+1;
	        int sum=0;
	        int i=0;
	        int[] result= new int[2];
	        for(left=0;left<numbers.length-1;left++)
	        { 
	        while(right<=numbers.length-1)
	        {
	         sum=  numbers[left]+numbers[right]; 
	            
	          if(sum==target)
	          {
	            result[0]=left+1;
	            result[1]=right+1;
	              
	          } 
	           right++; 
	        }
	        }
	        return result;  
	    }

}
