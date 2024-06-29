package com.cdlist.operation;
import com.dlist.exception.ResourseNotFoundException;

public class CircularLinkedList implements CircularList{
	
	
	class Node{
		int data;
		Node next;
		
//		Node(){
//			next = null;
//		}
	}
	
	Node head;
	public  CircularLinkedList() {
	
		head  = null;
	}
	
	@Override
	public void insertAtFront(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		newNode.next = head;

		temp.next = newNode;
		head = newNode;
	}

	@Override
	public void insertAtRear(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.next =head;
	}

	@Override
	public void insertAtPosition(int data,int pos) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node temp = head;
		int i= 0;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
	}

	@Override
	public int deleteFromFront() {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		
		Node temp  = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		int x = temp.next.data ;
		temp.next = head;
		head = head.next;
		return x;
	}

	@Override
	public int deleteFromRear() {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		Node temp = head;
		while( temp.next.next  != head) {
			temp = temp.next;
		}
		//Node lastNode = temp.next;
        //int data = lastNode.data;

        temp.next = head;

        //lastNode.next = null;

        return 0;
	}

	@Override
	public void deleterAtPosition(int pos) {
		if(isEmpty()) {
			throw new ResourseNotFoundException("Linked List is Empty");
		}
		
		Node temp = head;
		Node prev = null;
		int i  =0;
		while(i < pos-1) {
			prev =temp;
			temp = temp.next;
			i++;
		}
		
		prev.next = temp.next;
		
		
		
		
	}

	@Override
	public void showCircularLinkedList() {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
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
			return;
		}
		
		if(newNode.data <= head.data) {
			Node temp = head;
			while(temp != head) {
				temp = temp.next;
			}
			
			newNode.next = head;
			newNode.next = newNode;
			head = newNode;
			return;
			
		}
		
		//Insert in between the Nodes;
		Node curr = head;
		while(curr.next != head) {
			if(curr.next.data > newNode.data) {
				break;
			}
			curr = curr.next;
		}
		
		if(curr != null) {
			newNode.next = curr.next;
			curr.next = newNode;
		}
//		else {
//			curr.next = newNode;
//			newNode.next =head;
//		}
		
	}

}
