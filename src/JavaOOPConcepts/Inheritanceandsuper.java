package JavaOOPConcepts;

class Employee
{
	String name;
	double salary;
	Employee(String n,double s)
	{
		name=n;
		salary=s;
	}
	String getName()
	{
		return name;
	}
	void setName(String n)
	{
		name=n;
	}
	double getSalary()
	{
		return salary;
	}
	void setSalary(double s)
	{
		salary=s;
	}
	void raiseSalary(double p)
	{
		salary+=salary*p/100;
	}
}

class Manager extends Employee //derived class /inherited class
{
	double bonus;
	Manager(String n, double s,double b) 
	{
		super(n, s);
	}

	void setBonus(double b)
	{
		bonus=b;
	}
	public double getSalary()
	{
		//salary+=bonus;
		//return salary;
      return super.getSalary()+bonus;
		
	}

}

public class Inheritanceandsuper {

	public static void main(String args[])
	{
		Employee e1 =new Employee("Karam",1000);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary());

		Manager m1 = new Manager("Raja",5500,0.0);
		m1.setBonus(10000);
		System.out.println(m1.getSalary());//salary with bonus added
		
//		Manager m2 =new Employee();///not allowed
		
		Employee e2 =new Manager("Ramye",55000,12); //polymorphism ,top casting 
		
		
		System.out.println(e2.getSalary());
		
		//****************Employee Object array************************
		
//		Employee[] emp =new Employee[4];
//		emp[0]= new Employee("DD",1000);
//		emp[1]= new Employee("DS",5000);
//		emp[2]= new Employee("SA",10000);
//		emp[3]= m1;
//		emp[4]= e1;
//		
		
	}

}
