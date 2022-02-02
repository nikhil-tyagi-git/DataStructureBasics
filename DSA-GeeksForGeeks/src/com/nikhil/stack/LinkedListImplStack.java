package com.nikhil.stack;

class Node{
	int data;
	Node next;
	
	Node(int x){
		data=x;
		next=null;
	}
}

public class LinkedListImplStack {
	
	Node head;
	int size;
	
	LinkedListImplStack(){
		head = null;
		size=0;
	}
	
	void push(int n) {
		Node temp = new Node(n);
		temp.next=head;
		head=temp;
		size++;
	}
	
	int pop() {
		if(head == null) throw new StackOverflowError();
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}
	
	int size() {
		return size;
	}
	
	int peek() {
		if(head == null) throw new StackOverflowError();
		int res = head.data;
		return res;
	}
	
	boolean isEmpty() {
		return (size == 0);
	}
		
	public static void main(String[] args) {
		LinkedListImplStack st= new LinkedListImplStack();
		st.push(33);
		System.out.println(st.peek());
		st.push(32);
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.push(31);
		System.out.println(st.peek());
	}

}
