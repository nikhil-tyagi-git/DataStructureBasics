package com.nikhil.linkedlist;

import com.nikhil.linkedlist.LinkedList.Node;

public class ReverseLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	static Node reverseList(Node head)
    {
        // code here
        Node prev =null, next=null,curr=head;
        while(curr.next != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            //head=head.next;
        }
        curr.next=prev;
        return curr;
    }
	public static void printList(Node head) {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n=n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1= new Node(10);
		
		Node n2= new Node(20);
		n1.next=n2;
		Node n3= new Node(30);
		n2.next=n3;
		Node n4= new Node(40);
		n3.next=n4;
		Node n5= new Node(50);
		n4.next=n5;
		
		printList(n1);
		Node n=reverseList(n1);
		System.out.println();
		printList(n);
		
	}

}
