package com.nik.arrays;

public class ReArrangeArray {

	public static void main(String[] args) {

		int temp;
		int[] arr = { 19, 7, 0, 0, 2, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4,0,0,0 };
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i)
				{
					temp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = temp;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i) arr[i] =-1;
		}
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" ");
		
		reArrange(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) 
		System.out.print(arr[i]+" ");
	}
	
	static int[] reArrange(int[] a) {
		int temp[] = new int[a.length];
		for(int i=0; i < a.length;i++)
			temp[i]=-1;
		int j = 0;
		
		for(int i=0; i < a.length;i++) {
			if(j == a[i]) temp[j] = j;
			j++;
		}
		return temp;
	}

}
