package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTreeImplementation implements BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;

		Node() {
			left = null;
			right = null;
		}

		public int getData() {
			return data;
		}

	}

	Node root;

	public BinarySearchTreeImplementation() {
		root = null;
	}

	@Override
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (root == null) {
			root = newNode;
		} else {
			Node trav = root;
			while (true) {
				if (newNode.data < trav.data) {
					if (trav.left != null) {
						trav = trav.left;
					} else {
						trav.left = newNode;
						break;
					}
				} else {
					if (trav.right != null) {
						trav = trav.right;
					} else {
						trav.right = newNode;
						break;
					}
				}
			}
		}
	}

	// PRE-ORDER TRAVERSAL

	public void preOrder(Node trav) {
		if (trav == null) {
			return;
		}
		System.out.print(trav.data + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	@Override
	public void preOrder() {
		System.out.println("Pre Order : ");
		preOrder(root);
		System.out.println();
	}

	// POST-ORDER TRAVERSAL

	public void postOrder(Node trav) {
		if (trav == null) {
			return;
		}
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	@Override
	public void postOrder() {
		System.out.println("Post Order : ");
		postOrder(root);
		System.out.println();

	}

	// IN-ORDER TRAVERSAL

	public void inOrder(Node trav) {
		if (trav == null) {
			return;
		}
		inOrder(trav.left);
		System.out.print(trav.data + " ");
		inOrder(trav.right);
	}

	@Override
	public void inOrder() {
		System.out.println("In Order : ");
		inOrder(root);
		System.out.println();
	}

	// Delete All Node

	public void deleteAllNode(Node trav) {
		if (trav == null) {
			return;
		}

		deleteAllNode(trav.left);
		deleteAllNode(trav.right);
		trav.left = null;
		trav.right = null;
		trav = null;
	}

	@Override
	public void deleteAllNode() {
		deleteAllNode(root);
		root = null;
	}

	// Height of the Three

	public int heightOfTree(Node trav) {
		if (trav == null) {
			return -1;
		}

		int hl = heightOfTree(trav.left);
		int hr = heightOfTree(trav.right);
		int max;
		if (hl > hr) {
			max = hl;
		} else {
			max = hr;
		}
		return max + 1;
	}

	@Override
	public int heightOfTree() {

		return heightOfTree(root);
	}

	// BREADTH FIRST SEARCH

	@Override
	public Node breadthFirstSearch(int val) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			Node trav = queue.poll();
			if (val == trav.data) {
				return trav;
			}
			if (trav.left != null) {
				queue.offer(trav.left);
			}
			if (trav.right != null) {
				queue.offer(trav.right);
			}
		}
		return null;
	}
	
	//DEPTH FIRST SEARCH

	@Override
	public Node depthFirstSearch(int data) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node trav = stack.pop();
			if (data == trav.data) {
				return trav;
			}
			if (trav.right != null) {
				stack.push(trav.right);
			}
			if (trav.left != null) {
				stack.push(trav.left);
			}

		}
		return null;
	}
	
	// BINARY SEARCH IN TREE 
	
	@Override
	public Node binarySearch(int data2) {
		Node trav = root;
		while (trav != null) {
			if (trav.data == data2) {
				return trav;
			}
			if (trav.data > data2) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		return null;
	}

	@Override
	public Node[] binarySearchWithParent(int data3) {
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			if(trav.data == data3) {
				return new Node[] {trav ,parent};
			}
			parent = trav;
			if(trav.data > data3) {
				trav = trav.left;
			}
			else {
				trav = trav.right;
			}
		}
		return new Node [] {null ,null};
	}

	@Override
	public void deleteNode(int del) {
		Node trav ,parent;
		
		//find the node to be deleted along with its parent
		Node [] arr  = binarySearchWithParent(del);
		trav = arr[0];
		parent = arr[1];
		
		//if  node is not find found throw the exception
		if(trav == null) {
			throw new RuntimeException("Node not Found");
		}
		
		//if node has left as well as right child
		if(trav.left != null && trav.right != null) {
			
			// find its successor with its parent
			parent = trav;
			Node succ = trav.right;
			while(succ.left != null) {
				parent =  succ;
				succ = succ.left;
			}
			
			// overwrite data of  node with successor data
			trav.data = succ.data;
			
			// mark successor node to be deleted
			trav = succ;
		}
		
		//if node has right child (or node doesn't have left  child)
		if(trav.left == null) {
			if(trav == root) {
				root = trav.right;
			}
			else if(trav == parent.left) {
				parent.left = trav.right;
			}
			else  {
				parent.right = trav.right;
			}
		}
		
		//if(node has left child (or node doesn't have right child);
		else if(trav.right == null) {
			if(trav == root) {
				root = trav.left;
			}
			else if(trav == parent.left) {
				parent.left = trav.left;
			}
			else  {
				parent.right = trav.left;
			}
		}
		
	}
	
	
	
}
