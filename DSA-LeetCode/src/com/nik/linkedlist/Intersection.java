package com.nik.linkedlist;

import java.util.HashSet;

public class Intersection {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curA = headA, curB = headB;
        HashSet<ListNode> set = new HashSet<>();
        
        while(curA != null){
            set.add(curA);
            curA=curA.next;
        }
        
        while(curB != null){
            if(set.contains(curB)){
                return curB;
            }
            curB=curB.next;
        }
        return null;
        
    }
}
