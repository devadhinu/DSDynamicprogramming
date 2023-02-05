import org.junit.Test;

public class Interview {

	@Test
	public void example()
	{
		String s= "aaabbbbccddddeeed";
		String output ="a3b4c2d4e3d1";
		findoccurence(s);
	}


	//	Psueducode:
	//    1)Take two pointers t tarverse throuhg the entire string
	//	  2)Subtract the index values when there is a change in the value
	//      3)repeat till the length of the string
	//	    4)Append it in a string builder and return that as a string

	public String findoccurence(String s)
	{
		int left=0,right=0;
		String result="";
		int count=1;
		
		StringBuilder sb =new StringBuilder();

		//char[] ch = s.toCharArray();
		
		while(right<s.length())
		{

			
			if(s.charAt(left)==s.charAt(right))
				{
				count++;
				right++;
				}

			if(s.charAt(left)!=s.charAt(right))
			{
				sb=sb.append(s.charAt(left)+String.valueOf(count));
				count=1;
				left=right;			

			}
					
  	//		result=sb.toString();
            
			
		}
		System.out.println(s.charAt(left));
		if(right>=s.length())sb=sb.append(s.charAt(left)+String.valueOf(right-left));
		System.out.print(result);
		return sb.toString();

	}

}
