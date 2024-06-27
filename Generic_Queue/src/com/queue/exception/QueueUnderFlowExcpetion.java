package com.queue.exception;

public class QueueUnderFlowExcpetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public QueueUnderFlowExcpetion(String message) {
			super(message);
	}
}
