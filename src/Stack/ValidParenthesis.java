package Stack;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class ValidParenthesis {

	/*
	 * 20. Valid Parentheses -Leetcode 
	 * 
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Every close bracket has a corresponding open
	 * bracket of the same type.
	 */


	/*
	 * Hint : 
	 * "Basically for this problem , the opening and closing bracket should follow a
	 * sequence means that when there is a sequence of opening , the closing bracket
	 * in the string should start with a sequence of what the recent closing char.so 
	 * Stack is the ideal solution for this case."
	 * 
	 * the corner cases like [ ) ( ] where closing bracket occurs first and
	 * opening bracket after it, which is an invalid sequence, as well as [ ( ] )
	 * where the most recent opening didn’t get its opposite pair hence it will also
	 * not be valid. So we have to use a data structure that will keep track of
	 * first in and last out, hence we will use the stack.
	 */
	@Test
	public void example()
	{
		String s="()";
		boolean output=true;
		Assert.assertEquals(isValid(s), output);
	}
	@Test
	public void example2()
	{
		String s="()[]{}";
		boolean output=true;
		Assert.assertEquals(isValid(s), output);
	}
	@Test
	public void example3()
	{
		String s="(]";
		boolean output=false;
		Assert.assertEquals(isValid(s), output);
	}
	@Test
	public void negative()
	{
		String s="[)(]";
		boolean output=false;
		Assert.assertEquals(isValid(s), output);
	}
	@Test
	public void negative2()
	{
		String s="[(])";
		boolean output=false;
		Assert.assertEquals(isValid(s), output);
	}
	@Test
	public void negative3()
	{
		String s="{(([])[])[]]}";
		boolean output=false;
		Assert.assertEquals(isValid(s), output);
	}
	public boolean isValid(String s)
	{
		  if (s.length() == 0) { 
	            return true;
	        }
	        if ( (s.length() % 2) != 0) {
	            return false;
	        }
	        Stack<Character> stack= new Stack<Character>();    
	        
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            switch(ch){
	                case '(': stack.push(ch);
	                break;
	                case '[':stack.push(ch);
	                break;
	                case '{':stack.push(ch);
	                break;
	                case ')': if(stack.isEmpty() || stack.peek()!='(')
	                            return false;
	                        stack.pop();
	                break;
	                case ']':if(stack.empty() ||stack.peek()!='[')
	                            return false;
	                        stack.pop();
	                break;
	                case '}':if(stack.empty() ||stack.peek()!='{')
	                            return false;
	                        stack.pop();
	                break;
	                default:
	                
	            }
	        }
	            if(stack.isEmpty())
	            return true;
	            else
	            return false;
	    }

}
