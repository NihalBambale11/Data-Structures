package com.dlist.operation;

import com.dlist.exception.ResourseNotFoundException;

public class DoublyLinkedList implements DoublyList {
	
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
	public DoublyLinkedList() {
		head  = null;
	}
	
	@Override
	public void addAtFront(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			newNode.next = null;
			newNode.prev = null;
			head = newNode;
			return ;
		}
		
		newNode.next = head;
		head.prev  = newNode;
		head = newNode;
		
	}

	@Override
	public void addAtRear(int data) {
		Node newNode = new Node();
		newNode.data =data;
		
		if(isEmpty()) {
			newNode.next = null;
			newNode.prev = null;
			head  = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp= temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
		
		
		
	}

	@Override
	public void addAtPos(int data, int pos) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			head = newNode;
			return;
		}
		 
		Node temp = head;
		 int i = 0;
		 while(i < pos-1) {
			 temp = temp.next;
			 i++;
		 }
		 
		 newNode.next = temp.next;
		 newNode.prev = temp;
		 temp.next.prev = newNode;
		 temp.next =  newNode;
		
	}

	@Override
	public void showDoublyLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +"<->");
			temp = temp.next;
		}
		System.out.println();
	}

	@Override
	public int deleteAtFront() {
		
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List Is Empty");
		}
		
		int x = head.data;
		head = head.next;
		head.prev = null;
		
		return x;
	}

	@Override
	public int deleteAtRear() {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		int y = temp.data;
		temp.prev.next= null;
		return y;
	}

	@Override
	public int deleteAtPos(int pos) {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		
		int i =0;
		Node temp = head;
		while(i < pos ) {
			temp = temp.next;
			i++;
		}
		
		int z = temp.data;
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		
		return z;
		
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void sortedInsert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		while(curr != null) {
			if(curr.data > newNode.data) {
				break;
			}
			curr = curr.next;
		}
		
		// the node will insert at Front
		if(curr == head) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		else {
			// Insert at Position;
			if(curr != null) {
				newNode.prev = curr.prev;
				newNode.next = curr;
				curr.prev.next = newNode;
				curr.prev = newNode;
			}
			else {
				/// insert at the end;
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
				newNode.prev = temp;
			}
		}
				
	}

	@Override
	public void sortedDelete(int data) {
		Node temp = head;
		while(temp != null) {
			if(temp.next.data == data) {
				break;
			}
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

}
