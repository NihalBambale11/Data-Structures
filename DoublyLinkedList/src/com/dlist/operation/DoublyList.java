package com.dlist.operation;

public interface DoublyList {
	void addAtFront(int data);
	void addAtRear(int data);
	void addAtPos(int data , int pos);
	void sortedInsert(int data);
	
	void showDoublyLinkedList();
	
	int deleteAtFront();
	int deleteAtRear();
	int deleteAtPos(int pos);
	void sortedDelete(int data);
	
	boolean isEmpty();
}
