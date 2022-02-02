package com.nikhil.mathematics;

public class LowestCommonMultiple {

	public static void main(String[] args) {
		System.out.println(efficientLCM(17,17));
		System.out.println(gcd(144,6));
	}

	public static int LCM(int a, int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res % a == 0 && res % b == 0) {
				return res;
			}
			res++;
		}
	}
	
	public static int gcd(int a, int b) {
		while (a!=b) {
			if( a > b ) {
				a=a-b;
			}
			else b=b-a;
		}
		return a;
	}
	
	public static int efficientLCM(int a, int b) {
		return a*b/gcd(a,b);
	}

		
}
