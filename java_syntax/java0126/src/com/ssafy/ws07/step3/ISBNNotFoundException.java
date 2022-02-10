package com.ssafy.ws07.step3;

public class ISBNNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1989694784751195800L;
	public ISBNNotFoundException() {
		this("없는 ISBN입니다.");
	}
	public ISBNNotFoundException(String message) {
		super(message);
	}
}
