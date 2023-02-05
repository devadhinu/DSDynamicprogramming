package Recursion;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FibnocciNo {

	/*
	 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
	 * Fibonacci sequence, such that each number is the sum of the two preceding
	 * ones, starting from 0 and 1. That is,
	 * 
	 * F(0) = 0, F(1) = 1 F(n) = F(n - 1) + F(n - 2), for n > 1. Given n, calculate
	 * F(n).
	 */
	@Test
	public void example1()
	{
		int n=2;	
		int op= 1;

		//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

		Assert.assertEquals(fib(n),op);
	}
	@Test
	public void example2()
	{
		int n=3;	
		int op= 2;

		//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

		Assert.assertEquals(fib(n),op);
	}
	@Test
	public void example3()
	{
		int n=4;	
		int op= 3;
		//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

		Assert.assertEquals(fib(n),op);
	}

	public int fib(int n) 
	{
		return findfib(n);

	}

	private int findfib(int n) 
	{
		
		if(n>=2)
		{
			return findfib(n- 1)+findfib(n- 2);
		}
		if(n==1) return 1;

		return 0;


	}	

}
