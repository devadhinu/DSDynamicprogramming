package TwopointerArrays;

//solved during weekend assessment 29/10/2022
public class IntegertoSumofNozeroIntegers {
	
	 // Pseudocode:
    // ===========
    // 1)Take the n and subtract the value by 1 
    // 2)take the subtracted value as end 
    // 3)Take start as 1
    // 4) incremnet and decrement 2 pointers
    // 5)sum the 2 pointers and see whether it matches with n
    // 4)right and left pointers%10 !=0 else , move the pointers and continue hecking the sum    
    
    
    public int[] getNoZeroIntegers(int n) {
        
       int left =0,right=n-1;
        int i=0;
        int[] result =new int[2];
        int sum=0;
        while(left<right)
        {
        if(left%10 !=0 && right%10 !=0)
        {
          sum=left+right;
          if(sum==n)
          {
               result[i] =left;
               result[i+1]=right;
          }
          left++;
          right--; 
        } 
            
    }
        return result;
        
    }

}
