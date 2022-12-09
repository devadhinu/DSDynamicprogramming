package Hashing;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class FIndthetownJudge {

	//	997. Find the Town Judge
	/*
	 * In a town, there are n people labeled from 1 to n. There is a rumor that one
	 * of these people is secretly the town judge.
	 * 
	 * If the town judge exists, then:
	 * 
	 * The town judge trusts nobody. Everybody (except for the town judge) trusts
	 * the town judge. There is exactly one person that satisfies properties 1 and
	 * 2. You are given an array trust where trust[i] = [ai, bi] representing that
	 * the person labeled ai trusts the person labeled bi.
	 * 
	 * Return the label of the town judge if the town judge exists and can be
	 * identified, or return -1 otherwise.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: n = 2, trust = [[1,2]] Output: 2
	 * 
	 * Example 2:
	 * 
	 * Input: n = 3, trust = [[1,3],[2,3]] Output: 3 
	 * 
	 * Example 3:
	 * 
	 * Input: n = 3, trust = [[1,3],[2,3],[3,1]] Output: -1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= n <= 1000 0 <= trust.length <= 104 trust[i].length == 2 All the pairs of
	 * trust are unique. ai != bi 1 <= ai, bi <= n
	 */
	@Test
	public void positive() {
		//Positive Test Data
		int n=2;
		int[][] trust = {{1,2}};
		int output = 2;
		Assert.assertEquals(findJudge(n,trust), output);
	}

	@Test
	public void positive2() {
		//Positive Test Data
		int n=2;
		int[][] trust = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		int output = -1;
		Assert.assertEquals(findJudge(n,trust), output);
	}

	@Test
	public void edge() {
		//Edge Case Test Data
		int n=1;
		int[][] trust = {};
		int output = 1;
		Assert.assertEquals(findJudge(n,trust), output);
	}

	@Test
	public void negative() {
		//Negative Test Data
		int n = 3;
		int[][] trust = {{1,3},{2,3},{3,1}};
		int output = -1;
		Assert.assertEquals(findJudge(n,trust), output);
	}

	public int findJudge(int n, int[][] trust) 

	{

		if(trust.length==0 && n>1) return -1;
		if(trust.length==0 && n==1) return 1;
		int judge=0;

		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0;i<trust.length;i++)
		{
			hm.put(trust[i][1], hm.getOrDefault(trust[i][1],0)+1);

			if(hm.get(trust[i][1])==n-1) judge=trust[i][1];	
		}

		if(judge ==0) return -1;

		for(int i=0;i<trust.length;i++)
		{
			if(trust[i][0]==judge) return -1;
		}

		return judge;
	}
}

