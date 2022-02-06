package com.nik.tree;

import java.util.*;

public class ZigZagTraversal {

	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> res= new LinkedList<>();
        
        if(root==null) return new LinkedList<>();
        
        Stack<TreeNode> s1= new Stack<>();
        Stack<TreeNode> s2= new Stack<>();
        
        List<Integer> list= new LinkedList<Integer>();
        
        s1.add(root);
        list.add(root.val);
        //res.add(list);
        
        List<Integer> l1= new LinkedList<Integer>();

        
        while(!s1.isEmpty() || !s2.isEmpty()){ 
            
            while (!s1.empty()) { 
                TreeNode temp = s1.peek(); 
                l1.add(temp.val);
                s1.pop(); 
                System.out.print(temp.val + " "); 

                if (temp.left != null) 
                    s2.add(temp.left); 
                if (temp.right != null) 
                    s2.add(temp.right); 
            }
            System.out.println();
            if(!l1.isEmpty()) res.add(l1);
            l1 = new LinkedList<Integer>();
  
            while (!s2.empty()) { 
                TreeNode temp = s2.peek(); 
                l1.add(temp.val);

                s2.pop(); 
                System.out.print(temp.val + " "); 
  
                
                if (temp.right != null) 
                    s1.add(temp.right); 
                if (temp.left != null) 
                    s1.add(temp.left); 
            }
            System.out.println();
            if(!l1.isEmpty()) res.add(l1);
            l1 = new LinkedList<Integer>();
        }
        
       
        return res;
    }
}
