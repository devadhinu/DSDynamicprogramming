package slidingwindow;

import org.junit.Test;

public class MaximumproductsubArray {
	
	
	

	@Test
	public void edge2()
	{
		int[] nums= {2,3,-2,4};//6
			System.out.println(maxProductusingkandane(nums));
	}

	@Test
	public void edge3()
	{
		int[] nums= {-2,0,-1};//0
		System.out.println(maxProductusingkandane(nums));
	}

	@Test
	public void edge4()
	{
		int[] nums= {-4,-3};//12
		System.out.println(maxProductusingkandane(nums));
	}
	@Test
	public void edge5
	()
	{
		int[] nums= {0,2};//2
		//output=2 
		System.out.println(maxProductusingkandane(nums));

	}
	@Test
	public void edge6()
	{
		int[] nums= {-2,3,-4};//24
		System.out.println(maxProductusingkandane(nums));

	}
	@Test
	public void edge7
	()
	{
		int[] nums= {-3,0,1,-2};//1
		System.out.println(maxProductusingkandane(nums));
	}
	@Test
	public void edge8()
	{
		int[] nums= {5};//5
		//output=5
		System.out.println(maxProductusingkandane(nums));
	}

	@Test
	public void edge9()
	{
		int[] nums= {2,-5,-2,-4,3};//24
		//output=24
		System.out.println(maxProductusingkandane(nums));
	}

	//not working for all test cases .Has not included check for consecutive 3 or 4 elements in a array.
	//Hence the below approach will not work 
	public int maxProduct1(int[] nums)
	{
		int left=0,right=1;
		int product=1;	
	    int max=Integer.MIN_VALUE;
		int temp=Integer.MIN_VALUE;
		int maxproduct = 1;
		
		if(nums.length==1)return nums[left];
		for(int i=0;i<nums.length;i++)
		{
			product=nums[i];
			maxproduct=maxproduct*nums[i];
			
			temp=Math.max(maxproduct, product);
			max=Math.max(max, temp);
		}
		left=0;
		while(right<=nums.length-1 && left<right)
		{
			product=nums[left++]*nums[right++];
			max= Math.max(max,product);
		}
		return max;
	        
	}

//maxproduct-Bruteforce
	public int maxProduct(int[] nums)
	{
		int left=0,right=1;
		int product=1;	
		int max=Integer.MIN_VALUE;
		int temp=Integer.MIN_VALUE;
		

		if(nums.length==1)return nums[left];

		while(left<=nums.length-1)
		{
			temp=nums[left++];
			max= Math.max(max,temp);
		}

		left=0;
		

		while(left<nums.length)
		{
			product=nums[left];
			
			for(right=left+1;right<nums.length;right++)
			{
				product*=nums[right];

				max=Math.max(product,max);

			}
			left++;
		}


		return max;


	}
	
	
	//maximum product using kandane algorithm
	public int maxProductusingkandane(int[] nums)
	{
		int left=0,right=1;
		int product=1;	
		int max=Integer.MIN_VALUE;
		int temp=Integer.MIN_VALUE;
		
       while(left<nums.length-1)
       {
    	   
    	   product*=nums[left++];
    	   
    	   if(product==0)product=0;
    	   if(product<0)product=1;
           
           max = Math.max(max, product);
    	  
       } 
       

		return max;


	}

}
