package com.queue.operation;

public interface Queue<Q> {
	int SIZE = 5;
	
	void enqueue(Q ele);
	Q dequeue();
	void showQueue();
	boolean  isEmpty();
	boolean isFull();
	
}
