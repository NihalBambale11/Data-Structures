package com.queue.operation;

import com.queue.exception.QueueOverFlowException;
import com.queue.exception.QueueUnderFlowExcpetion;

public class Generic_Queue<Q> implements Queue<Q>{
	private int size = SIZE;
	private Q[] queue = (Q[]) new Object[size];
	int front = -1;
	int rear = -1;
	
	
	@Override
	public void enqueue(Q ele) {
		if(isFull()) {
			throw new QueueOverFlowException("Queue Is FULL");
		}
		rear++;
		queue[rear] = ele;
	}

	@Override
	public Q dequeue() {
		if(isEmpty()) {
			throw new QueueUnderFlowExcpetion("Queue is Empty");
		}
		front++;
		Q deq = queue[front];
		queue[front] = null;
		return deq;
	}

	@Override
	public void showQueue() {
		for(Q q : queue) {
			System.out.print(q + " ");
		}
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if(rear == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == size-1) {
			return true;
		}
		return false;
	}

}
