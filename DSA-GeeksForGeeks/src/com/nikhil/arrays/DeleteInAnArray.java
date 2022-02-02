package com.nikhil.arrays;

public class DeleteInAnArray {

	public static void main(String[] args) {
		int[] a= {5,7,10,20,30,10};
		
		int n=6; //last index of the array or size
		int todel=10;

		
		for(int i=0; i<n; i++)
			System.out.println("Size = "+n+", Array : "+a[i]);
		
		n= deleteFirstAppearance(a,n,todel);
		
		System.out.println("Size of new Array = " + n);
		for(int i=0; i<n; i++)
			System.out.println("Size = "+n+", Array : "+a[i]);

	}
	
	static int deleteFirstAppearance(int[] a,int n, int x) {
		int index = -1;
		for(int i=0; i < n; i++) {
			if(a[i] == x) 
			{
				index=i;
				break;
			}			}
		if(index == -1) return n;
		
		for(int j = index ; j < n-1; j++) {
			a[j] = a[j+1];
		}
		a[n-1]=0;
		return n-1;
		}
		
	}


