package com.stack.operation;

public interface Stack<S> {
	int SIZE = 6;
	
	void push(S ele);
	S pop();
	void showStack();
	boolean isEmpty();
	boolean isFull();
	S peekStack();
}
