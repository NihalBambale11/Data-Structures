package tester;

import java.util.Scanner;

import BST.BinarySearchTree;
import BST.BinarySearchTreeImplementation;
import BST.BinarySearchTreeImplementation.Node;

public class BinarySearchTreeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTreeImplementation();
		
		int choice ;
		System.out.println("1. Add Data to Tree \n"
				+ "2. PreOrder Traversal \n"
				+ "3. InOrder Traversal \n"
				+ "4. PostOrder Traversal \n"
				+ "5. Delete ALL Node \n"
				+ "6. Height Of Binary Tree\n"
				+ "7. Breadth First Search\n"
				+ "8. Depth First Search \n"
				+ "9. Binary Search \n"
				+ "10. Binary Search With its Parent \n"
				+ "11. Delete Node From Tree");
		
		
		do {
			System.out.println();
			System.out.println("Enter the choice ");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("Enter the data : ");
					int data = scan.nextInt();
					bst.add(data);
					break;
				
				case 2:
					bst.preOrder();
					break;
					
				case 3:
					bst.postOrder();
					break;
					
				case 4:
					bst.inOrder();
					break;
				
				case 5:
					bst.deleteAllNode();
					break;
				
				case 6:
					int h  = bst.heightOfTree();
					System.out.println("Height of Tree :  "+h);
					break;
				
				case 7:
					System.out.println("Enter the node value to be searched ");
					int val = scan.nextInt();
					Node  temp = bst.breadthFirstSearch(val);
					if(temp == null) {
						System.out.println("Element nOt Found");
					}
					else {
						System.out.println( temp.getData() +" Element Found ");
					}
					break;
					
				case 8:
					System.out.println("Enter the node value to be searched ");
					int data1 = scan.nextInt();
					Node  temp1 = bst.depthFirstSearch(data1);
					if(temp1 == null) {
						System.out.println("Element nOt Found");
					}
					else {
						System.out.println( temp1.getData() +" Element Found ");
					}
					break;
					
				case 9:
					System.out.println("Enter the node value to be searched ");
					int data2 = scan.nextInt();
					Node  temp2 = bst.binarySearch(data2);
					if(temp2 == null) {
						System.out.println("Element nOt Found");
					}
					else {
						System.out.println( temp2.getData() +" Element Found ");
					}
					break;
					
				case 10:
					System.out.println("Enter the node value to be searched ");
					int data3 = scan.nextInt();
					Node []  temp3 = bst.binarySearchWithParent(data3);
					if(temp3[0] == null) {
						System.out.println("Element nOt Found ");
					}
					else  {
						System.out.println( temp3[0].getData() +" Element Found ");
					}
					break;
					
				case 11:
					System.out.println("Enter the node value to Be deleted ");
					int del = scan.nextInt();
					bst.deleteNode( del);
					break;
			}
			
		}while(choice != 12);
	
	}
}
