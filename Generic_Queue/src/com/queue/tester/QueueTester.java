package com.queue.tester;

import java.util.Scanner;
import com.queue.operation.Generic_Queue;
import com.queue.operation.Queue;
 
public class QueueTester {
	public static <Q> void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue queue = new Generic_Queue<Q>();
		int choice;
		System.out.println("1. Enqueue in Queue \n"
				+ "2. Dequeue From Queue  \n"
				+ "3. Show Queue \n");
		do {
			System.out.print("Enter the Choice from the menu  : ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter the Data : ");
				Q ele = (Q) scan.next();
				queue.enqueue(ele);
				break;
				
			case 2:
				Q pop = (Q) queue.dequeue();
				System.out.println("Dequeued Element was :  "+ pop);
				break;
			
			case 3:
				queue.showQueue(); 
				break;
			}
			
		}while(choice != 4);
	}
}
