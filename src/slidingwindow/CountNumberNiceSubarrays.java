package slidingwindow;

import org.junit.Test;

public class CountNumberNiceSubarrays {
	
	@Test
	public void example1()
	{
	int[] nums=  {1,1,2,1,1};//2
    int k=3;
   System.out.println(findNicesubarraycount(nums,k));
    //findNicesubarraycount(nums,k);
	                     
	}
	
	@Test
	public void example2()
	{
	int[] nums=  {2,4,6};//0
	int k=1;
//	 System.out.println(findNicesubarraycount(nums,k));
 //findNicesubarraycount(nums,k);
	                     
	}
	

	@Test
	public void example3()
	{
	int[] nums=  {2,2,2,1,2,2,1,2,2,2};//16
	int k=2;
	 System.out.println(findNicesubarraycount(nums,k));
	//findNicesubarraycount(nums,k);
	                     
	}

	/*
	 * Pseudocode :
	 * 
	 * 1)Take a left pointer and traverse through all the values in the array
	 * 2)Verify whether each element is having remainder as 1 
	 * 3) If nums[i]%2=1 , then its a odd number ,increment count variable 
	 * 4)continue till it matches the k value
	 *  5)When it matches the k value , assign a new var oddcount =1
	 *  6)When the k value is matched to count , decremennt the count
	 */
	 public int findNicesubarraycount(int[] nums,int k)
	 {
		 int left =0,right=0;
		 int count=0,oddCount=0;
		 int subarrCount=0;
		 while(right<nums.length)
		 {
			 if(nums[right]%2==1)
				 
				 {
				 count++;
			     oddCount=0;
				 }
			 while(count==k)
			 {
				 oddCount++;
				 if(nums[left++]%2==1)count--;
				 	
			 } 
			 right++;
			 subarrCount+=oddCount;
		 }
		return oddCount;	 
	 }
	
	
}
