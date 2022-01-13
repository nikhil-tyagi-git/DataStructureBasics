package com.nik.arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber p = new PrimeNumber();
		int c =77;
		p.check(c);
		
	}
	
	void check(int c) {
		boolean p = true;
		if(c < 2) {
			System.out.println("Invalid or not a prime number");
		}
		for(int i = 2; i <= c/2; i++) {
			if(c % i == 0) {
				//System.out.println("Not Prime");
				p=false;
				break;
			}
		}
		System.out.println("Number "+c+" is Prime? "+p);
	}

}
