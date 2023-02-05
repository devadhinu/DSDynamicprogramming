import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Test2ndfeb 
{
	/*
	 * Implement a method which will find number of words in a sentence: 
	 * INPUT: My name is Satish.
	 * OUTPUT: 4
	 */
	@Test
	 public void example()
	 {
		 String s="My name is Satish";
		 Assert.assertEquals(4,findnoofowrds(s));
		// System.out.println(findnoofowrds(s));
	 }
	@Test
	 public void example1()
	 {
		 String s="My name is   Satish";
		 Assert.assertEquals(4,findnoofowrds(s));
		System.out.println(findnoofowrds(s));
	 }
	@Test
	 public void example2()
	 {
		 String s="";
		 Assert.assertEquals(0,findnoofowrds(s));
		// System.out.println(findnoofowrds(s));
	 }
	@Test
	 public void example3()
	 {
		 String s="MynameisSatish";
		 Assert.assertEquals(1,findnoofowrds(s));
		// System.out.println(findnoofowrds(s));
	 }
	
		/*
		 * Pesudocode : ============ 1)Pass the string to the method 2)Split the string
		 * with space in it 3)Then store it in a string array 4)compute the length of
		 * the array and return its count
		 */

	private int findnoofowrds(String s) 
	{
      if(s.length()==0)return 0;
      String[] arr = null ;
     
      arr= s.trim().split(" ");
      System.out.println(Arrays.toString(arr));
      for(int i =0;i<arr.length;i++)
      {
    	  
      }
	}
	
}
