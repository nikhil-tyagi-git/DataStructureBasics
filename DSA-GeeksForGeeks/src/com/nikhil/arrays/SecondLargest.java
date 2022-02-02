package com.nikhil.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = { 50,100,25,35,35,40,45 };

		System.out.println(
				"Second largest element is at index number " + findSecondLargest(a) + " " );
		System.out.println(
				"Second largest element is at index number " + secondLargest(a) + " " );
	}

	static int findLargest(int a[]) {
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[index]) {
				index = i;
			}
		}
		return index;
	}

	static int findSecondLargest(int a[]) {
		int l =  findLargest(a);
		int index=-1;
		System.out.println("Largest : "+a[l]);
		
		for (int i = 0; i < a.length ; i++) {
			if(a[i] != a[l]) {
				if(index == -1){
					index=i;
					}
				else if (a[i] > a[index]){
					index=i;
				}
			}
		}
		return index;
	}
	
	static int secondLargest(int a[]) {
		
		int second =-1;
		int l = 0;
		
		for(int i=1; i < a.length; i++) {
			if(a[i] > a[l]) {
				second = l;
				l=i;
			}
			else if( a[i] < a[l]) {
				if (second == -1 || a[i] > a[second]) second =i;
			}
		}
		System.out.println("Second "+a[second]);
		return second;
	}

}
