package com.nikhil.dynamicProgramming;

import java.util.Arrays;

public class LCSMemoization {
	
	static int[][] memo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDX";
		String s2 = "AXPCSDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAX";
		
		memo = new int[s1.length()+1][s2.length()+1];
		
		for(int[] i: memo)
	    {
	        Arrays.fill(i,-1);
	    }
	    
		System.out.println("Length of LCS : "+lcsCalc(s1,s2,s1.length(),s2.length()));
	}
	
	static int lcsCalc(String s1, String s2, int m, int n) {
		
		if(memo[m][n] != -1) 
			return memo[m][n];
		
		if(m==0||n==0) 
			memo[m][n]=0;
		else {
			if(s1.charAt(m-1) == s2.charAt(n-1)) {
				memo[m][n]= 1+ lcsCalc(s1,s2,m-1,n-1);
			}
			else {
				memo[m][n]= Math.max(lcsCalc(s1,s2,m-1,n), lcsCalc(s1,s2,m,n-1));
			}
		}
		return memo[m][n];
	}

}
