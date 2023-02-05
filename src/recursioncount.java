import org.junit.Test;

public class recursioncount {
	
	@Test
	public void example()
	{
		int num=1011001111;
		System.out.println(recursion(num));
	}

	private int recursion(int input) 
	{		
		if (input == 0)
			return 0;
		System.out.println(input / 10);
		return (input % 10) + recursion(input / 10);
	}

}
