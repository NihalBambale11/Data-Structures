package com.stack.operation;

import com.stack.exception.StackUnderFlowException;

public class Growable_Generic_Stack<S> implements Stack<S>{
	
	private int size = SIZE;
	private S[] stack =  (S[]) new Object[size];
	private int top = -1 ;
	

	@Override
	public void push(S ele) {
		if(isFull()) {
			S [] temp = (S[]) new Object[size * 2] ;
			for(int i = 0 ; i < size; i++) {
				temp[i] = stack[i];
			}
			
			stack = temp;
		}
		top++;
		stack[top] = ele;
		
	}

	@Override
	public S pop() {
		if(isEmpty()) {
			throw new StackUnderFlowException("Stack is Empty");
		}
		
		S poped = stack[top];
		stack[top]= null; 
		top--;
		return poped;
		
	}
	
	@Override
	public S peekStack() {
		
		return stack[top];
		 
	}


	@Override
	public void showStack() {
		for(S s : stack) {
			System.out.println(s + " ");
		}
		
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == size-1) {
			return true;
		}
		return false;
	}


}
