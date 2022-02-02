package com.nikhil.linkedlist;

import com.nikhil.linkedlist.LinkedList.Node;

public class RemoveNthFromEnd {
	
	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
	static void printListRecursion(ListNode head) {
		if( head == null) return;
		
		System.out.print(head.val+" ");
		printListRecursion(head.next);
	}
	
	public static void main(String[] args) {
		ListNode head= new ListNode(1);
		ListNode h2= new ListNode(2);
		head.next=h2;
		ListNode h3= new ListNode(3);
		h2.next=h3;
		ListNode h4= new ListNode(4);
		h3.next=h4;
		ListNode h5= new ListNode(5);
		h4.next=h5;
		
		ListNode head2= new ListNode(10);

		
		printListRecursion(head);
		System.out.println();
		ListNode d= removeNthFromEnd(head,2);
		System.out.println(d.val);

		ListNode del= removeNthFromEnd(head2,1);
		System.out.println(del);


	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
      return null;
    }
}
