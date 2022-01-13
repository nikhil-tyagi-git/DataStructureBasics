package com.nik.arrays;

public class DistanceBwTwoNum {

	public static void main(String[] args) {

		DistanceBwTwoNum d = new DistanceBwTwoNum();
		int arr[] = { 3, 5, 4, 2, 6, 0, 0, 5, 4, 8, 3 };

		System.out.println(d.minDist(arr, 3, 6));
		System.out.println(d.minDis(arr, 6, 3));
	}

	int minDist(int arr[], int x, int y) {
		int m = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (((arr[i] == x && arr[j] == y) || arr[j] == x && arr[i] == y) && m > Math.abs(i - j))
					m = Math.abs(i - j);
			}
		}
		return m;
	}

	int minDis(int arr[], int x, int y) {
		int m = Integer.MAX_VALUE;
		int p = -1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x || arr[i] == y) {

				if (p != -1 && arr[i] != arr[p])
					m = Math.min(m, i - p);

				p = i;
			}
		}

		return m;
	}
}
