package arraysBruteforce;

import java.util.Arrays;

import org.junit.Test;

public class Assigncookies {

	/*
	 * 455. Assign Cookies Assume you are an awesome parent and want to give your
	 * children some cookies. But, you should give each child at most one cookie.
	 * 
	 * Each child i has a greed factor g[i], which is the minimum size of a cookie
	 * that the child will be content with; and each cookie j has a size s[j]. If
	 * s[j] >= g[i], we can assign the cookie j to the child i, and the child i will
	 * be content. Your goal is to maximize the number of your content children and
	 * output the maximum number.
	 * 
	 * Input: g = [1,2], s = [1,2,3] Output: 2 Explanation: You have 2 children and
	 * 3 cookies. The greed factors of 2 children are 1, 2. You have 3 cookies and
	 * their sizes are big enough to gratify all of the children, You need to output
	 * 2.
	 * 
	 * Constraints:
	 * 
	 * 1 <= g.length <= 3 * 104 0 <= s.length <= 3 * 104 1 <= g[i], s[j] <= 231 - 1
	 * 
	 * Pseudocode : ========== 1)Store the cookie and greed factor in 2 separate
	 * arrays and pointer on cookie should be pointer1 and pointer on greed factor
	 * should be pointer2 2)Sort both the arrays as the match if not working ,
	 * 3)Keep both the pointers at 0 and if there is a match with greed and cookie
	 * ,increment both pointers and one cookie is already offered 4) 5)
	 * 
	 */
	@Test
	public void positive1() {

		int[] g = { 1, 2, 3 };// greed
		int[] s = { 1, 1 }; // cookie

		// findContentChildren(g,s);
	}

	@Test
	public void positive2() {

		int[] g = { 1, 2 };// greed
		int[] s = { 1, 2, 3 }; // cookie

		// findContentChildren(g,s);
	}

	@Test
	public void edge() {

		int[] g = { 1, 2, 3 };// greed
		int[] s = { 3 }; // cookie

		// findContentChildren(g,s);
	}

	@Test
	public void positive() {

		int[] g = { 10, 9, 8, 7 };// greed
		int[] s = { 5, 6, 7, 8 }; // cookie

		findContentChildren(g, s);
	}

	public int findContentChildren(int[] g, int[] s) {
	Arrays.sort(s);
		Arrays.sort(g);
		int p1 = 0, p2 = 0, count = 0;
		while(p2<s.length && p1<g.length)
		{
			
			if(g[p1]>s[p2])
			{
				p2++;	
			} 
			else 
			{
				p1++;
				p2++;
				count++;
			}
		}
        System.out.println(count);
		return count;
		
//		 
//		 int p1=0,p2=0,count=0; 
//		 while(p1<s.length && p2<g.length) 
//		 { 
//			 if(s[p1]!=g[p2])
//			 {
//			 p2++; 
//			 }
//			 else
//			 {
//				 p1++; p2++; count++;
//			 } 
//
//		 } System.out.println(count);
//		 return count;
		 

	}
}
