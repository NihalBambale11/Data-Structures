package com.cdlist.tester;

import java.util.Scanner;

import com.cdlist.operation.CircularList;
import com.cdlist.operation.CircularLinkedList;



public class CircularLinkedListTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CircularList clist = new CircularLinkedList();
		
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
					clist.insertAtFront(fdata);
					break;
					
				case 2:
					System.out.println("Enter the Data to add at Rear");
					int rdata = scan.nextInt();
					clist.insertAtRear(rdata);
					break;
				
				case 3:
					System.out.println("Enter the Position where you want to Insert Data");
					int pos = scan.nextInt();
					System.out.println("Enter the Data to add at Position");
					int pdata = scan.nextInt();
					clist.insertAtPosition(pdata, pos);
					break;
				
				case 4:
					int x = clist.deleteFromFront();;
					System.out.println("The Data Deleted From the Front of the List was "+x);
					break;
				
				case 5:
					int y = clist.deleteFromRear();
					System.out.println("The Data Deleted From the Rear of the List was "+y);
					break;
				
				case 6:
					System.out.println("Enter the position to Delete the node");
					int dpos = scan.nextInt();
					clist.deleterAtPosition(dpos);
					break;
				
				case 7:
					System.out.println("Enter the Data for Sorting Insertion ");
					int idata = scan.nextInt();
					clist.sortedInsert(idata);
					break;
//				
//				case 8:
//					System.out.println("Enter the Data which you want to Delete");
//					int ddata = scan.nextInt();
//					clist.sortedDelete(ddata);
//					break;
										
			   case 9:
				   clist.showCircularLinkedList();
				   break;
			}
			
		}while(choice != 10);
	}
}
