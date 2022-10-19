package TwopointerString;

import org.junit.Test;

public class MergestringAlternate {

	/*
	 * 
	 * 
	 *You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
      Return the merged string. 

      Constraints:
      1 <= word1.length, word2.length <= 100
       word1 and word2 consist of lowercase English letters.

	 * Psedocode :
	 * =========
	 * 1)Identify two pointers and traverse through the array till its max length
	 * 2)if both pointer match , add in a set 
	 * 3)If any of the pointer1<pointer2 dont match ,move the first pointer
	 * 4)
	 * 
	 * /*
	 * 1. Did I understand the problem? 
	 * 	yes or no 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem? Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */
	@Test
	public void positive() {

		String word1 = "abc", word2 = "pqr";
		String output ="apbqcr";

		//  mergeString(word1,word2);
	}
	@Test
	public void positive1() {

		String word1 = "ab", word2 = "pqrs";
		String output ="apbqrs";
		//  mergeString(word1,word2);

	}
	@Test
	public void edge() {
		String word1 = "abcd", word2 = "pq";
		String output ="apbqcd";
		mergeString(word1,word2);

	}
	private String mergeString(String word1, String word2) 
	{

		int p1=0,p2=0;

		String result="";
		/*
		 * while(p1<word1.length() || p2<word2.length()) { String result=""; char
		 * char1=word1.charAt(p1); char char2=word2.charAt(p2); String
		 * result=result.concat(Character.toString(char1)+Character.toString(char2));
		 * p1++; p2++; System.out.println(result);
		 * 
		 * }
		 */	

		/*StringBuilder sb =new StringBuilder();
		if(p1<=word1.length() || p2<=word2.length())s c
			sb.append(word1.charAt(p1)).append(word2.charAt(p2));
			p1++;
			p2++;		
			System.out.println(sb.toString());
		 */
		while(p1<word1.length() || p2<word2.length()) 
		{
		StringBuilder sb =new StringBuilder();
		if(p1<word1.length())sb.append(word1.charAt(p1++));
		if(p2<word2.length())sb.append(word2.charAt(p2++));
		System.out.println(sb.toString());
		result=sb.toString();
		}
		return result;
	}	
	

	//return result;


}


