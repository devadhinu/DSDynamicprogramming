package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Destinationcity 

{
	
	/*
	 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there
	 * exists a direct path going from cityAi to cityBi. Return the destination
	 * city, that is, the city without any path outgoing to another city.
	 * 
	 * It is guaranteed that the graph of paths forms a line without any loop,
	 * therefore, there will be exactly one destination city.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: paths =
	 * [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] 
	 * Output: "Sao Paulo" 
	 * Explanation: Starting at "London" city you will reach "Sao Paulo"
	 * city which is the destination city. Your trip consist of: "London" ->
	 * "New York" -> "Lima" -> "Sao Paulo". Example 2:
	 * 
	 * Input: paths = [["B","C"],["D","B"],["C","A"]] 
	 * Output: "A" Explanation: All
	 * possible trips are: "D" -> "B" -> "C" -> "A". "B" -> "C" -> "A". "C" -> "A".
	 * "A". Clearly the destination city is "A". Example 3:
	 * 
	 * Input: paths = [["A","Z"]] Output: "Z"
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= paths.length <= 100 paths[i].length == 2 1 <= cityAi.length,
	 * cityBi.length <= 10 cityAi != cityBi All strings consist of lowercase and
	 * uppercase English letters and the space character.
	 */
	
	/*
	 * Pseudocode :
	 * 
	 * 1) Convert the two dimesnional array to a linked list using List.of() method
	 * in List class 
	 * 2)Create a hashmap and then the nested list argument is
	 * converted as hashmap /or in other words Pick each element from the list using
	 * the list ,list object.stream().foreach(list -->hashmap.put(list.get()))
	 * 
	 * //using stream function ,insert the list element by iterating each list element and insert to hashmap 
	 * 
	 * 3) Whichever hashmap value is not present in the
	 * hashmap as key will be the destination 5) Return that particular hashmap
	 * value as String
	 */
	
	@Test
	public void positive()
	{
		String[][] arr = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
		
		List<List<String>> path =new ArrayList<>();
	
		for (String[] ele : arr)
		{
		path.add(List.of(ele));
		}
		
		System.out.println(destCity(path));
	
		
	}

	@Test
	public void edge()
	{
		String[][] arr ={{"A","Z"}};
		
		List<List<String>> path = new ArrayList<>();
		
		for(String[] ele : arr) path.add(List.of(ele));
	
	//	System.out.println(destCity(path));
			
	}
	
	
	
	public String destCity(List<List<String>> paths)
	{
		
		String destination="";
		
		Map<String,String> hm = new HashMap<>();

		paths.stream().forEach(abc -> hm.put(abc.get(0),abc.get(1)));
		
		for(Map.Entry<String, String> entry : hm.entrySet())
		{
			if(!hm.containsKey(entry.getValue())) destination =entry.getValue();
		}
			
		
	    
		System.out.println(hm);
		
		return destination;
		
	}
}
