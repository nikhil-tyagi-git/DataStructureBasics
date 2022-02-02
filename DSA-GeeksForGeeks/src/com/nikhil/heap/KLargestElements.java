package com.nikhil.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int a[]= {8,6,4,10,9};
		for(int i : a) {
			pq.add(i);
		}
		
		int k=3;
		
		for(int i=0; i<k; i++) {
			System.out.println(pq.poll());
		}
	}

}
