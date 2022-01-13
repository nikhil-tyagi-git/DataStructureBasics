package com.nik.arrays;

public class PrintDuplicate {

	public static void main(String[] args) {

		PrintDuplicate p = new PrintDuplicate();
		int[] arr = { 1, 2, 3, 1, 5, 1, 7, 8, 3, 5 };

		System.out.println();
		p.findDup(arr);
		p.printEven(arr);
	}

	void findDup(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
	
	void printEven(int[] arr) {
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}
}
