package com.nikhil.arrays;

public class LeftRotateByD {

	public static void main(String[] args) {
		int[] a = { 1,2,3};
		rotateReversal(a,2);
		//leftRotate2(a,4);
		System.out.print("Array after rotating : ");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
	}

	static void left(int a[],int d) {
		for(int i = 0; i < d; i++)
			leftRotate(a);
	}
	
	static void leftRotate(int a[]) {
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = temp;
	}
	
	static void leftRotate2(int a[], int d) {
		int temp[] = new int[d];
		int j=d;
		for(int i =0; i <d; i++) {
			temp[i]=a[i];
		}
		
		for(int i=0; i < a.length-d; i++) {
			a[i]= a[d+i]; // j = d+i
			//j++;
		}
		int k=0;
		for(int i=a.length-d ; i < a.length ; i++) { 
			a[i] = temp[k];
			k++;
		}
	}
	
	static void rotateReversal(int a[], int d) {
		rotate(a,0,d-1);
		rotate(a,d,a.length-1);
		rotate(a,0,a.length-1);
	}
	
	static void rotate(int a[],int low, int high) {
		int temp = 0;
		while(high > low) {
			temp = a[low] ;
			a[low]=a[high];
			a[high]=temp;
			low++;high--;
		}
	}
}
