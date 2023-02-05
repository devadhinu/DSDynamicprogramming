package Stack;

import java.util.Stack;

import org.junit.Test;

public class DecodeString {

	@Test
	public void example1() {
		//Positive Test Data
		String s = "2[a3[b]]";
		String output = "abbbabbb";
		decodeString(s);
	}

	private String decodeString(String s) {
		Stack<Character> stack = new Stack<>();
		char[] ch = s.toCharArray();

		String temp;

		for(int i=0;i<ch.length;i++) 
		{
			if(ch[i] != ']') stack.push(ch[i]);
			else 
			{
				temp = "";
				while(stack.peek() != '[') 
				{
					temp += stack.pop();
				}

				stack.pop();   // Removing [ character

				String freq = "";
				while(!stack.isEmpty() && Character.isDigit(stack.peek())) 
				{
					freq = stack.pop() + "" + freq;
				}

				int k = 0;

				if(freq !="") k = Integer.valueOf(freq);

				while(k>0) 
				{
					for(int j=temp.length()-1;j>=0;j--) 
					{
						stack.push(temp.charAt(j));
					}
					k--;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.reverse().toString());
		return s;

	}

}
