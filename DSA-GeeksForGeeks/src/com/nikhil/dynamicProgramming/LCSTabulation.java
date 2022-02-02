package com.nikhil.dynamicProgramming;

import java.util.Arrays;

public class LCSTabulation {

	static int[][] dp;
	public static void main(String[] args) {

		String s1="ABCDX";
		String s2 = "AXPCSDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAX";
		
		int m= s1.length();
		int n= s2.length();
				
		dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=1; i <= m; i++) {
			for(int j=1; j <= n ; j++) {
				
				if(s1.charAt(i-1) == s2.charAt(j-1))
					dp[i][j] = 1 + dp[i-1][j-1];
				else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
				
			}
		}
		System.out.println("Length of LCS : "+dp[m][n]);
	}

}
