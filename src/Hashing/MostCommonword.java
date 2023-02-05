package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonword {

	
	@Test
	public void positive() {
		//Positive Test Data
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		String output = "ball";
		Assert.assertEquals(mostCommonWord(paragraph,banned), output);
	}
	
	@Test
	public void positive2() {
		//Edge Case Test Data
		String paragraph = "Hi t HIT bob$#%$%# bob ";
		String[] banned = {"hit"};
		String output = "bob";
		Assert.assertEquals(mostCommonWord(paragraph,banned), output);
	}
	
	@Test
	public void Edge() {
		//Negative Test Data
		String paragraph = "Bob        ";
		String[] banned = {"bob"};
		String output = "";
		Assert.assertEquals(mostCommonWord(paragraph,banned), output);
	}
	
	@Test
	public void edge() {
		//Edge Test Data
		String paragraph = "Bob Hit ball        ";
		String[] banned = {"bob","ball"   }	;
		String output = "hit";
		Assert.assertEquals(mostCommonWord(paragraph,banned), output);
	}
	
	/*
	 * Pseudocode:
	 * 
	 * 1) IN a sentence to find most repeating word 
	 * 2) Remove the extra alphanumeric letters using replaceAll function()->replaceAll("[^A-Za-z]")
	 * 3) Then to convert a sentence to string of Array using split(" ") method
	 * 4) To split that give space as delimited and save the delimited character in a string array
	 * 5) Create a Arraylist and store the banned word and this is to check or make use of contains method
	 *    to validate whether the hashmap max word is not present in the list by using contains
	 * 6) Thumb rule:
	 *    Dont put the words which is either blank or which is present in the banned Arraylist.
	 *    Second , get the max value from hashMap using Collections.max() method
	 * 7) Iterate through the String array created and put the string in hashmap only if the values 
	 *    are not present in the list
	 * 8) Now  Iterate through the map using map.entrySet()  
	 * 9) Whichever values is euqivalent to max value of collection,get its key and return key String.
	 */
	
	public String mostCommonWord(String paragraph, String[] banned) 
	{
		paragraph=paragraph.replaceAll("[^a-zA-z]"," ").toLowerCase();
		String[] paraArray = paragraph.trim().split(" ");
		System.out.println(Arrays.toString(paraArray));
		ArrayList<String> lst = new ArrayList<>();
		String commonword="";

		HashMap<String,Integer> hm = new HashMap<>();
		for(int i =0;i<banned.length;i++)
		{
			lst.add(banned[i]);

		}
		
		for(int i=0;i<paraArray.length;i++)
		{
			String word =paraArray[i];
			if(!lst.contains(word) && word!="")
			{
				hm.put(word,hm.getOrDefault(word,0)+1);    
			}

		}
		int temp = Collections.max(hm.values());

		for(Map.Entry<String,Integer> entry :hm.entrySet())
		{   
			if(entry.getValue()==temp)
			{
				commonword=entry.getKey();
			}           
		}
		return commonword;
	}

}
