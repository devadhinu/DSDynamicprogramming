package TwopointerString;

import java.util.HashMap;

import org.junit.Test;

public class ReversevowelsofaString {

	/*345. Reverse Vowels of a String
	 * 
	 * Given a string s, reverse only all the vowels in the string and return it.

       The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

          Example 1:

          Input: s = "hello"
          Output: "holle"
	 * 
	 *    Constraints:
	 * 
	 *    1 <= s.length <= 3 * 105
          s consist of printable ASCII characters.
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
		String s= "A man, a plan, a canal: Panama";
		//Output: "s'teL ekat edoCteeL tsetnoc"

		System.out.println(reverseVowels(s));
	}

	@Test	
	public void positive()
	{
		String s= "hello";
		//Output: "s'teL ekat edoCteeL tsetnoc"

		//System.out.println(reverseVowels(s));
	}

	@Test
	public void positive2()
	{
		String s= "leetcode";
		// Output: "doG gniD"

		//System.out.println(reverseVowels(s));
	}
	@Test
	public void negative()
	{
		String s= "aaaeee"; //"race a car"
		//System.out.println(reverseVowels(s));
	}

	@Test
	public void edge()
	{
		String s= "race a car";
		System.out.println(reverseVowels(s));
	}
	public static boolean[] vowels =new boolean[256];
	static 
	{
		vowels['a'] =true;
		vowels['e'] =true;
		vowels['i'] =true;
		vowels['o'] =true;
		vowels['u'] =true;
		vowels['A'] =true;
		vowels['E'] =true;
		vowels['I'] =true;
		vowels['O'] =true;
		vowels['U'] =true;
	}

	private String reverseVowels(String s) 
	{ 
		int left=0,right=s.length()-1; 
		char temp; 
		char[] str=s.toCharArray(); 
		while(left<right) 
		{
			if((int)(str[left])==32|| (int)(str[right])==32) break;
			if(!vowels[str[left]])left++; 
			if(!vowels[str[right]])right--; else 
			{
				temp=str[left]; 
				str[left++]=str[right];
				str[right--]=temp; 
			} 
		} 
		return String.valueOf(str);
	} 
}


/*//another way to do that
 * private String reverseVowels(String s) { 
 * int left=0,right=s.length()-1; 
 * char temp; 
 * char[] str=s.toCharArray(); 
 * while(left<right) {
 * if((int)(str[left])==32|| (int)(str[right])==32) break;
 * if(!isVowel(str[left]))left++; 
 * if(!isVowel(str[right]))right--; else {
 * temp=str[left]; 
 * str[left++]=str[right];
 * str[right--]=temp; } } 
 * return String.valueOf(str);
 *  } 
 *  
 *  public static boolean isVowel(char c)
 *  { return 
 *  (c=='a'|| c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'); 
 * 
 * }
 */


//}
