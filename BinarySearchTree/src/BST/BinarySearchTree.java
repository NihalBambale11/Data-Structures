package BST;

import BST.BinarySearchTreeImplementation.Node;

public interface BinarySearchTree {
	void add(int data);
	void preOrder();
	void postOrder();
	void inOrder();
	void deleteAllNode();
	int heightOfTree();
	Node breadthFirstSearch(int val);
	Node depthFirstSearch(int data);
	Node binarySearch(int data2);
	Node[] binarySearchWithParent(int data3);
	
	void deleteNode(int del);
}
