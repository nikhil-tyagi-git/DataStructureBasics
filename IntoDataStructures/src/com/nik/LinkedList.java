package com.nik;

public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printList() {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
	}

	void push(int n) {
		Node p = new Node(n);
		p.next = head;
		head = p;
	}

	void insertAfter(Node prev, int n) {
		if (prev == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node p = new Node(n);
		p.next = prev.next;
		prev.next = p;
	}

	void insertInEnd(int d) {
		Node p = new Node(d);
		if (head == null) {
			head = new Node(d);
			return;
		}
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = p;
	}

	void deleteANode(int d) {
		Node temp = head;
		Node prev = null;
		if (head.data == d) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != d) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;

	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Node firstNode = new Node(4);
		Node secondNode = new Node(6);
		Node thirdNode = new Node(9);

		list.head = firstNode;
		list.head.next = secondNode;
		secondNode.next = thirdNode;

		list.printList();
		list.push(2);
		System.out.println("After Adding in front");
		list.printList();

		list.insertAfter(secondNode, 7);
		System.out.println("Insert After " + secondNode.data);
		list.printList();

		list.insertInEnd(11);
		System.out.println("Insert in the end ");
		list.printList();

		list.deleteANode(7);
		System.out.println("Delete a node ");
		list.printList();

	}

}
