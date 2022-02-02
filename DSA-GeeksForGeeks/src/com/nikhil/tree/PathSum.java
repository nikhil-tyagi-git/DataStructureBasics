package com.nikhil.tree;

import java.util.HashMap;
import java.util.Map;

class Node  
{ 
  int val; 
  Node left; 
  Node right; 
  Node(int k){
	  val=k;
      left=right=null;
  }
}

public class PathSum {


	public static void main(String[] args) {

		Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
//    	boolean res = hasPathSum(root, 80,0);
    	
    	Map<Integer,Integer> m= new HashMap<>();
    	
	}
	
	/*
	 * static public boolean hasPathSum(Node root, int targetSum, int sum) {
	 * 
	 * if(root == null) return false;
	 * 
	 * if(root.left==null && root.right==null && root.val == targetSum) return true;
	 * else if(root.left==null && root.right==null && root.val != targetSum) return
	 * false;
	 * 
	 * if(root.left != null) sum+=root.left.val; if(root.right != null)
	 * sum+=root.right.val;
	 * 
	 * return true; }
	 * 
	 */
}
