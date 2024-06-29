package com.list.operation;

import com.list.exception.EmptyLinkedListException;

public class GenericLinkedList<L> implements LinkedList<L> {

	class Node {
		L data;
		Node next;
	}

	Node head;

	public GenericLinkedList() {
		this.head = null;
	}

	@Override
	public void insertAtFront(L data) {
		Node newNode = new Node();

		// When new Node Arrived For the first time ;
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void insertAtEnd(L data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (isEmpty()) {
			head = newNode;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = null;

	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public L deleteFromFront() {
		if (isEmpty()) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}
		L d = head.data;
		head = head.next;
		return d;
	}

	@Override
	public L deleteFromRear() {
		if (isEmpty()) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}

		L y = temp.next.data;
		temp.next = null;
		return y;

	}

	@Override
	public void showLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();

	}

	@Override
	public void insertAtPosition(L data, int pos) {
		Node temp = head;
		int i = 0;
		while (i < pos - 1) {
			temp = temp.next;
			i++;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = temp.next;
		temp.next = newNode;

	}

	@Override
	public L deleteFromPosition(int pos) {
		Node temp = head;
		Node prev = null;
		int i = 0;
		while (i < pos) {
			prev = temp;
			temp = temp.next;
			i++;
		}

		prev.next = temp.next;
		L w = temp.data;
		return w;
	}

	@Override
	public int sumOfAllNodes() {
		Node temp = head;
		int sum = 0;
		while (temp.next != null) {
			int x = (int) temp.data;
			sum = sum + x;
			temp = temp.next;
		}
		return sum;
	}

	@Override
	public void reverseLinkedList() {
		Node prevNode = null;
		Node currentNode = head;
		Node nextNode = head;
		while (nextNode != null) {
			nextNode = nextNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}

		head = prevNode;
	}

}
