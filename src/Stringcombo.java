import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Stringcombo {

@Test
public void example()
{
	String s="keeg";
	System.out.println(findcombo(s));
}


//Input: str = “keeg” 
                


//Output: //geke gkee egek egke eegk eekg ekge ekeg geek kgee kege

public List<String> findcombo(String s)
{
	ArrayList<String> al = new ArrayList<>(); 
	     
	    int i=0;

	String temp1=swap(s,0,s.length()-1);
	String temp2=swap(s,i,s.length()-1);
	al.add(temp1);

	return al;
	
}

public String swap(String s, int i, int j)
{
	
   char cleft=s.charAt(i);
   char cright=s.charAt(j);
   
   char temp = cleft;
   cleft=cright;
   cright=temp;
	
	return s;
}
}