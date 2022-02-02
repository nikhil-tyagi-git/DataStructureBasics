package com.nikhil.mathematics;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		int n=13;
		long f = fact(n);
		System.out.println(n+"! = "+f);
		System.out.println("Trailing zeros in "+n+"! are "+trailingCheckBasic(f));
		System.out.println("Trailing zeros in "+n+"! are "+trailingCheck(n));

	}
	
	public static int trailingCheckBasic(long f) {
		int c=0;
		while(f%10 == 0) {
			c++;
			f=f/10;
		}
		return c;
	}
	
	public static long fact(int n) {
		if (n==0) return 1;
		return n*fact(n-1);
	}
	
	public static int trailingCheck(int n) {	
		int count = 0;
		for(int i=5; i <= n; i=i*5) {
			count=count + n/i;
		}
		return count;
}
}
