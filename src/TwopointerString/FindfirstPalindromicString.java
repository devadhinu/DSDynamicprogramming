package TwopointerString;

import org.junit.Assert;
import org.junit.Test;

public class FindfirstPalindromicString 
{
	/*
	 * 2108. Find First Palindromic String in the Array
	 * 
	 * Given an array of strings words, return the first palindromic string in the
	 * array. If there is no such string, return an empty string "".
	 * 
	 * A string is palindromic if it reads the same forward and backward.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: words = ["abc","car","ada","racecar","cool"] Output: "ada"
	 * Explanation: The first string that is palindromic is "ada". Note that
	 * "racecar" is also palindromic, but it is not the first. Example 2:
	 * 
	 * Input: words = ["notapalindrome","racecar"] Output: "racecar" Explanation:
	 * The first and only string that is palindromic is "racecar". Example 3:
	 * 
	 * Input: words = ["def","ghi"] Output: "" Explanation: There are no palindromic
	 * strings, so the empty string is returned.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= words.length <= 100 1 <= words[i].length <= 100 words[i] consists only
	 * of lowercase English letters.
	 */

//	@Test
//	public void positive() {
//		//Positive Test Data
//		String words[] = {"abc","car","ada","racecar","cool"};
//		String output = "ada";
//		Assert.assertEquals(firstPalindrome(words), output);
//	}
//
//	@Test
//	public void positive2() {
//		//Negative Case Test Data
//		String words[] = {"abc","car","","cool","racecar"};
//		String output = "racecar";
//		Assert.assertEquals(firstPalindrome(words), output);
//	}
//
//	@Test
//	public void negative() {
//		//Negative Case Test Data
//		String words[] = {"notapalindrome","test"};
//		String output = "";
//		Assert.assertEquals(firstPalindrome(words), output);
//	}
//
//	@Test
//	public void edge() {
//		//Negative Test Data
//		String words[] = {"racecar","ada","ssddss"};
//		String output = "racecar";
//		Assert.assertEquals(firstPalindrome(words), output);
//	}
	@Test
	public void edge4() {
		//Negative Test Data
		String words[] = {"umicrszeaswtfmctwvoogehszwdjrwdcgyxxetbzevxrqphubyqbgpfetguyv","vzdzfwyevkvqhmvqssnvpayihawydzcovzmh","drvqqepesvornphmikbimxennygxisdysssmxjmaaecaqiwdgfxitoopigxauoojsebjmbcrymvpnnfomlkg","vvszfvtykdyfiywxgxmjpcawzdaovbujmexggwczovhspkrdsskxzrpgfaspnbncdspktcyfkkshpyojwwlysizd","epdtgfhgninnwqzztwm","dmhynaogcxyaxsghzjwzyqfuwyinstxoqcdkxeobinpqeplw","ruhxgdrzfyqyqmxclfqosyczqapiizxlzgixdxthhrv","dwcblqnxtrwtqmtqenidhxnifdbmdvobwmcvwjxgbyjzgvrqzlskjbfirauguhyyjhlotuckssrkqzppzbqd","gxdq","paesyowqeguvxozbixjqppeagycjx","glstauwugkidegnllapgzbzchckepmhbameuigsiqywbilwolxuwzzjwzouqknhlkbjzejxtponmkqjlojurxnryxyqy","inyhioiwanafuhsprudtkqztoakxhbmqcmibsxlhycbmqrvtfabsncmiymthcxwkwkq","djknenppuleedpptrfjgqfejcoghnxjlvjalxkyvnujgiiwdbtvgqvgsivkzqcrbfcvooyhqmrlacyiozytmampjwpknrj","zzrpjoogwkdmdxdkdwgwugqtmzryrgtelnvydyqewpdzzptqzvffppgnhhcaiqotmyslntlwjajzuzbawidpxjtyxryg","xmegifttkamzbpjqbghgwdrkvtnuwfmjdmwehdqiyvgpxxlbkcvkemjbmhbyeqyfssytuwaeysvgnidhcgpncxdxxzhrkbvyqfrs","wgljaiyhyfdijjgihseciabfcoqfojhswewpkpartzmaaglvdfifpptycyonigwcgyklapzojivgojcrevugspejmwanolg","oceurgzgvvctgydqexhghwcochhmtoxjugreqfdnsshffngchetrwedhinosdhwlgviohpkjowr","dyl","vjxkcihfmnmmz","aheg","dwsomlqmaqifihkwahvywzqamgominhxfsgrgbgvoiopnikhxonpetelfsguvhxgiujrij","pdrjgfqzyqczpwdsfzypgkmsvnpboutmcffqrwuzkchaufymmczrdwulbvbanungpxqk","eudbizaabgfzqytowifsuovmxmkjgajtliyfycbrkxeaarakapqoihawmdzmglfnglpwqnfd","txdclnfwxevu","kslqrafjshhadqszeljcekrpnpxqgppbnadmzmpufvadcghxqdqmafpbnutifigstxyilmgx","yhhvhyoolv","sjtubggxcla","vydf"};
		String output = "racecar";
		Assert.assertEquals(firstPalindrome(words), output);
	}
	
//	["xngla","e","itrn","y","s","pfp","rfd"]

	public String firstPalindrome(String[] words) 
	{
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i]=="")return "";
			
			if(words[i].length()<=1) 
				{
				return words[i];
				}
			
			char[] str =words[i].toCharArray();
			
			int left=0,right=str.length-1;
			
			if(findPalindrome(str,left,right)==true) return words[i];
			
			else continue;

		}        
		return "";  

	}

	private boolean findPalindrome(char[] str ,int left, int right)
	{
		
		while(left<=right)
		{
			if(str[left++]==str[right--]) 
			{
				left++;
				right--;
				
			}
			else return false;		
		}
		
		return true
				;


	}

}
