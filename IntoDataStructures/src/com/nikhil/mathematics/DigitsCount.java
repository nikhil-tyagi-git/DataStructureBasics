package com.nikhil.mathematics;

/*n = 123
count=3*/

public class DigitsCount {

	public static void main(String[] args) {
		System.out.println(countDigit(12341234));
	}
	
	public static int countDigit(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c=c+1;
		}
		return c;
	}

}
