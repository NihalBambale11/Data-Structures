package com.cdlist.operation;
import com.dlist.exception.ResourseNotFoundException;

public class CircularDoublyLinkedList implements CircularDoublyList{
	
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(){
			next = null;
			prev = null;
		}
	}
	
	Node head;
	
	public  CircularDoublyLinkedList() {
	
		head  = null;
		
	}
	
	@Override
	public void insertAtFront(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			head = newNode;
			head.next = head;
			head.prev = head;
		}
		else {
			
			Node temp = head.prev;
			
			newNode.next = head;
			newNode.prev = temp;
			
			head.prev =newNode;
			temp.next = newNode;
			head = newNode;
			
		}
		
		
		
	}

	@Override
	public void insertAtRear(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			head = newNode;
			head.next =head;
			head.prev = head;
		}
		else {
			Node temp = head.prev;
			newNode.next = head;
			newNode.prev = temp;
			temp.next = newNode;
			head.prev = newNode;
		}
		
		
	}

	@Override
	public void insertAtPosition(int data,int pos) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node temp = head;
		
		if (isEmpty()) {
            head = newNode;
            head.next = head;
            head.prev = head;
            
		}
		else {
			int i = 0;
			while( i < pos-1) {
				temp = temp.next;
				i++;
			}
			
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next.prev = newNode;
			temp.next = newNode;
			
		}
		
		
	}

	@Override
	public int deleteFromFront() {
		int fdata = head.data;

		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked list is Empty");
		}
		
		if(head.next == head) {
			head = null;
			
		}
		else {
			Node temp = head.prev;
			head= head.next;
			head.prev = temp;
			temp.next = head;
			
			
		
		}
		return fdata;
		
		

		
		
		
		
	}

	@Override
	public int deleteFromRear() {
		
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked list is Empty");
		}
		
		Node temp = head.prev;
		int ldata = temp.data;
		if(head.next == head) {
			head = null;
		}


		
		else {
			Node slast = temp.prev;
			slast.next = temp.next;
			head.prev = slast;
			
		}
		return ldata;

	}

	@Override
	public void deleterAtPosition(int pos) {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		
		Node temp = head;
		
		int i =0 ;
		
		while( i < pos) {
			temp = temp.next;
			i++;
		}
		temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
		
		
		
		
		
		
	}

	@Override
	public void showDoublyCircularLinkedList() {
		Node temp = head;
		do {
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
		
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void sortedInsert(int idata) {
		  
		Node newNode = new Node();
		newNode.data = idata;
		
		if(isEmpty()) {
			head = newNode;
			head.next = head;
			head.prev = head;
			return ;
		}
		
		Node curr = head;
		
		// newNode Node Inserted Before Head(At Front)
		
		if(idata <= head.data) {
			
			Node temp = head.prev;
			
			newNode.next = head;
			newNode.prev = temp;
			
			head.prev =newNode;
			temp.next = newNode;
			head = newNode;
		}
		
		while(curr.next != head) {
			if(curr.next.data > newNode.data) {
				break;
			}
			curr = curr.next;
		}
		
		newNode.next = curr.next;
		newNode.prev = curr;
		curr.next.prev = newNode;
		curr.next = newNode;
				
	}

	@Override
	public void deleteNode(int data) {
		 Node temp = head;
	        if (temp.data == data) {
	            head = head.next;
	            head.prev = temp.prev;
	            temp.prev.next = head;
	            temp.next.prev = head;
	            return;
	        }
	        while (temp.next != head && temp.data != data) {
	            temp = temp.next;
	        }
	        if (temp.data == data) {
	            temp.prev.next = temp.next;
	            temp.next.prev = temp.prev;
	        }
	}     
}
