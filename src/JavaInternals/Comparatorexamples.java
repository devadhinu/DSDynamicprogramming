package JavaInternals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public  class Comparatorexamples  {

	@Test
	public void example()
	{

		compareStringsusingcomaparator();
		compareusingcharinString();
		compareinArraysSort();
	}



	public static void compareStringsusingcomaparator()
	{
		List<String> al = new ArrayList<>();
		al.add("Zebra");
		al.add("Horse");
		al.add("Cow");
		al.add("Deer");

		Collections.sort(al,new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {

				if(s1.compareTo(s2)>1)return -2;

				else return 2;
			}


		});

		System.out.println(al);

	}

	public static void compareusingcharinString()
	{
		List<String> al = new ArrayList<>();
		al.add("Zebra");
		al.add("Horse");
		al.add("Cow");
		al.add("Deer");

		Collections.sort(al,new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {

				if(s1.charAt(s1.length()-1)>s2.charAt(s2.length()-1))return -2;

				else return 2;
			}


		});

		System.out.println(al);

	}
	private void compareinArraysSort() 
	{
		Integer[] arry = new Integer[] {8,100,56,3,78,90};

		int[] array = {99,98,97,65,55,45};
		
		int[][] twod= {{1,3},{8,4},{2,8},{0,4}};

		Arrays.sort(arry,(a,b)->Integer.compare(a,b));
		
		Arrays.sort(twod,(a,b)->Integer.compare(a[0],b[0]));
		
		System.out.println(Arrays.deepToString(twod));

	//	Arrays.sort(array,Comparator.comparingInt(a->a[0]));

	}


}