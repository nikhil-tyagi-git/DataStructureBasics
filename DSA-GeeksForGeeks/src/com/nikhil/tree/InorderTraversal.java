package com.nikhil.tree;

public class InorderTraversal {

	static class Node {
		Node left;
		Node right;
		int data;
		
		Node(int d){
			data=d;
		}
	}
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left= new Node(20);
		root.right= new Node(30);
		root.right.left= new Node(40);
    	root.right.right=new Node(50);
		
    	inOrder(root);
	}

    public static void inOrder(Node root){
    	if(root!=null) {
    		inOrder(root.left);
    		System.out.print(root.data);
    		inOrder(root.right);
    	}
    }

}
