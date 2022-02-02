package com.nikhil.mathematics;

public class Factorial {

	public static void main(String[] args) {
		int n=6;
		System.out.println(n+"! = "+check(n));
		System.out.println(n+"! = "+check2(n));
	}
	
	public static int check(int n) {
		int f=1;
		while(n!=0) {
			f=f*n;
			n--;
		}
		return f;
	}
	
	public static int check2(int n) {
		if(n==0) return 1;
		return n * check2(n-1);
	}

}
