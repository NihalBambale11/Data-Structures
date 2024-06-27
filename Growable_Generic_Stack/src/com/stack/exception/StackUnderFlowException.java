package com.stack.exception;

public class StackUnderFlowException extends RuntimeException {

	private static final long serialVersionUID = 2282151614565149729L;

	public StackUnderFlowException(String message) {
		super(message);
	}
}
