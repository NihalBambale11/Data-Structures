package com.dlist.tester;

import java.util.Scanner;

import com.dlist.operation.DoublyLinkedList;
import com.dlist.operation.DoublyList;

public class DoublyLinkedListTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DoublyList dlist = new DoublyLinkedList();
		
		int choice;
		System.out.println("1. Insert At Front \n"
				+ "2. Insert At Rear \n"
				+ "3. Insert At Front \n"
				+ "4. Delete From Front \n"
				+ "5. Delete From Rear \n"
				+ "6. Delete From Position \n"
				+ "7. Insert Sorted Linked List \n"
				+ "8. Delete Node for given data \n"
				+ "9. Show Double Linked List \n");
		
		do {
			System.out.println("Enter the Choice ");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter the Data to add at Front");
					int fdata = scan.nextInt();
					dlist.addAtFront(fdata);
					break;
					
				case 2:
					System.out.println("Enter the Data to add at Rear");
					int rdata = scan.nextInt();
					dlist.addAtRear(rdata);
					break;
				
				case 3:
					System.out.println("Enter the Position where you want to Insert Data");
					int pos = scan.nextInt();
					System.out.println("Enter the Data to add at Position");
					int pdata = scan.nextInt();
					dlist.addAtPos( pdata ,pos);
					break;
				
				case 4:
					int x = dlist.deleteAtFront();
					System.out.println("The Data Deleted From the Front of the List was "+x);
					break;
				
				case 5:
					int y = dlist.deleteAtRear();
					System.out.println("The Data Deleted From the Rear of the List was "+y);
					break;
				
				case 6:
					System.out.println("Enter the position to Delete the node");
					int dpos = scan.nextInt();
					dlist.deleteAtPos(dpos);
					break;
				
				case 7:
					System.out.println("Enter the Data for Sorting Insertion ");
					int idata = scan.nextInt();
					dlist.sortedInsert(idata);
					break;
				
				case 8:
					System.out.println("Enter the Data which you want to Delete");
					int ddata = scan.nextInt();
					dlist.sortedDelete(ddata);
					break;
										
			   case 9:
				   dlist.showDoublyLinkedList();
				   break;
			}
			
		}while(choice != 10);
	}
}
