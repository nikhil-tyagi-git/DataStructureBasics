package com.nikhil.linkedlist;

import com.nikhil.linkedlist.LinkedList.Node;

public class MiddleOfLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
		}
	}
	
	void printList() {
		Node n = head;
		if(n == null) System.out.println("Empty");
		while(n != null) {
			System.out.print(" "+n.data+" ");
			n=n.next;
		}
		
	}
	
	void findMiddle() {
		Node n1=head;
		Node n2=head;
		while(n2.next != null) {
			n1=n1.next;
			if(n2.next.next != null)
			n2=n2.next.next;
			else break;
		}
		System.out.println("\n Middle : "+n1.data);
	}

	public static void main(String[] args) {
		MiddleOfLinkedList l = new MiddleOfLinkedList();
		MiddleOfLinkedList l2 = new MiddleOfLinkedList();
		Node n1= new Node(10);
		l.head=n1;
		Node n2= new Node(11);
		n1.next=n2;
		Node n3= new Node(12);
		n2.next=n3;
		Node n4= new Node(13);
		n3.next=n4;
		Node n5= new Node(14);
		n4.next=n5;
		Node n6= new Node(15);
		n5.next=n6;
		l.printList();
		l.findMiddle();
	}

}
