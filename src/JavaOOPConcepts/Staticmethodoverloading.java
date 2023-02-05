package JavaOOPConcepts;

public class Staticmethodoverloading {

	
    //we can overload a static method
	
	public static void display()   
	{   
	System.out.println("Static method called.");   
	}   
	
	
	//overloaded static method  
	public static void display(int x)   
	{   
	System.out.println("An overloaded static method called.");   
	}   

	public static void main(String args[])   
	{   
	//calling static method by using the class name.method name
		
		Staticmethodoverloading.display();   
		Staticmethodoverloading.display(160);   
	}   
}
