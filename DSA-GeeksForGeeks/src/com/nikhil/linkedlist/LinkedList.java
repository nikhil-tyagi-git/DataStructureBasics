package com.nikhil.linkedlist;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
		
	public void printListRecursion(Node head) {
		if( head == null) return;
		
		System.out.print(head.data+" ");
		printListRecursion(head.next);
	}
	
	public void insertInStart(Node first, int d) {
		Node n = new Node(d); 
		head = n;
		head.next=first;
	}
	
	public void insertAtEnd(Node first, int d) {
		Node n = new Node(d);
		if(head == null) {
			head = n;
			return;
		}
		while(first.next != null) {
			first=first.next;
		}
		first.next=n;
	}
		
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		LinkedList l2 = new LinkedList();
		Node n1= new Node(10);
		l.head=n1;
		Node n2= new Node(20);
		n1.next=n2;
		Node n3= new Node(25);
		n2.next=n3;
		
		l.insertInStart(l.head,4);
		l.insertAtEnd(l.head, 55);
		l.printList();
		System.out.println();
		l2.insertInStart(l2.head,4);
		l2.insertInStart(l2.head,3);
		l2.insertInStart(l2.head,2);
		l2.insertAtEnd(l2.head, 10);
		l2.insertAtEnd(l2.head, 14);
		l2.insertAtEnd(l2.head, 127);
		l2.printListRecursion(l2.head);
		
		
	}

}
