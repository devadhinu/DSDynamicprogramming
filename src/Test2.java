import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Test2 {
	@Test
	public void example()
	{
	String s ="AAABBBCCCC";
	System.out.println(findOccurence(s));

	}


	public int findOccurence(String s)
	{
	HashMap<Character,Integer> hm = new HashMap<>();

	for(int i=0;i<s.length();i++)
	{
	hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
	}

	for(Entry<Character, Integer> entry : hm.entrySet())
	{

	System.out.println(entry.getKey()+"="+entry.getValue());
	}

	int max =Collections.max(hm.values());
	


	return max;
	}


}
