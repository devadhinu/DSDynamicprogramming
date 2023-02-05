package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MinmaxriddleHR {

	//	Given an integer array of size , find the maximum of the minimum(s) of every window size in the array. The window size varies from  to .
	//
	//	For example, given , consider window sizes of  through . Windows of size  are . The maximum value of the minimum values of these windows is . Windows of size  are  and their minima are . The maximum of these values is . Continue this process through window size  to finally consider the entire array. All of the answers are .
	//
	//	Function Description
	//
	//	Complete the riddle function in the editor below. It must return an array of integers representing the maximum minimum value for each window size from  to .
	//
	//	riddle has the following parameter(s):
	//
	//	arr: an array of integers
	//	Input Format
	//
	//	The first line contains a single integer, , the size of .
	//	The second line contains  space-separated integers, each an .
	//
	//	Constraints
	//
	//
	//
	//	Output Format
	//
	//	Single line containing  space-separated integers denoting the output for each window size from  to .
	//
	//	Sample Input 0
	//
	//	4
	//	2 6 1 12
	//	Sample Output 0
	//
	//	12 2 1 1
	//	Explanation 0
	//
	//	Here  and 
	//
	//	window size	window1	window2	window3	window4	maximum of all windows
	//	1	2	6	1	12	12
	//	2	2	1	1		2
	//	3	1	1			1
	//	4	1				1
	//	Sample Input 1
	//
	//	7
	//	1 2 3 5 1 13 3
	//	Sample Output 1
	//
	//	13 3 2 1 1 1 1
	//	Explanation 1
	//
	//	Here  and 
	//
	//	win size	w_1	w_2	w_3	w_4	w_5	w_6	w_7	maximum of all windows
	//	1	1	2	3	5	1	13	3	13
	//	2	1	2	3	1	1	3		3
	//	3	1	2	1	1	1			2
	//	4	1	1	1	1				1
	//	5	1	1	1					1
	//	6	1	1						1
	//	7	1							1
	//	Sample Input 2
	//
	//	6
	//	3 5 4 7 6 2
	//	Sample Output 2
	//
	//	7 6 4 4 3 2
	//	Explanation 2
	//
	//	Here  and 
	//
	//	win size	w_1	w_2	w_3	w_4	w_5	w_6	maximum of all windows
	//	1	3	5	4	7	6	2	7
	//	2	3	4	4	6	2		6
	//	3	3	4	4	2			4
	//	4	3	4	2				4
	//	5	3	2					3
	//	6	2						2

   @Test
	public void example()
	{
		int[] arr= {1,2,3,5,1,13,3};
		int n=6;
		System.out.println(riddle(arr,n));
	}

	public List<Integer> riddle(int[] arr,int n) 
	{
      //2 7 12 4 3 80 

		int max=0;
		int tempmin=Integer.MAX_VALUE;
		int[] result = new int[arr.length];
		ArrayList<Integer> minlist = new ArrayList<>();
		ArrayList<Integer> maxlist = new ArrayList<>();	
		int k=1;
		int right=0;
		int left=0;
		while(k<=n)
		{
			while(k==1 && right<n)
			{
				minlist.add(arr[right++]);
			}
			left=0;right=1;
			while(right<n && k>1)
			{
				max=Math.max(arr[right], max);

				right++;
				
				if(right-left==k)
				{
					left++;
					minlist.add(max);
					max=Integer.MIN_VALUE;
					right=left;
				}
				
			}
			System.out.println(minlist);
			int temp=Collections.max(minlist);
			maxlist.add(temp);
			k++;
			minlist.clear();
		}	
		
		return maxlist;



	}
}

