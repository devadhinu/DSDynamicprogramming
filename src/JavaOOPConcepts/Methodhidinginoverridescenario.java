package JavaOOPConcepts;

/*
 * No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time. 
So, we cannot override static methods.

The calling of method depends upon the type of object that calls the static method. It means:

If we call a static method by using the parent class object, the original static method will be called from the parent class.
If we call a static method by using the child class object, the static method of the child class will be called.
In the following example, the ParentClass has a static method named display() and the ChildClass also has the same method signature. 
The method in the derived class (ChildClass) hides the method in the base class. let's see an example.
*/
public class Methodhidinginoverridescenario 
{

	//WE CANNOT OVERRIDE A STATIC METHOD
	
	public static void main(String args[])
	{
		
      // Creating a parent class object and assigning to child class will invoke parent class method
	  // child class method will be hidden here(method hiding its called)
		
		ParentClass pc =new ChildClass();
		pc.display();
	}
}

class ParentClass
{

	public static void display()
	
	{
		System.out.println("I am parent here");
	}

}
class ChildClass extends ParentClass
{

	public static void display()
	
	{
		System.out.println("I am child here");
	}

}
