package com.nikhil.arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] a= {0,0,11,1,0,7,13,0};
		
		System.out.print("Array before moving zeros : ");
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
		
		System.out.println();
		moveZerosEffectively(a);
		System.out.println();
		
		System.out.print("Array after moving zeros : ");
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
		
	}
	
	static void moveZeros2(int a[]) {
		int temp[] = new int[a.length];
		int j=0;
		for(int i=0; i < a.length; i++ ) {
			if( a[i] != 0) {
				temp[j] = a[i];
				j++;
			}
		}
		for(int k = j; k < a.length; k++) {
			temp[k]=0;
		}
		//System.out.print("Array after moving zeros : ");
		for(int i=0; i<a.length; i++)
			a[i]=temp[i];
	}
	
	static void moveZeros(int a[]) {
		int temp=0;
		for(int i=0; i < a.length ; i++) {
			if(a[i] == 0) {
				for(int j=i+1; j < a.length; j++) {
					if(a[j] != 0)
						{
						temp = a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
						}
				}
			}
		}
	}
	
	static void moveZerosEffectively(int a[]) {
		int count = 0, temp=0;
		for(int i=0; i < a.length; i++) {
			if(a[i] != 0) {
				temp=a[count];
				a[count]=a[i];
				a[i]=temp;
				count++;
			}
		}
	}
	

}
