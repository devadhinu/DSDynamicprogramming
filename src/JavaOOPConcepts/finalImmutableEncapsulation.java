package JavaOOPConcepts;



public final class Employee 
{

	final String pancardNumber;    
	public Employee(String pancardNumber)  
	{    
		this.pancardNumber=pancardNumber;    
	}  
	public String getPancardNumber(){    
		return pancardNumber;    
	}    
}
public class finalImmutableEncapsulation  
{  
	public static void main(String ar[])  
	{  
		Employee e = new Employee("ABC123");  
		String s1 = e.getPancardNumber();  
		System.out.println("Pancard Number: " + s1);  
	}  

}
