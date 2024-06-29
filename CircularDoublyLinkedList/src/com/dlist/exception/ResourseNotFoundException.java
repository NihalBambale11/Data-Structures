package com.dlist.exception;

public class ResourseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(String mess) {
		super(mess);
	}
}
