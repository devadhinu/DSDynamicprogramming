package TwoDimesionalArrays;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RotateImage {
	
	/*
	 * You are given an n x n 2D matrix representing an image, rotate the image by
	 * 90 degrees (clockwise).
	 * 
	 * You have to rotate the image in-place, which means you have to modify the
	 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
	 * rotation.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] 
	 * Output:         [[7,4,1],[8,5,2],[9,6,3]]
	 * 
	 * Example 2:
	 * 
	 * 
	 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]] 
	 * Output:         [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == matrix.length == matrix[i].length 
	 * 1 <= n <= 20 -1000 <= matrix[i][j] <= 1000
	 * 
	 */
	
	@Test
	public void example1() {
		//Positive Test Data
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] output = {{7,4,1},{8,5,2},{9,6,3}};
		Assert.assertTrue(Arrays.deepEquals(rotateImage(matrix), output));
	}
	
	@Test
	public void example2() {
		//Edge Case Test Data
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int[][] output = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
		Assert.assertTrue(Arrays.deepEquals(rotateImage(matrix), output));
	}
	
	@Test
	public void example3() {
		//Negative Test Data
		int[][] matrix = {{5}};
		int[][] output = {{5}};
		Assert.assertTrue(Arrays.deepEquals(rotateImage(matrix), output));
	}
	
	/*
	 * --- Pseudo Code ---
	 * 
	 * 1. For each array in matrix, reverse the elements of matrix[i]
	 * 2. Create 4 pointers l1,l2=0 and r1,r2=matrix.length-1
	 * 3. Swap the last values of each matrix[i] and place it along the matrix[0]
	 * 4. When current element is reached, reset the pointers and start the step 3 from second last element and matrix[1]
	 * 5. Continue till l1<r1
	 * 6. Return matrix
	 * 
	 */	
	
	public int[][] rotateImage(int[][] matrix) {
		int len=matrix.length-1;
        for(int i=0;i<=len;i++){
            int left=0,right=len;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left++] = matrix[i][right];
                matrix[i][right--] = temp;
            }
        }
        int l1=0,l2=0;
        int r1=len,r2=len; 
        
        while(l1<r1){
            int temp = matrix[l1][l2];
            matrix[l1][l2] = matrix[r1][r2];
            matrix[r1][r2] = temp;
            l2++;
            r1--;
            
            if(l1==r1) {
                l1++;
                l2=0;
                r1=len;
                r2--;
            }
        }
        return matrix;
	}
}


