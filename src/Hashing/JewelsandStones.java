package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class JewelsandStones {

	/*
	 * 771. Jewels and Stones
	 * 
	 * You're given strings jewels representing the types of stones that are jewels,
	 * and stones representing the stones you have. Each character in stones is a
	 * type of stone you have. You want to know how many of the stones you have are
	 * also jewels.
	 * 
	 * Letters are case sensitive, so "a" is considered a different type of stone
	 * from "A".
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: jewels = "aA", stones = "aAAbbbb" Output: 3 Example 2:
	 * 
	 * Input: jewels = "z", stones = "ZZ" Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= jewels.length, stones.length <= 50 jewels and stones consist of only
	 * English letters. All the characters of jewels are unique.
	 */

	@Test
	public void positive() {
		//Positive Test Data
		String jewels = "aA";
		String stones = "aAAbbbb";
		int output = 3;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void edge1() {
		//Edge Case Test Data
		String jewels = "aBcDeFg";
		String stones = "g";
		int output = 1;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void edge2() {
		//Edge Case Test Data
		String jewels = "a";
		String stones = "A";
		int output = 0;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void edge3() {
		//Edge Case Test Data
		String jewels = "s";
		String stones = "sSs";
		int output = 2;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void edge4() {
		//Edge Case Test Data
		String jewels = "bcd";
		String stones = "cba";
		int output = 2;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void negative1() {
		//Negative Test Data
		String jewels = "ABCD";
		String stones = "abcd";
		int output = 0;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}

	@Test
	public void negative2() {
		//Negative Test Data
		String jewels = "abcd";
		String stones = "efgh";
		int output = 0;
		Assert.assertEquals(jewelsAndStones_usingAscii(jewels,stones), output);
	}
	private int jewelsAndStones(String jewels, String stones) {
		int counter = 0;
		for(int i=0;i<jewels.length();i++){
			for(int j=0;j<stones.length();j++){
				if(jewels.charAt(i) == stones.charAt(j)) counter++;
			}
		}
		return counter;
	}

	private int jewelsAndStones_twoPointer(String jewels, String stones) {
		int counter = 0;
		int p1=0,p2=0;
		char[] jewelsChar = jewels.toCharArray();
		char[] stonesChar = stones.toCharArray();
		Arrays.sort(jewelsChar);
		Arrays.sort(stonesChar);
		while(p1<jewelsChar.length && p2 < stonesChar.length) {
			System.out.println(jewelsChar[p1] < stonesChar[p2]);
			if(jewelsChar[p1] == stonesChar[p2]) {
				counter++;
				p2++;
			} else if (jewelsChar[p1] < stonesChar[p2]) p1++;
			else p2++;
		}
		return counter;
	}

	private int jewelsAndStones_usingSet(String jewels, String stones) {
		int counter = 0;
		Set<Character> jewelsStones = new HashSet<>();
		for(int i=0;i<jewels.length();i++) {
			jewelsStones.add(jewels.charAt(i));
		}

		for(int j=0;j<stones.length();j++) {
			if(jewelsStones.contains(stones.charAt(j))) counter++;
		}
		return counter;
	}

	private int jewelsAndStones_usingContainsMethod(String jewels, String stones) {
		int counter = 0;

		for(int i=0;i<stones.length();i++) 
			if(jewels.contains(stones.charAt(i) + "")) counter++;

		return counter;
	}

	//Map Implementation

	private int jewelsAndStones_usingMap(String jewels, String stones) {
		
		int jewelsinstone=0;
		HashMap<Character,Integer> hm = new HashMap<>();

		for(int i=0;i<jewels.length();i++)
		{
			hm.put(jewels.charAt(i), 0);
		}

		for(int i=0;i<stones.length();i++)
		{
			if(hm.containsKey(stones.charAt(i)))
			{
				hm.put(stones.charAt(i),hm.getOrDefault(stones.charAt(i),0)+1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : hm.entrySet())
		{
			jewelsinstone+= entry.getValue();
		}

		return jewelsinstone;

	}

	//ASCII Implementation

	private int jewelsAndStones_usingAscii(String jewels, String stones) {
		int[] ascii = new int[128];
		for(int i=0;i<jewels.length();i++) {
			ascii[jewels.charAt(i)]++;
		}
		int counter = 0;
		for(int j=0;j<stones.length();j++) {
			if(ascii[stones.charAt(j)]!=0) counter++;
		}
		return counter;
	}
}
