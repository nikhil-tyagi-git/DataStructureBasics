package com.nikhil.mathematics;

public class HighestCommonFactor {

	public static void main(String[] args) {
		System.out.println(HCF(50,20));
		System.out.println(GCDEuclidean(220,20));
		System.out.println(GCDEuclideanModulous(22020,240));
	}
	
	public static int HCF(int n, int p) {
		int gcd = Math.min(n, p);
		
		while(gcd > 0) {
			if (n % gcd ==0 && p%gcd ==0) {
				break;
			}
			gcd--;
		}
		return gcd;
	}
	public static int GCDEuclidean(int a, int b) {
		while( a != b) {
			if(a>b) a=a-b;
			else b=b-a;
		}
		return a;
	}
	
	public static int GCDEuclideanModulous(int a, int b) {
		if (b==0) return a;
		else return GCDEuclideanModulous(b, a%b);
	}
	
}
