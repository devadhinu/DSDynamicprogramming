package TwopointerArrays;

import org.junit.Test;

public class FirstPalindromicstringinArray {

	/*2108. Find First Palindromic String in the Array
	 * 
	 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

       A string is palindromic if it reads the same forward and backward.

          Example 1:

          Input: words = ["abc","car","ada","racecar","cool"]
          Output: "ada"
          Explanation: The first string that is palindromic is "ada".
          Note that "racecar" is also palindromic, but it is not the first.
	 * 
	 *    Constraints:
	 * 
	 *    1 <= words.length <= 100
          1 <= words[i].length <= 100
          words[i] consists only of lowercase English letters
	 * 
	 * Pseudocode : 
	 * ========== 
	 * 1)Store the vowels in a static Boolean array object 
	 * 2)Take the string and consider two pointers for swapping
	 * 3)Iterate and see whether the boolean array value has it and if so return array value true and if its true swap it
	 * 4)Else increment the pointers one at a time.
	 * 
	 */	


	@Test	
	public void positive1()
	{
		String[] words= {"abc","car","ada","racecar","cool"};
		System.out.println(firstPalindrome(words));
	} 
	@Test	
	public void positive2()
	{
		String[] words= {"notapalindrome","racecar"};
		System.out.println(firstPalindrome(words));
	} 
	@Test	
	public void positive3()
	{
		String[] words= {"def","ghi"};
		//System.out.println(firstPalindrome(words));
	} 

	public String firstPalindrome(String[] words) 

	{
		int left=0,right=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length()==1) return words[i];
            left=0;
            right=words[i].length()-1;
            while(left<right){
                if(words[i].charAt(left) != words[i].charAt(right))
                    break;
                else {
                    left++;
                    right--;
                }
                if(left>=right) return words[i];
            }       
        }
        return "";
	}
}
