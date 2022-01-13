package com.nik.arrays;

public class ArrayGFG {

	public static void main(String[] args) {

		ArrayGFG a = new ArrayGFG();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//printArr(arr);
		//System.out.println();
		//a.rotate(arr, 3);
		//printArr(arr);
		System.out.println();
		a.leftRotate(arr, 2);
		printArr(arr);
	}

	static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	int[] rotate(int arr[], int d) {
		int l = arr.length;
		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		// printArr(temp);

		for (int i = 0; i < l - d; i++) {
			arr[i] = arr[i + d];
		}
		 printArr(arr);

		for (int i = 0; i < d; i++) {
			arr[l - d + i] = temp[i];
		}
		 printArr(arr);
		return arr;
	}
	
	int[] leftRotate(int[] arr, int d) {
		
		for(int i = 0 ; i < d; i++) {
			rotateOneByOne(arr);
		}
		return arr;
	}

	int[] rotateOneByOne(int arr[]) {

		int temp = arr[0];
		
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length - 1]=temp;
		return arr;
	}

}
