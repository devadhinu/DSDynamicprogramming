package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Findthetwnjudge {
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

	@Test
	public void positive5() {
		//Negative Test Data
		int n = 3;
		int[][] trust = {{1,3},{2,3},{4,3}};
		int output = -1;
		Assert.assertEquals(findJudge(n,trust), output);
	}
//	
//	a[0,0]  1 3 a[0,1]
//	a[1,0]  2 3 a[1,1]
//	a[2,0]  3 1 a[2,1]

	 public int findJudge(int n, int[][] trust) 
	 {
		int judge = 0; 
       HashMap<Integer, Integer> hm = new HashMap<>();
       
       if(trust.length==0 && n==1) return 1;
       
       if(trust.length==0 && n>1) return -1;
   
       for(int i=0;i<trust.length;i++)
       {
    	   hm.put(trust[i][1],hm.getOrDefault(trust[i][1],0)+1);
       }
       
       if(hm.get(trust[0][1])==n-1)judge =trust[0][1];
       
       if(judge==0)return -1;
       
       for(int i=0;i<trust.length;i++)
       {
    	  if(trust[i][0]==judge)return -1;
       }
       return judge;
   	 }


}
