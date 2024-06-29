package com.list.operation;

public interface LinkedList<L> {
	void insertAtFront(L data);
	void insertAtEnd(L data);
	void insertAtPosition(L data, int pos);
	
	boolean isEmpty();
	
	L deleteFromFront();
	L deleteFromRear();
	L deleteFromPosition(int pos);
	void showLinkedList();
	
	int sumOfAllNodes();
	void reverseLinkedList();
}
