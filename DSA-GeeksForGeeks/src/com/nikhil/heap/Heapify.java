package com.nikhil.heap;


public class Heapify {
	
	static class Heap {

		int arr[];
		int size, cap;

		Heap(int c) {
			arr = new int[c];
			size = 0;
			cap = c;
		}

		int left(int i) {
			return 2 * i + 1;
		}

		int right(int i) {
			return 2 * i + 2;
		}

		int parent(int i) {
			return (int) Math.floor((i - 1) / 2);
		}

		void InsertMinHeap(int x) {
			if (size == cap)
				return;
			size++;
			arr[size - 1] = x;

			int i = size - 1;
			while (x < arr[parent(i)] && x != 0) {
				int t = x;
				arr[i] = arr[parent(i)];
				arr[parent(i)] = x;
				i = parent(i);
			}
		}

		void InsertInHeap(int x) {
			if (size == cap)
				return;
			size++;
			arr[size - 1] = x;
		}
		
		void checkMinHeap(int[] a, int i) {
			
			int smallest=i;

			 if( left(i) < size && a[left(i)] < a[i]) {
				smallest=left(i);
			 }
			 if(  right(i) < size && a[smallest] > a[right(i)]) {
				 smallest=right(i);
			 }
			 if(smallest!=i) {
				 int t=a[i];
				 a[i] = a[smallest];
				 a[smallest]=t;
				 checkMinHeap(a,smallest);
			 }
		
		}
	

	public static void main(String[] args) {
		Heap myHeap = new Heap(10);

		myHeap.InsertInHeap(40);
		myHeap.InsertInHeap(20);
		myHeap.InsertInHeap(30);
		myHeap.InsertInHeap(35);
		myHeap.InsertInHeap(25);
		myHeap.InsertInHeap(80);
		myHeap.InsertInHeap(32);
		myHeap.InsertInHeap(100);
		myHeap.InsertInHeap(70);
		myHeap.InsertInHeap(60);

		for (int a : myHeap.arr)
			System.out.print(a + " ");
		
		myHeap.checkMinHeap(myHeap.arr, 0);
		System.out.println();
		
		for (int a : myHeap.arr)
			System.out.print(a + " ");

	}	

	
	}
}
