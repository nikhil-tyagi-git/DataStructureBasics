package com.nikhil.mathematics;

public class PrimeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(100));
	}
	   public static int countPrimes(int n) {
	        int e=0;
	        if(n<2) return e;
	        for(int i=2; i < n;i++){
	            if(isPrime(i) == true)
	                e=e+1;
	        }
	        return e;
	    }
	    
	    static boolean isPrime(int n){
	        boolean res=true;
	        if(n<3) return res;
	        for(int i=2; i <= n/2; i++){
	            if(n%i == 0){
	                res=false;
	                //System.out.println(i);        
	                }   
	        }
	        return res;
	    }

}
