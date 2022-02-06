package com.nik.linkedlist;

public class AddNumber {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode curr=head;
        int c=0;
        
        while(l1!=null && l2!=null){
            
            int v = l1.val+l2.val+c;
            if(head==null){
                head= new ListNode(v%10);
                curr=head;
            }
            else{
                ListNode temp = new ListNode(v%10 );
                curr.next=temp;
                curr=curr.next;
            }
            
            if(v > 9){
                c= v/10;
            }
            else{
                c=0;
            }
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null){
            int v = l1.val+c;
            if(head==null){
                head= new ListNode( v % 10);
                curr=head;
            }
            else{
                ListNode temp = new ListNode((v) % 10);
                curr.next=temp;
                curr=curr.next;
            }
            if(v > 9){
                c= v/10;
            }
            else{
                c=0;
            }
            
            l1=l1.next;
        }
        while(l2!=null){
            int v = l2.val+c;
            if(head==null){
                head= new ListNode((v) % 10);
                curr=head;
            }
            else{
                ListNode temp = new ListNode((v) % 10);
                curr.next=temp;
                curr=curr.next;
            }
            if(v > 9){
                c= v/10;
            }
            else{
                c=0;
            }
            l2=l2.next;
        }
        
        if(c > 0){
            ListNode temp = new ListNode((c));
                curr.next=temp;
                curr=curr.next;
        }
        
        
        return head;
    }

}
