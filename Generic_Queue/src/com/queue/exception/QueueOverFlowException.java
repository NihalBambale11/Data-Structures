package com.queue.exception;

public class QueueOverFlowException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public QueueOverFlowException(String message) {
		super(message);
	}
}
