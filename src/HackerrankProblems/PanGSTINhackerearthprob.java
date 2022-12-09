package HackerrankProblems;

import org.junit.Assert;
import org.junit.Test;

public class PanGSTINhackerearthprob {
	
	/*
	 * : PANGSTIN Validation It is compulsory to provide your PAN while registering
	 * for a GSTIN. In fact, your GSTIN number is intrinsically linked to your PAN
	 * as the image below shows:
	 * 
	 * 
	 * cleartax Format of GSTIN Know your GSTIN Permanent Account Number (PAN) 22
	 * AAAAA0000A 1 Z 5 State code Entity number of the same PAN holder in a state
	 * Alphabet 'Z' by default Check sum digit Write a function that validates
	 * whether a given GSTIN and PAN correspond with each other, or not. Write a
	 * function that validates whether a given GSTIN and PAN correspond with each
	 * other, or not.
	 * 
	 * Sample input > 
	 * AACCC6016B, 29AACCC6016B1Z4 
	 * AACCC6016B, 29AACCC6017B1Z4
	 * AACCC6016b, 29AACCC6016B1Z4
	 * 
	 * Sample output:
	 * true 
	 * false 
	 * true
	 * 
	 * Note: Your code must be able to print the sample output from the provided
	 * sample input. However, your code is run against multiple hidden test cases.
	 * Therefore, your code must pass these hidden test cases to solve the problem
	 * statement. Limits Time Limit: 5.0 sec(s) for each input file Memory Limit:
	 * 256 MB Source Limit: 1024 KB
	 */
	@Test
	public void example()
	{
		String pan ="AACCC6016B";
		String GST="29AACCC6016B1Z4";
		boolean output= true;
		Assert.assertEquals(iscorrectGST(pan,GST), output);
	}
	@Test
	public void example2()
	{
		String pan ="AACCC6016B";
		String GST="29AACCC6017B1Z4";
		boolean output= false;
		Assert.assertEquals(iscorrectGST(pan,GST), output);
	}
	@Test
	public void example3()
	{
		String pan ="AACCC6016B";
		String GST="29AACCC6016B1Z4";
		boolean output= true;
		Assert.assertEquals(iscorrectGST(pan,GST), output);
	}
	
	public boolean iscorrectGST(String pan ,String GST)
	{
		String substr=GST.substring(2, 12);
		
		if(pan.equalsIgnoreCase(substr))return true;
		
		return false;
		
	}
}
