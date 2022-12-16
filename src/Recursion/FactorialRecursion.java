package Recursion;

import org.junit.Assert;
import org.junit.Test;

public class FactorialRecursion {
	
	@Test
	public void example1()
	{
		int n=2;	
		int op= 2;

		//Explanation: 2! = 2*(2-1)=2

		Assert.assertEquals(findfactorial(n),op);
	}
	@Test
	public void example2()
	{
		int n=5;	
		int op= 120;

		///Explanation: 5! = 5*(5-1)*(4-1)*(3-1)*(2-1)*(1-1)

		Assert.assertEquals(findfactorial(n),op);
	}
	@Test
	public void example3()
	{
		int n=4;	
		int op= 24;
		//Explanation: F(4) = 4*(4-1)*(3-1)*(2-1)*(1-1)

		Assert.assertEquals(findfactorial(n),op);
	}

	public int findfactorial(int n) 
	{
		return factorial(n);

	}

	private int factorial(int n) 
	{
	
		
		if(n==0)
		{
			return 1;
		}
		return n* factorial(n- 1);


	}	

}
