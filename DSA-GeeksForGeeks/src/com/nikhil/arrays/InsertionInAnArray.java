package com.nikhil.arrays;

public class InsertionInAnArray {

	public static void main(String[] args) {
		int[] a= new int[5];
		a[0]=5; a[1]=7; a[2]= 10; a[3]=20;
		
		int n=4; //last index of the array or size
		int pos=2, toInsert=3;
		
		for(int i=0; i<n; i++)
			System.out.println("Size = "+n+", Array : "+a[i]);
		
		n= insert(a,n,toInsert,pos,5);
		
		System.out.println("Size of new Array = " + n);
		for(int i=0; i<n; i++)
			System.out.println("Size = "+n+", Array : "+a[i]);
	}
	
	private static int insert(int[] a,int n, int x, int pos, int cap) {
		if(n == cap) return n;
		int index=pos-1;
		for(int i = n - 1; i >= index; i--)
			a[i+1]= a[i];
		a[index] = x;
		return n+1;
	}

}
