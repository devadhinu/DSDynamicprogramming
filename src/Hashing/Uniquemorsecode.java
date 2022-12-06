package Hashing;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Uniquemorsecode {
	
	/*
	 * 804. Unique Morse Code Words
	 * 
	 * International Morse Code defines a standard encoding where each letter is
	 * mapped to a series of dots and dashes, as follows:
	 * 
	 * 'a' maps to ".-", 'b' maps to "-...", 'c' maps to "-.-.", and so on. For
	 * convenience, the full table for the 26 letters of the English alphabet is
	 * given below:
	 * 
	 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
	 * "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
	 * "-.--","--.."] Given an array of strings words where each word can be written
	 * as a concatenation of the Morse code of each letter.
	 * 
	 * For example, "cab" can be written as "-.-..--...", which is the concatenation
	 * of "-.-.", ".-", and "-...". We will call such a concatenation the
	 * transformation of a word. Return the number of different transformations
	 * among all words we have.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: words = ["gin","zen","gig","msg"] Output: 2 Explanation: The
	 * transformation of each word is: "gin" -> "--...-." "zen" -> "--...-." "gig"
	 * -> "--...--." "msg" -> "--...--." There are 2 different transformations:
	 * "--...-." and "--...--.". Example 2:
	 * 
	 * Input: words = ["a"] Output: 1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= words.length <= 100 1 <= words[i].length <= 12 words[i] consists of
	 * lowercase English letters.
	 */
	
	@Test
	public void positive() {
		//Positive Test Data
		String[] words = {"gin","zen","gig","msg"};
		int output = 2;
		Assert.assertEquals(uniqueMorseRepresentations(words), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		String[] words = {"a"};
		int output = 1;
		Assert.assertEquals(uniqueMorseRepresentations(words), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		String[] words = {"a","b","aa"};
		int output = 3;
		Assert.assertEquals(uniqueMorseRepresentations(words), output);
	}
    public int uniqueMorseRepresentations(String[] words) 
    {
    	String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> hSet = new HashSet<>();
		
		for(int i=0;i<words.length;i++) {
			String currWord = "";
			for(int j=0;j<words[i].length();j++) {
				currWord += morseCode[words[i].charAt(j)-'a'];
			}
			hSet.add(currWord);
		}
		return hSet.size();
        
    }
}
