package com.nikhil.stack;

import java.util.ArrayList;

public class StackUsingArrayList {

	ArrayList<Integer> a = new ArrayList<>();
	
	void push(int n) {
		a.add(n);
	}
	
	int pop() {
		int res = a.get(a.size()-1);
		a.remove(a.size()-1);
		return res;
	}
	
	int size() {
		return a.size();
	}
	
	int peek() {
		return a.get(a.size()-1);
	}
	
	boolean isEmpty() {
		return (a.isEmpty());
	}
			
	public static void main(String[] args) {

		StackUsingArrayList st = new StackUsingArrayList();
		st.push(33);
		System.out.println(st.peek());
		st.push(32);
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.push(31);
		System.out.println(st.peek());
	}

}
