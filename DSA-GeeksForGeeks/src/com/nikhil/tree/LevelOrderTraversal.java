package com.nikhil.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.nikhil.tree.InorderTraversal.Node;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left= new Node(20);
		root.right= new Node(30);
		root.left.right=new Node(55);
		root.left.right.left=new Node(2);
		root.right.left= new Node(40);
    	root.right.right=new Node(50);
		
    	levelOrder(root);
	}
	
	public static void levelOrder(Node root){
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node curr= q.poll();
			System.out.println(curr.data);
			if(curr.left!=null) q.add(curr.left);
			if(curr.right!=null) q.add(curr.right);
		}
	}

}
