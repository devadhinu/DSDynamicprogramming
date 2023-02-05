package Sorting;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {

	@Test
	public void example()
	{
		int[] arr = {1,9,22,3,2,1};
		System.out.println(Arrays.toString(mergeSort(arr)));
	}


	private int[] mergeSort(int[] arr) 
	{
		
		if(arr.length==1) return arr;	
		
		int mid=arr.length/2;			
			
		int[] leftPortion = mergeSort(Arrays.copyOfRange(arr,0,mid));
		int[] rightPortion =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		return mergeConquer(leftPortion,rightPortion);
	}


	public int[] mergeConquer(int[] firstHalf,int[] secondHalf)
	{
		int[] merged =new int[firstHalf.length+secondHalf.length];

		int i=0,j=0,k=0;

		while(i<firstHalf.length && j<secondHalf.length)
		{

			if(firstHalf[i]<secondHalf[j])merged[k++]=firstHalf[i++];

			else if(firstHalf[i]>secondHalf[j])merged[k++]=secondHalf[j++];

			else if(firstHalf[i]==secondHalf[j])
			{
				merged[k++]=secondHalf[j++];
				j++;
			}
		}
		while(i<firstHalf.length)
		{
			merged[k++]=firstHalf[i++];
		}
		while(j<secondHalf.length)
		{
			merged[k++]=secondHalf[j++];
		}
		
		return merged;     
	}

}
