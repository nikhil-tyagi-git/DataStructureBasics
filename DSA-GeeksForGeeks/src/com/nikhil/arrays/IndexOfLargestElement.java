package com.nikhil.arrays;

public class IndexOfLargestElement {

	public static void main(String[] args) {
		int[] a= {500,72,10,20,30,100};
		
		System.out.println("Largest Element is at index number "+findLargest(a));
	}
	
	static int findLargest(int a[]) {
		int l = a[0], index=0;
		for (int i = 0; i < a.length ; i++) {
			if( a[i] > l) {
				l=a[i];
				index=i;
			}
		}
		return index;
	}

}
