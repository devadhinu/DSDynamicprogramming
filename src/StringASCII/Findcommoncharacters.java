package StringASCII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Findcommoncharacters {
	/*
	 * Pseudocode: 
	 * 
	 * 1)Create two alphabet sized ascii array one for computing min and another to keep track of
	 *   occurence of string charcaters. 
	 * 2)Strore the asciimin array with max value as Ineter.MAX_VALUE or 101 as the upper case
	 *   max no is 101 
	 * 3)Now iterate through the array of strings and fill the ascii character array
	 *   with 0 default value inside the first loop 
	 * 4)Iterate through the characters of the string and fill the character-a to capture its occurence in its
	 *   alpahabetic index of the array
	 * 5)Iterate again through the length 26 and find the min of the asciimin and asciichar and store the min value
	 *   in the ascii in array.
	 * 6)Repeat the same thing for second string and now capture the occurence and in asciimin capture whichever value is min
	 * 7)Even the new characters from the new string are found , the min occurence of min array 0 only will be counted
	 * 8)Iterate through the loop of minarray and capture the  value whichever has count greater than 0 and convert the index to a character   (char}(index+'a']and typecast it
	 * 9)Reduce the value
	 * 10)Add the vlaues to the list
	 * 
	 */
	@Test
	public void example1() {
		//Positive Test Data
		String[] words = {"bella","label","roller"};
		List<String> output = Arrays.asList("e","l","l");
		Assert.assertEquals(commoncharacters_betterApproach(words), output);
	}
	

	private List<String> commoncharacters_betterApproach(String[] words) {
	int[] asciimin= new int[26];
    int[] asciichar = new int[26];
  
    
    Arrays.fill(asciimin, 101); // Since the maximum size given in the range 1<words[i].length<=100
    
    for(int i=0;i<words.length;i++)
    {

        Arrays.fill(asciichar,0);
        
        for(char c : words[i].toCharArray())
        {
            asciichar[c-'a']++;
   
        }
        
        for(int k=0;k<asciimin.length;k++){
        	asciimin[k] = Math.min(asciimin[k],asciichar[k]);
        }
    }
    //System.out.println(Arrays.toString(ascii1));
    List<String> common = new ArrayList<>();
    
    for(int p=0;p<asciimin.length;p++)
    {
            int value = asciimin[p];
            while(value>0){
                common.add((char) (p+'a') + "");
                value--;
            }
    }
    return common;
}

}
