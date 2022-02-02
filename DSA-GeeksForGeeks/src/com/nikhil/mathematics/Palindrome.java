package com.nikhil.mathematics;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println(check(1231));
	}
	public static boolean check(int n) {
		int p=0,x=0;
		while(n != 0) {
			x=n%10;
			n=n/10;
			p=p*10+x;
		}
		if(n==p) return true;
		return false;
	}
}
