package com.nikhil.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {50,72,110,120,130,130,130,11};

		System.out.print("Array before reverse : ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		
		ReverseArray ra = new ReverseArray();
		ra.reverse(a); System.out.println();
		
		System.out.print("Array after reverse : ");
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
	}
	
	 void reverse(int a[]) {
		int temp=0;
		int high=a.length-1;
		int low = 0;
		
		while(low < high){
			temp= a[low];
			a[low]=a[high];
			a[high]= temp;
			low++; 
			high--;
		}
	}

}
