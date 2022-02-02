package com.nikhil.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,30,42,50,60,65};
		int x=4;
		System.out.println(x+" is at index: "+binary(a,x));
		System.out.println(x+" is at index: "+binary2(a,x,5,0));

	}
	
	static int binary(int[] a, int x) {
		int low=0,high = a.length-1;
		
		while(high >= low) {
			int mid=(low+high)/2;
			
			if(a[mid] == x) return mid;
			
			if(a[mid] > x) high=mid-1;
			
			if(a[mid] < x) low=mid+1;
				
		}
		return -1;
	}
	
	static int binary2(int[] a, int x,int high, int low) {
		if(low>high) return -1;

		int mid=(low+high)/2;
		if(a[mid] == x) return mid;
		else if(a[mid] > x) return binary2(a, x,mid-1,low);
		else return binary2(a, x,high,mid+1);
		
	}

}
