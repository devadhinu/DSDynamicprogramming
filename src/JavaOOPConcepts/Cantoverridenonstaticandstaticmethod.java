package JavaOOPConcepts;


// the override methods with static keyword  and non static type cannot be achiveed.
// compilie issue as below will come
public class Cantoverridenonstaticandstaticmethod
{
	//static method
	public static void sum(int a, int b)   
	{   
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	}   
	
	//non-static method   
	public void sum(int a, int b)   
	{   
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	}   

	
	public static void main(String args[])   
	{   
	//calling static method by using the class name  
		Cantoverridenonstaticandstaticmethod.sum(12, 90);   
	}   

}
