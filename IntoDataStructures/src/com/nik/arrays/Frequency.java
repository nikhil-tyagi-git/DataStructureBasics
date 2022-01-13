package com.nik.arrays;

public class Frequency {
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,1};
		int n = 4;
		 System.out.println(n);		 
		 for(int i = 0 ; i < n ; i++){
			  System.out.print(arr[i]+" ");
		 }
		System.out.println();
		 frequencycount( arr, n);
	}
	    public static void frequencycount(int arr[], int n)
	    {
	        int[] a = new int[n];
	        int[] c  = new int[n];
	        for(int i = 0 ; i < n ; i++){
	            a[i]=i+1;
	            for(int j = 0 ; j < n; j++){
	            if(a[i] == arr[j] )
	            {
	                c[i]++;
	            }
	        }
	        System.out.print(c[i]+" ");
	    }
	}
}
