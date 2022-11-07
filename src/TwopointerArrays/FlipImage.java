package TwopointerArrays;

import org.junit.Test;

public class FlipImage {
	
	
	/* * Pseudocode : 
		 * ========== 
		 * 1)Take two pointers left and right for the array nums
		 * 2)Keep traversing the pointers to see the difference is matching with variable diff 
		 * 3)if diff matches , put the element left into the array.
		 * 

}
*/
	@Test	
	public void positive()
	{
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
		//Output: "s'teL ekat edoCteeL tsetnoc"

		flipAndInvertImage(image);
	}
	@Test
	public void positive2()
	{
		int[][] image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		
		// Output: "doG gniD"

		//reverseWords(nums,diff);
	}
	
	//Pseudocode :
/*	
   1) Take the binary matrix and take the rows as i and columns as j 
   2) Use a for loop to iterate through the each and every row 0,1,2,3
   3) Use two pointer algorithm to traverse through the left =0 and right=n
   4)If the values are similiar in both the left anf right , make the a[i][left]=1-a[i][left]
   5)As both left and right values are similiar , assign the same above value to a[i][right]
   6)iterate and validate the same for all rows 	*/	   


//      1 1 0 0        1 1 0 0
//      1 0 0 1        0 1 1 0
//      0 1 1 1  ===>  0 0 0 1 
//      1 0 1 0        1 0 1 0



//Optimised solution :(not working in leetcode)
	
	 public int[][] flipAndInvertImage(int[][] image)
	{
		
		 
		 for(int i=0;i<image.length;i++)
		 {
			 int left=0 ,right=image.length-1;
			 while(left<=right)
			{
				
				if(image[i][left] == image[i][right])
				{
					image[i][left] = 1- image[i][left];
					image[i][right] = image[i][left] ;
				}
				
				
			}
				
			 
			 
		 } 
		
		return image;
	
	
	}
	
	}


