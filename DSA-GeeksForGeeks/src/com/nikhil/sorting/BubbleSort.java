package com.nikhil.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {2,5,1,6,3,4};
		
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		bubble(a);
		System.out.println();
		System.out.println("After sorting");

		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	
	static void bubble(int a[]) {
		
		for(int i=0; i < a.length-1; i++) {
			for(int j=0; j < a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
				
		}
}
	}


