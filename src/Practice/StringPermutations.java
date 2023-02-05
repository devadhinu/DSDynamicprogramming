package Practice;

public class StringPermutations {


	public static void main(String args[]) 
	{
		String inputString = "greek";
		permute(inputString.toCharArray(), 0, inputString.length()-1);
	}

	public static void permute(char[] ary, int startIndex, int endIndex) 
	{
		if(startIndex == endIndex)
		{
			System.out.println(String.valueOf(ary));
		}
		else
		{
		
			for(int i=startIndex;i<=endIndex;i++) 
			{
				swap(ary, startIndex, i );
				permute(ary, startIndex+1, endIndex);
				swap(ary, startIndex, i );
			}
		}
	}

	public static void swap(char[] ary, int x, int y) 
	{
		char temp = ary[x];
		ary[x] = ary[y];
		ary[y] = temp;
	}
}

