package com.nikhil.arrays;

public class LeftRotateByOne {

	public static void main(String[] args) {
		int[] a= {50,55,110,114,130,136,150};
		left(a);
		System.out.print("Array after rotating : ");
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
	}
	
	static void left(int a[]) {
		int temp=a[0];
		for(int i=0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
	
}
