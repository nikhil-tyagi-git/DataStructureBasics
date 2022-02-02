package com.nikhil.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {50,50,110,110,130,130,130};
		int n = check2(a);
		System.out.print("Array after removing duplicates : ");
		for(int i=0; i<n; i++)
			System.out.print(" "+a[i]);
	}
	
	static int check(int a[]) {
		int temp[] = new int[a.length];
		temp[0]=a[0];
		int res = 1;
		for(int i = 1 ; i < a.length ; i++ ) {
			if(temp[res-1] != a[i]) {
				temp[res]=a[i];
				res++;
			}
		}
		for(int i=0; i<res; i++) {
			a[i]=temp[i];
		}
		return res;
	}
	
	static int check2(int a[]) {
		
		int res = 1;
		for(int i = 1 ; i < a.length ; i++ ) {
			if(a[res-1] != a[i]) {
				a[res]=a[i];
				res++;
			}
		}
		return res;
	}

}
