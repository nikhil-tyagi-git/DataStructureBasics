package com.nikhil.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,6,3,4,10,3};
		
		for(int i =0 ;i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		selection(a);
		System.out.println();
		for(int i =0 ;i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	 static void selection(int a[]) {

		for(int i =0 ;i < a.length; i++) {
			
			int min = i;
			for(int j=i; j < a.length; j++) {
				if( a[min] > a[j] )
					min=j;
			}
			int temp = a[i];
			a[i]=a[min];
			a[min] = temp;
		}
//		return a;
	}
	

}
