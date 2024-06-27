package com.stack.tester;

import java.util.Scanner;
import com.stack.operation.Stack;

import com.stack.operation.Growable_Generic_Stack;
 
public class StackTester {
	public static <S> void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack stack = new Growable_Generic_Stack();
		int choice;
		System.out.println("1. Push In Stack \n"
				+ "2. Pop From Stack \n"
				+ "3. Peek In Stack \n"
				+ "4. Show Stack \n");
		do {
			System.out.print("Enter the Choice from the menu  : ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter the Data : ");
				S ele = (S) scan.next();
				stack.push(ele);
				break;
				
			case 2:
				S pop = (S) stack.pop();
				System.out.println("Poped Element was :  "+ pop);
				break;
			
			case 3:
				S peek  = (S) stack.peekStack();
				System.out.println("Element on the top of the Stack is : "+peek);
				break;
				
				
			case 4:
				stack.showStack();
				break;
			}
			
		}while(choice != 5);
	}
}
