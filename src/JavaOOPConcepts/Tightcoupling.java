package JavaOOPConcepts;

import java.io.IOException;

class Italian {

	TightcoupleInterface s;

	public Italian(TightcoupleInterface s)
	{

		this.s = s;

	}

	public void display(){

		System.out.println("Italian");

		s.display();

	}

}

class Chinese implements TightcoupleInterface {

	public Chinese()
	{}

	public void display(){

		System.out.println("Chinese");

	}

}

class Mexican implements TightcoupleInterface {

	public Mexican()
	{
		
	}

	public void display()
	{

		System.out.println("Mexican");

	}

}

public class Tightcoupling 
{

	public static void main(String args[]) throws IOException {

		TightcoupleInterface b = new Chinese();

		TightcoupleInterface c = new Mexican();

		Italian a = new Italian(b);

		//a.display() will print Italian and Chinese

		a.display();

		Italian a1 = new Italian(c);

		//a.display() will print Italian and Mexican

		a1.display();

	}

}

