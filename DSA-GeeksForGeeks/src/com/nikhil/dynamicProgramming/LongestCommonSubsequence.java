package com.nikhil.dynamicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCD";
		String s2 = "AXPCSD";
		System.out.println("Length of LCS : "+lcsCalc(s1,s2,s1.length(),s2.length()));
	}
	
	static int lcsCalc(String s1, String s2, int m, int n) {
		
		if(m==0||n==0) return 0;
		
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			return 1+ lcsCalc(s1,s2,m-1,n-1);
		}
		else {
			return Math.max(lcsCalc(s1,s2,m-1,n), lcsCalc(s1,s2,m,n-1));
		}
	}

}
