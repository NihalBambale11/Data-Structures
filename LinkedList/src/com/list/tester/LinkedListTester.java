package com.list.tester;

import java.util.Scanner;

import com.list.operation.GenericLinkedList;
import com.list.operation.LinkedList;

class LinkedListTester {
	
	public static <L> void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		LinkedList list = new GenericLinkedList();
		int choice;
		System.out.println("1. Insert At Front in Linked List \n"
				+ "2. Insert At Rear in Linked List \n"
				+ "3. Delete From Front in Linked List \n"
				+ "4. Delete From Rear in Linked List \n"
				+ "5. Insert At given Position \n"
				+ "6. Delete At given Position \n"
				
				+ " 7. Display Linked List ");
		
		do {
			System.out.println("Enter the Choice");
			choice = scan.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter the data in the Front of the Linked List");
					L data = (L) scan.next();
					list.insertAtFront(data);
					break;
					
				case 2:
					System.out.println("Enter the data in the Rear of the Linked List");
					L rdata = (L) scan.next();
					list.insertAtEnd(rdata);
					break;
					
				case 3:
					L x = (L) list.deleteFromFront();
					System.out.println("Deleted Node from Front  is :  "+x);
					break;
				
				case 4:
					L y = (L) list.deleteFromRear();
					System.out.println("Deleted Node From Rear is : "+y);
					break;
				
				case 5:
					System.out.println("Enter the data you want to insert ");
					L pdata = (L)scan.next();
					System.out.println("Enter the position");
					int pos = scan.nextInt();
					list.insertAtPosition(pdata,pos);
					break;
				
				case 6:
					System.out.println("Enter the position");
					int dpos = scan.nextInt();
					L z = (L) list.deleteFromPosition(dpos);
					System.out.println("The Deleted Node was " +z);
					break;
				
				case 7:
					int add = list.sumOfAllNodes();
					System.out.println("the sum of Linked list  "+add);
					break;
					
				case 8:
					list.reverseLinkedList();
					break;

				
				case 10:
					list.showLinkedList();
					break;
			}
			
		}while(choice!=11);
	}
}
