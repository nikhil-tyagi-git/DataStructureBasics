package com.nik;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinaryTree {

	Node root;

	public BinaryTree(int item) {
		root = new Node(item);
	}

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(3);
		System.out.println(tree.root.key);
		tree.root.left = new Node(6);
	}
}
