package com.nikhil.arrays;

public class CheckArraySort {
	//checking non decreasing order

	public static void main(String[] args) {
		int[] a= {50,72,110,120,130,130,130,11};
		System.out.println("Array is sorted ? "+check(a));
		System.out.println("Array is sorted ? "+check2(a));
		
	}
	
	static boolean check(int a[]) {
		for(int i = 0 ; i < a.length ; i++) {
			for(int j=i; j<a.length ; j++) {
				if (a[i] > a[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean check2(int a[]) {
		boolean flag = true;
		int j=1; //without this
		for(int i = 0; i < a.length-1 ; i++) { //do int i = 1
			if(a[i] > a[j]) { // a[i-1] > a[i]
				flag = false;
				return flag;
			}
			j++;
		}
		return flag;
	}
	

}
