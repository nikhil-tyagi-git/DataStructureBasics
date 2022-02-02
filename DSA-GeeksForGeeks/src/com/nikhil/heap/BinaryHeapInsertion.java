package com.nikhil.heap;

public class BinaryHeapInsertion {

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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap myHeap = new Heap(10);

		myHeap.InsertMinHeap(10);
		myHeap.InsertMinHeap(20);
		myHeap.InsertMinHeap(15);
		myHeap.InsertMinHeap(40);
		myHeap.InsertMinHeap(50);
		myHeap.InsertMinHeap(100);
		myHeap.InsertMinHeap(25);
		myHeap.InsertMinHeap(45);

		for (int a : myHeap.arr)
			System.out.print(a + " ");

		myHeap.InsertMinHeap(12);
		System.out.println();

		for (int a : myHeap.arr)
			System.out.print(a + " ");
	}

}
