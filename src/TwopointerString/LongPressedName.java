package TwopointerString;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName {

	/*
	 * 925. Long Pressed Name
	 * 
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a
	 * character c, the key might get long pressed, and the character will be typed
	 * 1 or more times.
	 * 
	 * You examine the typed characters of the keyboard. Return True if it is
	 * possible that it was your friends name, with some characters (possibly none)
	 * being long pressed.
	 */

	/*
	 * Example 1:
	 * 
	 * Input: name = "alex", 
	 * typed = "aaleex" 
	 * Output: true 
	 * Explanation: 'a' and 'e' in 'alex' were long pressed.
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: name = "saeed", 
	 * typed = "ssaaedd" 
	 * Output: false 
	 * Explanation: 'e' must have been pressed twice, but it was not in the typed output.
	 * 
	 */
	/*
	 * Constraints:
	 * 
	 * 1 <= name.length, typed.length <= 1000 name and 
	 * typed consist of only lowercase English letters.
	 * 
	 */
//	@Test
//	public void example1()
//	{
//
//		String s ="alex";
//		String t = "aaleex";
//		System.out.println(isLongPressedName(s,t));
//	}
//	@Test
//	public void negative2() {
//		//Negative Test Data
//		String name = "saeed";
//		String typed = "saaed";
//		Assert.assertEquals(isLongPressedName(name,typed), false);
//	}
//
//	@Test
//	public void negative() {
//		//Negative Test Data
//		String name = "pr";
//		String typed = "prrn";
//		Assert.assertEquals(isLongPressedName(name,typed), false);
//	}
//
//	@Test
//	public void negative3() {
//		//Negative Test Data
//		String name = "jraseeq";
//		String typed ="raaseeqj";
//		Assert.assertEquals(isLongPressedName(name,typed), false);
//	}
//
//	@Test
//	public void edge2() {
//		//Edge Case Test Data
//		String name = "alex";
//		String typed = "aaleexa";
//		Assert.assertEquals(isLongPressedName(name,typed), false);
//	}
//
//	@Test
//	public void edge3() {
//		//Edge Case Test Data
//		String name = "devaseen";
//		String typed = "devasen";
//		Assert.assertEquals(isLongPressedName(name,typed), false);
//	}
//
//	@Test
//	public void edge4() {
//		//Edge Case Test Data
//		String name = "d";
//		String typed = "dddd";
//		Assert.assertEquals(isLongPressedName(name,typed), true);
//	}
	
	@Test
	public void edge5() {
		//Edge Case Test Data
		String name =  "vtkgn";
		String typed = "vttkgnn";
		Assert.assertEquals(isLongPressedName(name,typed), true);
	}

	public boolean isLongPressedName(String name, String typed) 
	{

		int p1=0,p2=0;

		if(name.charAt(0)!=typed.charAt(0)) return false;

		while(p1<name.length()&& p2<typed.length())
		{
			if(name.charAt(p1)==typed.charAt(p2))
			{
				p1++;
				p2++;
			}

			else if(typed.charAt(p2)==typed.charAt(p2-1))
			{
				p2++;
			}     
			else return false;
		}

		
		if(p1>=name.length() && p2>=typed.length()) return true;	

		if(p1<=name.length()&& p2>=typed.length()) return false;

		else if(p1>=name.length() && p2<=typed.length())
		{
			while(p2<typed.length())
			{
				if(typed.charAt(p2)==typed.charAt(p2-1)) 
					{
					p2++;
				
					}

				   else 
					{
					
					return false;
					}
			}

		}

		return true;

	}
}