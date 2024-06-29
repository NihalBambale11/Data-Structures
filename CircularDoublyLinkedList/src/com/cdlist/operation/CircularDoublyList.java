package com.cdlist.operation;

public interface CircularDoublyList {
	void insertAtFront(int data);
	void insertAtRear(int data);
	void insertAtPosition(int data ,int pos);
	
	int deleteFromFront();        
	int deleteFromRear();
	void deleterAtPosition(int pos);
	
	void showDoublyCircularLinkedList();
	boolean isEmpty();
	void sortedInsert(int idata);
	void deleteNode(int data);

}