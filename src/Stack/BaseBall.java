package Stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class BaseBall 
{
	
//	682. Baseball Game

//	You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
//
//	You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
//
//	An integer x.
//	Record a new score of x.
//	'+'.
//	Record a new score that is the sum of the previous two scores.
//	'D'.
//	Record a new score that is the double of the previous score.
//	'C'.
//	Invalidate the previous score, removing it from the record.
//	Return the sum of all the scores on the record after applying all the operations.
//
//	The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
//
//	 
//
//	Example 1:
//
//	Input: ops = ["5","2","C","D","+"]
//	Output: 30
//	Explanation:
//	"5" - Add 5 to the record, record is now [5].
//	"2" - Add 2 to the record, record is now [5, 2].
//	"C" - Invalidate and remove the previous score, record is now [5].
//	"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//	"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//	The total sum is 5 + 10 + 15 = 30.
//	Example 2:
//
//	Input: ops = ["5","-2","4","C","D","9","+","+"]
//	Output: 27
//	Explanation:
//	"5" - Add 5 to the record, record is now [5].
//	"-2" - Add -2 to the record, record is now [5, -2].
//	"4" - Add 4 to the record, record is now [5, -2, 4].
//	"C" - Invalidate and remove the previous score, record is now [5, -2].
//	"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//	"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//	"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//	"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//	The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
//	Example 3:
//
//	Input: ops = ["1","C"]
//	Output: 0
//	Explanation:
//	"1" - Add 1 to the record, record is now [1].
//	"C" - Invalidate and remove the previous score, record is now [].
//	Since the record is empty, the total sum is 0.
//	 
//
//	Constraints:
//
//	1 <= operations.length <= 1000
//	operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
//	For operation "+", there will always be at least two previous scores on the record.
//	For operations "C" and "D", there will always be at least one previous score on the record.
	
	@Test
	public void example1() {
		//Positive Test Data
		String[] ops = {"5","2","C","D","+"};
		int output = 30;
		Assert.assertEquals(output, scoreCalculation(ops));
	}
	
	

	@Test
	public void example2() {
		//Edge Case Test Data
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		int output = 27;
		Assert.assertEquals(output, scoreCalculation(ops));
	}
	
	@Test
	public void example3() {
		//Negative Test Data
		String[] ops = {"1"};
		int output = 1;
		Assert.assertEquals(output, scoreCalculation(ops));
	}
	
	/*
	 * --- Pseudo Code ---
	 * 
	 * 1. Create a stack
	 * 2. Traverse through the given string array
	 * 3. If the current string is D, double the value of peek
	 * 4. If the current string is C, pop the value
	 * 5. If the current string is +, 
	 * 		i) pop the latest value
	 * 		ii) sum peek plus pop
	 * 		iii) push popped value into stack
	 * 		iv) push sum into stack
	 * 6. Else, push the Integer value of current string in stack
	 * 7. After traversing through all the values of operations, add each value into sum by popping up from stack
	 * 8. return the sum
	 * 
	 * 
	 */	
	
	private int scoreCalculation(String[] operations) {
		Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
                stack.push(stack.peek() * 2);
            } else if (operations[i].equals("C")){
                stack.pop();
            } else if (operations[i].equals("+")){
                Integer tempVal = stack.pop();
                Integer currVal = stack.peek() + tempVal;
                stack.push(tempVal);
                stack.push(currVal);
            } else stack.push(Integer.valueOf(operations[i]));
        }
        
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
	}
}
